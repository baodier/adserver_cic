package com.cic.adserver;
/**
 * Created by liuyq on 2015/5/17.
 */

import com.cic.thrift.AdServerService.Iface;
import com.cic.thrift.ad_info;
import com.cic.thrift.ad_ret;
import com.sun.naming.internal.FactoryEnumeration;

import java.util.ArrayList;
import java.util.List;

public class AdServerHandler implements Iface {
    static final public int MAX_NUM = 4;

    public List<ad_ret> ask4Ads(ad_info info) throws org.apache.thrift.TException {
        System.out.println("---- new query ----");
        String searchWords = info.getSearchWord();
        System.out.println("search word is : " + searchWords);

        //首先找出相同类目下的广告
        String category = info.getCategory();
        List<ad_ret> candidates = adIndex(searchWords);
        System.out.println("candidate len : " + String.valueOf(candidates.size()));
        adRank(candidates);
        System.out.println("ranking len : " + String.valueOf(candidates.size()));
        for (ad_ret item : candidates){
            System.out.println("ranking item : " + item.getAdid()+"\t"+item.getBid()+"\t"+item.getKeyword());
        }
        return candidates;
    }

    public List<ad_ret> adIndex(String searchWords){
        List<ad_ret> candidates = new ArrayList<ad_ret>();

        return candidates;
    }

    public void adRank(List<ad_ret> candidates) {

    }
}
