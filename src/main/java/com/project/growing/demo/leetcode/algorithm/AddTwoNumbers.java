package com.project.growing.demo.leetcode.algorithm;

/**
 * @author shenya.ji.o
 * @date 2020/5/29
 * @description: 两数相加(链表)
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 **/

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 新的链表
        ListNode result = new ListNode(0);
        ListNode a = l1,b = l2;
        // 进位数
        int carry = 0;
        while (a != null || b != null || carry != 0) {
            // 获取同位数val
            int aVal = a != null ? a.val : 0;
            int bVal = b != null ? b.val : 0;
            // 求和
            int temp = aVal + bVal + carry;
            // 获取进位数
            carry = temp / 10;
            // 获取个位数
            ListNode sumNode = new ListNode(temp % 10);
            result.next = sumNode;
            result = sumNode;

            if (a != null){
                a = a.next;
            }
            if (b != null) {
                b = b.next;
            }
        }
        return result.next;
    }

    public static void main(String[] args) {
        ListNode aa = new ListNode(2);
        ListNode bb = new ListNode(5);

        ListNode result = addTwoNumbers(aa,bb);
        System.out.println(result.val);
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x){
            val = x;
        }
    }
}
