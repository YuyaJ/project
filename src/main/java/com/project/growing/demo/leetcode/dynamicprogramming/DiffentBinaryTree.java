package com.project.growing.demo.leetcode.dynamicprogramming;

/**
 * @author shenya.ji.o
 * @date 2020/7/15
 * @description: 不同的二叉搜索树
 * 给定一个整数 n，求以 1 ... n 为节点组成的二叉搜索树有多少种？
 * 示例:
 * 输入: 3
 * 输出: 5
 * 解释:
 * 给定 n = 3, 一共有 5 种不同结构的二叉搜索树:
 *
 *    1         3     3      2      1
 *     \       /     /      / \      \
 *      3     2     1      1   3      2
 *     /     /       \                 \
 *    2     1         2                 3
 **/

public class DiffentBinaryTree {

    public static int numTrees(int n) {
        //TODO
        // 递归
//        if (n == 0 || n == 1) {
//            return 1;
//        }
//        int r = 0;
//        for (int i = 1; i <= n; i++) {
//            r += numTrees(i-1) * numTrees(n-i);
//        }
//        return r;

        // 动态规划
        // 以0-n不同数作为跟节点 递推 计算dp[n]
        int[] dp = new int[n+1];
        dp[0] = dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j-1] * dp[i-j];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 3;
        int r = numTrees(n);
        System.out.println(r);
    }
}
