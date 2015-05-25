package com.cic.thrift;

/**
 * Created by liuyq on 2015/5/22.
 */
public class ad_ret {
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public double getBid() {
        return bid;
    }

    public void setBid(double bid) {
        this.bid = bid;
    }

    public int getAdid() {
        return adid;
    }

    public void setAdid(int adid) {
        this.adid = adid;
    }

    public double getSimilarity() {
        return similarity;
    }

    public void setSimilarity(double similarity) {
        this.similarity = similarity;
    }

    public String keyword; // required
    public double bid; // required
    public int adid; // required
    public double similarity; // required

    public ad_ret(
            String keyword,
            double bid,
            int adid,
            double similarity)
    {
        this.keyword = keyword;
        this.bid = bid;
        this.adid = adid;
        this.similarity = similarity;
    }
}
