package com.cic.utils;

import com.cic.thrift.ad_ret;

import java.util.Comparator;

/**
 * Created by liuyq on 2014/12/18.
 */
public class AdComparator implements Comparator {

    public int compare(Object o1, Object o2) {
        // TODO Auto-generated method stub
        ad_ret c1 = (ad_ret) o1;
        ad_ret c2 = (ad_ret) o2;
        if (c1.getSimilarity() > c2.getSimilarity()) {
            return -1;
        } else {
            if (c1.getSimilarity() == c2.getSimilarity()) {
                return 0;
            } else {
                return 1;
            }
        }
    }
}
