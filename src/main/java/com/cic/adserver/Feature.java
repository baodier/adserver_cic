package com.cic.adserver;

/**
 * Created by liuyq on 2015/5/17.
 */
public class Feature {

    private String adid;//广告单元id
    private int matchType;//0:相等 1：包含 2：相似

    public double getBid() {
        return bid;
    }

    public void setBid(double bid) {
        this.bid = bid;
    }

    private double bid;//出价

    public String getMatchKeyWord() {
        return matchKeyWord;
    }

    public void setMatchKeyWord(String matchKeyWord) {
        this.matchKeyWord = matchKeyWord;
    }

    private String matchKeyWord;//匹配关键词

    public Feature(){
        adid = null;
        matchType = -1;
        bid = 0.0;
        matchKeyWord = "";
    }

    public Feature(String adid, int matchType_tmp, double bid, String keyword){
        this.adid = adid;
        this.matchType = matchType_tmp;
        this.bid = bid;
        this.matchKeyWord = keyword;
    }

    public String toString(){
        return "adid="+adid+"\t"+
                "matchType="+String.valueOf(matchType)+"\t"+
                "bid="+String.valueOf(bid)+
                "matchKeyWord="+matchKeyWord+"\n";
    }
    public String getAdid() {
        return adid;
    }

    public void setAdid(String adid) {
        this.adid = adid;
    }

}