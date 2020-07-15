package com.project.growing.demo.leetcode.binarytree;

import java.util.LinkedList;

/**
 * @author jsy
 * @date 2020/5/31
 * @description: 对称二叉树(递归)
 * 给定一个二叉树，检查它是否是镜像对称的。
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 * 1
 * / \
 * 2   2
 * / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 * 1
 * / \
 * 2   2
 * \   \
 * 3    3
 **/

public class SymmetricBinaryTree {
    public static boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public static boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        return p.val == q.val
                // 左子树与右子树比较
                && check(p.left, q.right)
                // 右子树与左子树比较
                && check(p.right, q.left);
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 2, 3, 4, 4, 3};

        LinkedList<TreeNode> list = new LinkedList<>();

        for (int val : data) {
            list.add(new TreeNode(val));
        }

        // 完美二叉树方式构建 二叉树
        for (int i = 0; i < list.size() / 2; i++) {
            if ((i * 2 + 1) < list.size()) {
                list.get(i).left = list.get(i * 2 + 1);
            }

            if ((i * 2 + 2) < list.size()) {
                list.get(i).right = list.get(i * 2 + 2);
            }
        }

        boolean result = isSymmetric(list.get(0));
        System.out.println(result);
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
