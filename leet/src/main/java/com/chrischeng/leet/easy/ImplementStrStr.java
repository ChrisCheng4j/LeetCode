package com.chrischeng.leet.easy;

/**
 * Implement strStr()
 *
 * Description
 *
 * Implement strStr().
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Example 1:
 *
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 *
 * Example 2:
 *
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 *
 * Clarification:
 *
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 *
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 */

public class ImplementStrStr {

    public static void main(String[] args) {
        System.out.println(index("hello", "ll"));
        System.out.println(index("aaaaa", "bba"));
    }

    private static int index(String str, String needle) {
        int strLength = str.length();
        int needleLength = needle.length();

        if (strLength < needleLength)
            return -1;

        for (int i = 0; i < strLength - needleLength; i++) {
            for (int j = 0; j < needleLength; j++) {
                if (str.charAt(i + j) != needle.charAt(j))
                    break;
                else if (j == needleLength - 1)
                    return i;
            }
        }

        return -1;
    }
}
