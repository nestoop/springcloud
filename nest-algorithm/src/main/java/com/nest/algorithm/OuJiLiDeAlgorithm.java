package com.nest.algorithm;

/**
 * 欧几里得算法
 * @author botter
 */
public class OuJiLiDeAlgorithm {

    public static int gcd(int p, int q) {

        System.out.println("[Algorithm] 欧几里得算法 p = " + p  + " q = " + q);

        if ( q == 0) {
            return p;
        }

        int r = p % q ;

        return gcd(p, r);
    }
}
