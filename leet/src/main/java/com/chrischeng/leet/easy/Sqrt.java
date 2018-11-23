package com.chrischeng.leet.easy;

/**
 * Sqrt(x)
 * <p>
 * Description
 * <p>
 * Implement int sqrt(int x).
 * <p>
 * Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
 * <p>
 * Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
 * <p>
 * Example 1:
 * <p>
 * Input: 4
 * Output: 2
 * <p>
 * Example 2:
 * <p>
 * Input: 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since
 * the decimal part is truncated, 2 is returned.
 */
public class Sqrt {

    public static void main(String[] args) {
        System.out.println(sqrtNewton(8));
    }

    private static int sqrtNewton(int x) {
        long n = x;
        while (n * n > x)
            n = (n + x / n) >> 1;
        return (int) n;
    }

    private static int sqrt(int x) {
        for (int i = x; i >= 1; i--) {
            if (i * i <= x)
                return i;
        }

        return 1;
    }
}
