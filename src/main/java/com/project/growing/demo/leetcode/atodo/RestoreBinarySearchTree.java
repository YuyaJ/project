package com.project.growing.demo.leetcode.atodo;

import com.project.growing.demo.leetcode.binarytree.treenode.TreeNode;
import com.project.growing.utils.TreeUtils;

/**
 * @author 87799
 * @date 2020/8/8
 * @description: 恢复二叉树搜索树
 * 二叉搜索树中的两个节点被错误地交换。
 * 请在不改变其结构的情况下，恢复这棵树。
 * 示例1:
 * 输入: [1,3,null,null,2]
 *   1
 *  /
 * 3
 *  \
 *   2
 *
 * 输出: [3,1,null,null,2]
 *   3
 *  /
 * 1
 *  \
 *   2
 * 示例2:
 * 输入: [3,1,4,null,null,2]
 *   3
 *  / \
 * 1   4
 *   /
 *  2
 * 输出: [2,1,4,null,null,3]
 *   2
 *  / \
 * 1   4
 *   /
 *  3
 * 进阶:
 * 使用 O(n) 空间复杂度的解法很容易实现。
 * 你能想出一个只使用常数空间的解决方案吗？
 **/

public class RestoreBinarySearchTree {

    static TreeNode x, y, pre;

    public static void recoverTree(TreeNode root) {
        // TODO
        // 获得中序遍历结果 中序升序排序
        inOrder(root);
        int temp = x.val;
        x.val = y.val;
        y.val= temp;
    }

    public static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);

        if (pre != null && root.val < pre.val) {
            y = root;
            if (x == null) {
                x = pre;
            }
        }

        pre = root;
        inOrder(root.right);
    }

    public static void main(String[] args) {
        Integer[] nums = {1,3,null,null,2};
        TreeNode root = TreeUtils.createBinaryTreeByArray(nums, 0);
        recoverTree(root);
    }
}
