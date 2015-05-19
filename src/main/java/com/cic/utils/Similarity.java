package com.cic.utils;

/**
 * Created by liuyq on 2015/5/19.
 */

public class Similarity {

    public Double calsim(String query, String document) {
        return 1 / (1.0 + levenshteinDistance(query, document));
    }

    protected int levenshteinDistance(String s1, String s2) {
        int matrix[][];
        //System.out.println(s1+"$$"+s2);
        int n = s1.length();
        int m = s2.length();
        int i;
        int j;
        char c1;
        char c2;
        int temp;
        if (n == 0) {
            return m;
        }
        if (m == 0) {
            return n;
        }

        matrix = new int[n + 1][m + 1];
        for (i = 0; i <= n; i++) {
            matrix[i][0] = i;
        }

        for (j = 0; j <= m; j++) {
            matrix[0][j] = j;
        }

        for (i = 1; i <= n; i++) {
            c1 = s1.charAt(i - 1);

            for (j = 1; j <= m; j++) {
                c2 = s2.charAt(j - 1);
                if (c1 == c2) {
                    temp = 0;
                }
                else {
                    temp = 1;
                }

                // matrix[i][j] = min(matrix[i - 1][j] + 1, matrix[i][j - 1] + 1, matrix[i - 1][j - 1] + temp);
                // rewrite the min function
                int one = matrix[i - 1][j] + 1;
                int two = matrix[i][j - 1] + 1;
                int three = matrix[i - 1][j - 1] + temp;

                int min = one < two ? one : two;
                matrix[i][j] = min < three ? min : three;
            }
        }

        return matrix[n][m];
    }
}