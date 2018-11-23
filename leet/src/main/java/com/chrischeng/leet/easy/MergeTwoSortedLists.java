package com.chrischeng.leet.easy;

/**
 * Merge Two Sorted Lists
 * <p>
 * Description
 * <p>
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Example:
 * <p>
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */

public class MergeTwoSortedLists {

    public static void main(String[] args) {
        Node node1 = new Node(1);
        node1.next = new Node(2);
        node1.next.next = new Node(4);

        Node node2 = new Node(1);
        node2.next = new Node(3);
        node2.next.next = new Node(4);

        Node node = merge(node1, node2);
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }
    }

    private static Node merge(Node node1, Node node2) {
        Node head = new Node(0);
        Node node = head;

        while (node1 != null && node2 != null) {
            if (node1.value <= node2.value) {
                node.next = node1;
                node1 = node1.next;
            } else {
                node.next = node2;
                node2 = node2.next;
            }
            node = node.next;
        }

        node.next = node1 != null ? node1 : node2;

        return head.next;
    }

    private static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }
}
