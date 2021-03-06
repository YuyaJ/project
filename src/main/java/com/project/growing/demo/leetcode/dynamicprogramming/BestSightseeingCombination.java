package com.project.growing.demo.leetcode.dynamicprogramming;

/**
 * @author jsy
 * @date 2020/6/17
 * @description: 最佳观光组合(动态规划)
 * 给定正整数数组 A，A[i] 表示第 i 个观光景点的评分，并且两个景点 i 和 j 之间的距离为 j - i。
 * 一对景点（i < j）组成的观光组合的得分为（A[i] + A[j] + i - j）：景点的评分之和减去它们两者之间的距离。
 * 返回一对观光景点能取得的最高分。
 * 示例：
 * 输入：[8,1,5,2,6]
 * 输出：11
 * 解释：i = 0, j = 2, A[i] + A[j] + i - j = 8 + 5 + 0 - 2 = 11
 **/

public class BestSightseeingCombination {
    public static int maxScoreSightseeingPair(int[] A) {
        int length = A.length;

        if (length == 0) {
            return 0;
        }

        int max = A[0],ans = 0;
        // A[j]-j 固定不变的 求 A[i]+i 最大值
        for (int j = 1; j < length; j++) {
            ans = Math.max(ans, max+A[j]-j);
            max = Math.max(max, A[j]+j);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] A = {8,1,5,2,6};
        int result = maxScoreSightseeingPair(A);
        System.out.println(result);
    }
}
