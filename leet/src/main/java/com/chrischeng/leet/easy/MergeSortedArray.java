package com.chrischeng.leet.easy;

/**
 * Merge Sorted Array
 * <p>
 * Description
 * <p>
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * <p>
 * Note:
 * <p>
 * The number of elements initialized in nums1 and nums2 are m and n respectively.
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
 * <p>
 * Example:
 * <p>
 * Input:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * Output: [1,2,2,3,5,6]
 */

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};

        int[] merge = merge(nums1, 3, nums2, 3);
        for (int i : merge)
            System.out.println(i);
    }

    private static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int tail = m-- + n-- - 1;

        while (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n])
                nums1[tail--] = nums1[m--];
            else
                nums1[tail--] = nums2[n--];
        }

        while (m >= 0)
            nums1[tail--] = nums1[m--];
        while (n-- > 0)
            nums2[tail--] = nums2[n];

        return nums1;
    }
}
