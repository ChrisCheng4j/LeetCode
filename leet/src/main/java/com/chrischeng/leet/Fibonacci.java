package com.chrischeng.leet;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(recursion(7));
        System.out.println(array(7));
        System.out.println(variable(7));
    }


    // time:  O(n2)
    // space: O(n)
    private static int recursion(int n) {
        if (n == 1 || n == 2)
            return 1;

        return recursion(n - 1) + recursion(n - 2);
    }

    // time:  O(n)
    // space: O(n)
    private static int array(int n) {
        int[] array = new int[n + 1];
        array[2] = array[1] = 1;
        for (int i = 3; i <= n; i++)
            array[i] = array[i - 1] + array[i - 2];

        return array[n];
    }

    // time:  O(n)
    // space: O(1)
    private static int variable(int n) {
        if (n == 1 || n == 2)
            return 1;

        int a = 1, b = 1, c = 0;

        for (int i = 3; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }
}
