package com.project.growing.demo.leetcode.dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jsy
 * @date 2020/7/14
 * @description: 三角形最小路径和(动态规划)
 * 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
 * 相邻的结点 在这里指的是 下标 与 上一层结点下标 相同或者等于 上一层结点下标 + 1 的两个结点。
 * 例如，给定三角形：
 * [
 *      [2],
 *     [3,4],
 *    [6,5,7],
 *   [4,1,8,3]
 * ]
 * 自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
 * 说明：
 * 如果你可以只使用 O(n) 的额外空间（n 为三角形的总行数）来解决这个问题，那么你的算法会很加分。
 **/

public class TriangleMinimumPathSum {

    public static int minimumTotal(List<List<Integer>> triangle) {
        // TODO
        int length = triangle.size();
        int[] dp = new int[length+1];

        // 从下往上
        for (int i = length-1; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                dp[j] = Math.min(dp[j], dp[j+1]) + triangle.get(i).get(j);
            }
        }
        return dp[0];

        // 题解
//        int n = triangle.size();
//        int[] f = new int[n];
//        f[0] = triangle.get(0).get(0);
//        for (int i = 1; i < n; ++i) {
//            f[i] = f[i - 1] + triangle.get(i).get(i);
//            for (int j = i - 1; j > 0; --j) {
//                f[j] = Math.min(f[j - 1], f[j]) + triangle.get(i).get(j);
//            }
//            f[0] += triangle.get(i).get(0);
//        }
//        int minTotal = f[0];
//        for (int i = 1; i < n; ++i) {
//            minTotal = Math.min(minTotal, f[i]);
//        }
//        return minTotal;
    }

    public static void main(String[] args) {

        Integer[][] arr = {
                {2},
                {3,4},
                {6,5,7},
                {4,1,8,3}
        };

        List<List<Integer>> triangle = new ArrayList<>();

        for (Integer[] integers : arr) {
            List<Integer> subList = new ArrayList<>(Arrays.asList(integers));
            triangle.add(subList);
        }

        int r = minimumTotal(triangle);
        System.out.println(r);
    }
}
