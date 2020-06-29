package com.project.growing.demo.leetcode.linkedlist;

import java.util.Arrays;
import java.util.Stack;

/**
 * @author shenya.ji.o
 * @date 2020/6/18
 * @description: 从尾到头打印链表
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 * 示例 1：
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 **/

public class PrintLinkedList {

    public static int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        int size = stack.size();
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
            result[i] = stack.pop().val;
        }

        return result;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(3);
        node.next.next = new ListNode(2);

        int[] result = reversePrint(node);
        System.out.println(Arrays.toString(result));
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
