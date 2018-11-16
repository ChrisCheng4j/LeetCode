package com.chrischeng.leet.easy;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 *
 * Example 1:
 *
 * Input: 123
 * Output:  321
 *
 * Example 2:
 *
 * Input: -123
 * Output: -321
 *
 * Example 3:
 *
 * Input: 120
 * Output: 21
 */

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(revserse(-123450));
    }

    private static int revserse(int origin) {
        int res = 0;

        while (origin != 0) {
            res = res * 10 + origin % 10;
            origin /= 10;
        }

        return res;
    }
}
