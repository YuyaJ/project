package com.project.growing.demo.leetcode.dynamicprogramming;

/**
 * @author jsy
 * @date 2020/7/1
 * @description: 最长重复子数组(动态规划)
 * 给两个整数数组 A 和 B ，返回两个数组中公共的、长度最长的子数组的长度。
 * 示例 1:
 * 输入:
 * A: [1,2,3,2,1]
 * B: [3,2,1,4,7]
 * 输出: 3
 * 解释:
 * 长度最长的公共子数组是 [3, 2, 1]。
 * 说明:
 * 1 <= len(A), len(B) <= 1000
 * 0 <= A[i], B[i] < 100
 **/

public class LongestRepeatSubArray {

    public static int findLength(int[] A, int[] B) {
        // todo 没想到动态规划
        int n = A.length, m = B.length;
        int[][] dp = new int[n + 1][m + 1];
        int ans = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                dp[i][j] = A[i] == B[j] ? dp[i + 1][j + 1] + 1 : 0;
                ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,2,1};
        int[] B = {3,2,1,4,7};
        int result = findLength(A, B);
        System.out.println(result);
    }
}
