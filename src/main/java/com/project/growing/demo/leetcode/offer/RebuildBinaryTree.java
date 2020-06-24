package com.project.growing.demo.leetcode.offer;

/**
 * @author shenya.ji.o
 * @date 2020/6/18
 * @description: 重建二叉树
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如，给出
 * 前序遍历 preorder = [3,9,20,15,7]
 * 中序遍历 inorder = [9,3,15,20,7]
 * 返回如下的二叉树：
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 **/

public class RebuildBinaryTree {

    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        // TODO

        int length = preorder.length;

        int[] leftTree = new int[length];
        int[] rightTree = new int[length];
        // 前序遍历 第一个为根节点
        // 中序遍历根节点左边为左二叉树 右边为右二叉树

        TreeNode node = new TreeNode(preorder[0]);





        return new TreeNode(0);
    }

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        TreeNode node = buildTree(preorder, inorder);

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
