package com.chrischeng.leet.easy;

/**
 * Longest Common Prefix
 *
 * Description
 *
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 *
 * Example 2:
 *
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 */

public class LongestCommonPrefix {

    public static void main(String[] args) {
        System.out.println(longestPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestPrefix(new String[]{"dog", "racecar", "car"}));
    }

    private static String longestPrefix(String[] strs) {
        int minLen = Integer.MAX_VALUE;
        for (String str : strs)
            minLen = Math.min(minLen, str.length());

        String first = strs[0];
        for (int i = 0; i < minLen; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i))
                    return i == 0 ? "" : first.substring(0, i);
            }
        }

        return first.substring(0, minLen);
    }
}
