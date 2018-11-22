package com.chrischeng.leet.easy;

/**
 * Search Insert Position
 * <p>
 * Description
 * <p>
 * Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * <p>
 * You may assume no duplicates in the array.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,3,5,6], 5
 * Output: 2
 * <p>
 * Example 2:
 * <p>
 * Input: [1,3,5,6], 2
 * Output: 1
 * <p>
 * Example 3:
 * <p>
 * Input: [1,3,5,6], 7
 * Output: 4
 * <p>
 * Example 1:
 * <p>
 * Input: [1,3,5,6], 0
 * Output: 0
 */

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 5, 6};

        System.out.println(insertPos(array, 5));
        System.out.println(insertPos(array, 2));
        System.out.println(insertPos(array, 7));
        System.out.println(insertPos(array, 0));
    }

    private static int insertPos(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int middle;

        while (left <= right) {
            middle = (left + right) >> 1;

            if (target <= array[middle])
                right = middle - 1;
            else
                left = middle + 1;
        }

        return left;
    }
}
