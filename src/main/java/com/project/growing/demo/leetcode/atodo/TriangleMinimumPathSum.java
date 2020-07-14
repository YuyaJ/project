package com.project.growing.demo.leetcode.atodo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shenya.ji.o
 * @date 2020/7/14
 * @description: 三角形最小路径和
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
        int[] dp = new int[length];
        dp[0] = triangle.get(0).get(0);
        for (int i = 1; i < length; i++) {
            dp[i] = dp[i-1] + triangle.get(i).get(i);
            for (int j = i+1; j > 0; j--) {
                dp[i] = Math.min(dp[j], dp[j-1]) + triangle.get(i).get(i);
            }
            dp[0] += triangle.get(i).get(0);
        }

        int minTotal = dp[0];
        for (int i = 1; i < length; ++i) {
            minTotal = Math.min(minTotal, dp[i]);
        }
        return minTotal;
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(2);
        triangle.add(first);
        first.clear();

        first.add(3);
        first.add(4);
        triangle.add(first);
        first.clear();

        first.add(6);
        first.add(5);
        first.add(7);
        triangle.add(first);
        first.clear();

        first.add(4);
        first.add(1);
        first.add(8);
        first.add(3);
        triangle.add(first);
        first.clear();

        int r = minimumTotal(triangle);
    }
}
