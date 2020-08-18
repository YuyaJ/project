package com.project.growing.utils;

import com.project.growing.demo.leetcode.linkedlist.listnode.ListNode;

/**
 * @author jsy
 * @date 2020/8/18
 * @description: 链表工具类
 **/

public class LinkUtils {

    /**
     * 头插法建立单链表
     *
     */
    public static ListNode createLinkedListHead(Integer[] nums) {
        ListNode head = new ListNode();
        for (Integer num : nums) {
            ListNode node = new ListNode(num);
            node.next = head.next;
            head.next = node;
        }
        return head.next;
    }

    /**
     * 尾插法建立单链表
     *
     */
    public static ListNode createLinkedListTail(Integer[] nums) {
        ListNode head = new ListNode();
        ListNode temp = head;
        for (Integer num : nums) {
            ListNode node = new ListNode(num);
            temp.next = node;
            temp = node;

        }
        return head.next;
    }
}
