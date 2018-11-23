package com.chrischeng.leet.easy;

/**
 * Maximum Subarray
 * <p>
 * Description
 * <p>
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * <p>
 * Example:
 * <p>
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 */

public class MaximumSubarray {

    public static void main(String[] args) {
        int[] array = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(sum(array));
    }

    private static int sum(int[] array) {
        int tmp;
        int max;
        tmp = max = array[0];

        for (int i = 1; i < array.length; i++) {
             tmp = array[i] + (tmp > 0 ? tmp : 0);
             if (tmp > max)
                 max = tmp;
        }

        return max;
    }
}
