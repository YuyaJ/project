package com.project.growing.demo.leetcode.binarytree;

import java.util.Arrays;

/**
 * @author jsy
 * @date 2020/7/3
 * @description: 将有序数组转换未二叉搜索树
 * 将一个按照升序排列的有序数组，转换为一棵高度平衡二叉搜索树。
 * 本题中，一个高度平衡二叉树是指一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1。
 * 示例:
 * 给定有序数组: [-10,-3,0,5,9],
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 **/

public class SortedArrayToBinarySearch {

    public static TreeNode sortedArrayToBST(int[] nums) {
        // 中序遍历
        return helper(nums, 0, nums.length - 1);
    }

    public static TreeNode helper(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        // 总是选择中间位置右边的数字作为根节点
        int m = (left + right + 1) / 2;
        // 总是选择中间位置左边的数字作为根节点
//        int m = (left + right) / 2;


        TreeNode node = new TreeNode(nums[m]);

        node.left = helper(nums, left, m - 1);
        node.right = helper(nums, m + 1, right);

        return node;
    }

//    public TreeNode sortedArrayToBST(int[] nums) {
//        int length = nums.length;
//
//        if (length == 0) {
//            return null;
//        }
//
//        int m = length / 2;
//
//        TreeNode node = new TreeNode(nums[m]);
//
//        node.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, m));
//        node.right = sortedArrayToBST(Arrays.copyOfRange(nums, m + 1, length));
//
//        return node;
//    }

    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        TreeNode node = sortedArrayToBST(nums);
        System.out.println(node);
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
}
