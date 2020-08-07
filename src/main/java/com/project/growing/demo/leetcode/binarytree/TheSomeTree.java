package com.project.growing.demo.leetcode.binarytree;

import com.project.growing.demo.leetcode.binarytree.treenode.TreeNode;
import com.project.growing.utils.TreeUtils;

/**
 * @author jsy
 * @date 2020/8/7
 * @description: 相同的树
 * 给定两个二叉树，编写一个函数来检验它们是否相同。
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 * 示例 1:
 * 输入:       1         1
 * / \       / \
 * 2   3     2   3
 * <p>
 * [1,2,3],   [1,2,3]
 * <p>
 * 输出: true
 * 示例 2:
 * <p>
 * 输入:      1          1
 * /           \
 * 2             2
 * <p>
 * [1,2],     [1,null,2]
 * <p>
 * 输出: false
 * 示例 3:
 * <p>
 * 输入:       1         1
 * / \       / \
 * 2   1     1   2
 * <p>
 * [1,2,1],   [1,1,2]
 * <p>
 * 输出: false
 **/

public class TheSomeTree {

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        Integer[] num1 = {1,2};
        Integer[] num2 = {1,null,2};
        TreeNode p = TreeUtils.createBinaryTreeByArray(num1, 0);
        TreeNode q = TreeUtils.createBinaryTreeByArray(num2, 0);
        boolean r = isSameTree(p, q);
        System.out.println(r);
    }
}
