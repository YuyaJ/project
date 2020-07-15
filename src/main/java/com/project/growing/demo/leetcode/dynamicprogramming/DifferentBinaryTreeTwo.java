package com.project.growing.demo.leetcode.dynamicprogramming;

import java.util.LinkedList;
import java.util.List;

/**
 * @author jsy
 * @date 2020/7/15
 * @description: 不同的二叉搜索树 II(递归)
 * 给定一个整数 n，生成所有由 1 ... n 为节点所组成的 二叉搜索树 。
 * 示例：
 * 输入：3
 * 输出：
 * [
 *   [1,null,3,2],
 *   [3,2,null,1],
 *   [3,1,null,null,2],
 *   [2,1,3],
 *   [1,null,2,null,3]
 * ]
 * 解释：
 * 以上的输出对应以下 5 种不同结构的二叉搜索树：
 *    1         3     3      2      1
 *     \       /     /      / \      \
 *      3     2     1      1   3      2
 *     /     /       \                 \
 *    2     1         2                 3
 * 提示：
 * 0 <= n <= 8
 **/

public class DifferentBinaryTreeTwo {

    public static List<TreeNode> generateTrees(int n) {
        // TODO
        if (n == 0) {
            return new LinkedList<>();
        }
        return saveTree(1, n);
    }

    public static LinkedList<TreeNode> saveTree(int start, int end){
        LinkedList<TreeNode> list = new LinkedList<>();
        if (start > end) {
            list.add(null);
            return list;
        }
        for (int i = start; i <= end; i++) {
            LinkedList<TreeNode> left = saveTree(start, i - 1);
            LinkedList<TreeNode> right = saveTree(i + 1, end);

            for (TreeNode le : left) {
                for (TreeNode ri : right) {
                    TreeNode node = new TreeNode(i);
                    node.left = le;
                    node.right = ri;
                    list.add(node);
                }
            }
        }
        return list;
    }



    public static void main(String[] args) {
        int n = 3;
        List<TreeNode> list = generateTrees(n);
        System.out.println(list);
    }


    public  static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {};
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
