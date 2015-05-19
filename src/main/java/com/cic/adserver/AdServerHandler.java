package com.cic.adserver;
/**
 * Created by liuyq on 2015/5/17.
 */

import com.cic.jdbc.JdbcConnector;
import com.cic.thrift.AdServerService.Iface;
import com.cic.thrift.ad_info;
import com.cic.thrift.ad_ret;
import com.cic.utils.AdComparator;
import com.cic.utils.Similarity;
import com.sun.naming.internal.FactoryEnumeration;

import javax.sql.rowset.JdbcRowSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdServerHandler implements Iface {
    static final public int MAX_NUM = 4;
    static final public String FLAG = "empty";
    static final public String SEG_KEYWORD_KEYWORD = ",";
    static final public String SEG_KEYWORD_BID = ":";
    static final public double BIAS = 1.0;

    static public void pr(String str) {
        System.out.println(str);
    }

    public List<ad_ret> ask4Ads(ad_info info) throws org.apache.thrift.TException {
        System.out.println("---- new query ----");
        String searchWords = info.getSearchWord();
        System.out.println("search word is : " + searchWords);


        String category = info.getCategory();
        ArrayList<String> candidates = adIndex(category);
        System.out.println("candidate len : " + String.valueOf(candidates.size()));

        List<ad_ret> results = adRank(candidates, searchWords);
        System.out.println("ranking len : " + String.valueOf(candidates.size()));
       // for (ad_ret item : results){
        //    System.out.println("ranking item : " + item.getAdid()+"\t"+item.getBid()+"\t"+item.getKeyword());
        //}
        return results;
    }

    public ArrayList<String> adIndex(String category){
        ArrayList<String> candidates = new ArrayList<String>();

        //首先找出相同类目下的广告
        candidates = queryDB(category, true);
        if (candidates.size() >= MAX_NUM) {
            return candidates;
        } else {
            candidates.add(FLAG);
            ArrayList<String> notSameCat = queryDB(category, false);
            for (String item : notSameCat) {
                candidates.add(item);
            }
        }

        return candidates;
    }

    public List<ad_ret> adRank(ArrayList<String> candidates, String searchword) {
        List<ad_ret> results = new ArrayList<ad_ret>();
        for (String item : candidates) {
            pr(item.toString());
        }

        double bias4Cat = 1.0;
        Similarity simlarity = new Similarity();

        for (String item : candidates) {
            //同类别的广告优先级高，如果不是同类的，就不加这个偏置了
            if (item.equals(FLAG)) {
                bias4Cat = 0.0;
                continue;
            }
            String[] sp = item.split("\t");//id, bt, ggjh_id, gjzcj
            ad_ret oneAd = new ad_ret("", 0.0, Integer.valueOf(sp[0]), 0.0);// public ad_ret(String keyword, double bid, int adid, double similarity)

            String[] keywords = sp[3].split(SEG_KEYWORD_KEYWORD);
            String matchword = "";
            double bid = 0.0;
            double max_ecpm = -1.0;
            for (String key_bid : keywords) {
                String[] kb = key_bid.split(SEG_KEYWORD_BID);
                if (kb.length != 2)
                    continue;

                double sim = simlarity.calsim(searchword, kb[0]);
                double ecpm = (BIAS + sim +bias4Cat) * Double.valueOf(kb[1]);
                pr(searchword+"\t"+kb[0]+"\t"+sim+"\t"+ecpm);
                if (ecpm > max_ecpm) {
                    max_ecpm = ecpm;
                    matchword = kb[0];
                    bid = Double.valueOf(kb[1]);
                }
            }
            oneAd.setBid(bid);
            oneAd.setKeyword(matchword);
            oneAd.setSimilarity(max_ecpm);

            results.add(oneAd);
        }
        AdComparator comp = new AdComparator();
        Collections.sort(results, comp);

        if (results.size() >= MAX_NUM)
            results = results.subList(0, 4);

        for (ad_ret ad : results) {
            pr(ad.toString());
        }
        return results;
    }


    public ArrayList<String> queryDB(String category, boolean include) {
        ArrayList<String> ads = new ArrayList<String>();
        JdbcConnector jdbcConn = new JdbcConnector();
        try {
            // 初始化数据库连接(在finally中关闭连接)
            jdbcConn.initial();
            JdbcRowSet jdbcRs = jdbcConn.jdbcRs;
            String sql;
            if (!include) {
                sql = "select id, ggjh_id, bt, gjzcj from ggdy where tfzt=1 and sslm!=\"" + category +"\"";
            } else {
                sql = "select id, ggjh_id, bt, gjzcj from ggdy where tfzt=1 and sslm=\"" + category+"\"";
            }
            pr(sql);
            jdbcRs.setCommand(sql);
            jdbcRs.execute();
            jdbcRs.beforeFirst();

            while (jdbcRs.next()) {
                String id = jdbcRs.getString("id");
                String bt = jdbcRs.getString("bt");
                String ggjh_id = jdbcRs.getString("ggjh_id");
                String gjzcj = jdbcRs.getString("gjzcj");

                //pr(id+"\t"+bt+"\t"+ggjh_id+"\t"+gjzcj);
                ads.add(id+"\t"+bt+"\t"+ggjh_id+"\t"+gjzcj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jdbcConn.close();
        }
        return ads;
    }


    static public void main(String[] args) {
        AdServerHandler handler = new AdServerHandler();
        ad_info info = new ad_info();
        info.setCategory("手机");
        info.setSearchWord("小米");
        try {
            handler.ask4Ads(info);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
