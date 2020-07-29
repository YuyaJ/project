package com.project.growing.demo.leetcode.atodo;

import com.project.growing.demo.leetcode.binarytree.treenode.TreeNode;
import com.project.growing.utils.TreeUtils;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author jsy
 * @date 2020/7/28
 * @description: 二叉树的最大深度
 * 给定一个二叉树，找出其最大深度。
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * 说明: 叶子节点是指没有子节点的节点。
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最大深度 3 。
 **/

public class BinaryTreeMaxDepth {

    public static int maxDepth(TreeNode root) {
        // TODO
//        if (root == null) {
//            return 0;
//        }
//
//        int left = maxDepth(root.left);
//        int right = maxDepth(root.right);
//
//        return 1 + Math.max(left, right);

        // 广度优先搜索
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int ans = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                size--;
            }
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Integer[] node = {3,9,20,null,null,15,7};
        TreeNode root = TreeUtils.createBinaryTreeByArray(node, 0);
        int r = maxDepth(root);
        System.out.println(r);
    }
}
