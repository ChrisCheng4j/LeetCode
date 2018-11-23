package com.chrischeng.leet.easy;

/**
 * Length of Last Word
 *
 * Description
 *
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 *
 * If the last word does not exist, return 0.
 *
 * Note: A word is defined as a character sequence consists of non-space characters only.
 *
 * Example:
 *
 * Input: "Hello World"
 * Output: 5
 */

public class LengthLastWord {

    public static void main(String[] args) {
        System.out.println(lastLength("Hello World"));
    }

    private static int lastLength(String str) {
        int tail = str.length() - 1;
        while (tail >= 0 && str.charAt(tail) == ' ')
            tail--;

        int end = tail;
        while (tail >= 0 && str.charAt(tail) != ' ')
            tail--;

        return end - tail;
    }
}
