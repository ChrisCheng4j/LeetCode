package com.chrischeng.leet.easy;

/**
 * Add Binary
 * <p>
 * Description
 * <p>
 * Given two binary strings, return their sum (also a binary string).
 * <p>
 * The input strings are both non-empty and contains only characters 1 or 0.
 * <p>
 * Example 1:
 * <p>
 * Input: a = "11", b = "1"
 * Output: "100"
 * <p>
 * Example 2:
 * <p>
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 */

public class AddBinary {

    public static void main(String[] args) {
        String a1 = "11";
        String b1 = "1";
        System.out.println(add(a1, b1));

        String a2 = "1010";
        String b2 = "1011";
        System.out.println(add(a2, b2));
    }

    private static String add(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;

        int aTail = a.length() - 1;
        int bTail = b.length() - 1;

        while (aTail >= 0 && bTail >= 0) {
            carry += a.charAt(aTail--) - '0';
            carry += b.charAt(bTail--) - '0';
            sb.insert(0, carry % 2);
            carry >>= 1;
        }

        while (aTail >= 0) {
            carry += a.charAt(aTail--) - '0';
            sb.insert(0, carry % 2);
            carry >>= 1;
        }

        while (bTail >= 0) {
            carry += b.charAt(bTail--) - '0';
            sb.insert(0, carry % 2);
            carry >>= 1;
        }

        if (carry == 1)
            sb.insert(0, 1);

        return sb.toString();
    }
}
