package com.project.growing.demo.leetcode.linkedlist.listnode;

/**
 * @author jsy
 * @date 2020/8/18
 * @description: 链表
 **/

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
