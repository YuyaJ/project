package com.project.growing.demo.leetcode.binarytree;

import com.project.growing.demo.leetcode.binarytree.treenode.TreeNode;

/**
 * @author shenya.ji.o
 * @date 2020/7/7
 * @description: 路径总和
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 * 说明: 叶子节点是指没有子节点的节点。
 * 示例: 
 * 给定如下二叉树，以及目标和 sum = 22，
 *
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \      \
 *         7    2      1
 * 返回 true, 因为存在目标和为 22 的根节点到叶子节点的路径 5->4->11->2。
 **/

public class SumOfPaths {

    public static boolean hasPathSum(TreeNode root, int sum) {
        // TODO 递减方法
        if (root == null) {
            return false;
        }

        // 每次减去遍历到的节点值 找到叶子节点比较 数值是否一样即可
        if (root.left == null && root.right == null) {
            if (sum == root.val) {
                return true;
            }
        }

        return hasPathSum(root.left, sum - root.val)
                || hasPathSum(root.right, sum - root.val);
    }

    public static void main(String[] args) {
        int sum = 22;
        Integer[] arr = {5,4,8,11,null,13,4,7,2,null,null,null,1};
        // 创建树 不对
//        TreeNode node = TreeUtils.createBinaryTreeByArray(arr, 0);
//        boolean result = hasPathSum(node, sum);
//        System.out.println(result);
    }
}
