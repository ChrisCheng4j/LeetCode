package com.chrischeng.leet.easy;

import java.util.HashMap;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * <p>
 * Tags: Array, Hash Table
 */

public class TwoSum {

    public static void main(String[] args) {
        int[] array = new int[]{11, 7, 15, 2};
        int[] indexes = twoSum(array, 9);
        for (int index : indexes)
            System.out.println(index);
    }

    private static int[] twoSum(int[] array, int sum) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int len = array.length;
        int value;
        for (int i = 0; i < len; i++) {
            value = array[i];

            if (map.containsKey(value))
                return new int[]{map.get(value), i};

            map.put(sum - value, i);
        }

        return new int[2];
    }
}
