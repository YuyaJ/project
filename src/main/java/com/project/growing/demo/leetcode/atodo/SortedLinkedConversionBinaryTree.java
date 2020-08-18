package com.project.growing.demo.leetcode.atodo;

import com.project.growing.demo.leetcode.binarytree.treenode.TreeNode;
import com.project.growing.demo.leetcode.linkedlist.listnode.ListNode;
import com.project.growing.utils.LinkUtils;

/**
 * @author jsy
 * @date 2020/8/18
 * @description: 有序链表转换二叉搜索树
 * 给定一个单链表，其中的元素按升序排序，将其转换为高度平衡的二叉搜索树。
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点的左右两个子树的高度差的绝对值不超过 1。
 * 示例:
 * 给定的有序链表： [-10, -3, 0, 5, 9],
 * 一个可能的答案是：[0, -3, 9, -10, null, 5], 它可以表示下面这个高度平衡二叉搜索树：
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 **/

public class SortedLinkedConversionBinaryTree {

    public static TreeNode sortedListToBST(ListNode head) {
        TreeNode root = new TreeNode(0);

        return root;
    }

    public static void main(String[] args) {
        Integer[] nums = {-10, -3, 0, 5, 9};
        ListNode head = LinkUtils.createLinkedListTail(nums);
        TreeNode node = sortedListToBST(head);
    }
}
