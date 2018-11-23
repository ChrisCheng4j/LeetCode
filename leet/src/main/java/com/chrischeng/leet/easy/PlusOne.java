package com.chrischeng.leet.easy;

/**
 * Plus One
 * <p>
 * Description
 * <p>
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 * <p>
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * <p>
 * Example 2:
 * <p>
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 */

public class PlusOne {

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        int[] arrayPlus1 = plusOne(array1);
        for (int i : arrayPlus1)
            System.out.println(i);

        int[] array2 = new int[]{4, 3, 2, 1};
        int[] arrayPlus2 = plusOne(array2);
        for (int i : arrayPlus2)
            System.out.println(i);

        int[] array3 = new int[]{9, 9, 9, 9};
        int[] arrayPlus3 = plusOne(array3);
        for (int i : arrayPlus3)
            System.out.println(i);
    }

    private static int[] plusOne(int[] array) {
        int tail = array.length - 1;

        while (tail >= 0) {
            if (array[tail] == 9) {
                array[tail] = 0;
                tail--;
            } else {
                array[tail]++;
                break;
            }
        }

        if (array[0] == 0) {
            array = new int[array.length + 1];
            array[0] = 1;
        }

        return array;
    }
}
