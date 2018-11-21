package com.chrischeng.leet.easy;

/**
 * Palindrome Number
 *
 * Description
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 *
 * Example 1:
 *
 * Input: 121
 * Output: true
 *
 * Example 2:
 *
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 *
 * Example 3:
 *
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 */

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(12321));
    }

    private static boolean isPalindrome(int num) {
        if (num < 0)
            return false;

        int origin = num;
        int res = 0;

        while (num != 0) {
            res = res * 10 + num % 10;
            num /= 10;
        }

        return res == origin;
    }

    private static boolean isPalindromeByString(int num) {
        if (num < 0)
            return false;

        String numStr = String.valueOf(num);

        int len = numStr.length();
        if (len / 2 == 0)
            return false;

        for (int i = 0; i < len / 2; i++) {
            if (!(numStr.charAt(i) == numStr.charAt(len - i - 1)))
                return false;
        }

        return true;
    }
}
