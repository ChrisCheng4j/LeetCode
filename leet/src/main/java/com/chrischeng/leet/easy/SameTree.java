package com.chrischeng.leet.easy;

/**
 * Same Tree
 *
 * Description
 *
 * Given two binary trees, write a function to check if they are the same or not.
 *
 * Two binary trees are considered the same if they are structurally identical and the nodes have the same value.
 *
 * Example 1:
 *
 * Input:     1         1
 *           / \       / \
 *          2   3     2   3
 *
 *         [1,2,3],   [1,2,3]
 *
 * Output: true
 *
 * Example 2:
 *
 * Input:     1         1
 *           /           \
 *          2             2
 *
 *         [1,2],     [1,null,2]
 *
 * Output: false
 *
 * Example 3:
 *
 * Input:     1         1
 *           / \       / \
 *          2   1     1   2
 *
 *         [1,2,1],   [1,1,2]
 *
 * Output: false
 */

public class SameTree {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        treeNode1.child(2,3);

        TreeNode treeNode2 = new TreeNode(1);
        treeNode2.child(2,3);

        System.out.println(same(treeNode1, treeNode2));
    }

    private static boolean same(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null)
            return true;

        if (node1 == null || node2 == null)
            return false;

        if (node1.value == node2.value)
            return same(node1.left, node2.left) && same(node2.right, node2.right);

        return false;
    }

    private static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int value) {
            this.value = value;
        }

        void child(int left, int right) {
            this.left = new TreeNode(left);
            this.right = new TreeNode(right);
        }
    }
}
