package com.project.growing.demo.leetcode.linkedlist.listnode;

/**
 * @author jsy
 * @date 2020/8/18
 * @description: 链表
 **/

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
