package com.chrischeng.leet.easy;

/**
 * Remove Duplicates from Sorted List
 * <p>
 * Description
 * <p>
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * <p>
 * Example 1:
 * <p>
 * Input: 1->1->2
 * Output: 1->2
 * <p>
 * Example 2:
 * <p>
 * Input: 1->1->2->3->3
 * Output: 1->2->3
 */

public class RemoveDuplicatesFromSortedList {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next(1).next(2).next(3).next(3);

        Node node = remove(head);
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    private static Node remove(Node node) {
        Node head = node;

        while (node.next != null) {
            if (node.value == node.next.value)
                node.next = node.next.next;
            else
                node = node.next;
        }

        return head;
    }

    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

        Node next(int value) {
            this.next = new Node(value);
            return this.next;
        }
    }
}
