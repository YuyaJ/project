package com.project.growing.demo.leetcode.dynamicprogramming;

/**
 * @author 87799
 * @date 2020/7/12
 * @description: 最小路径和(动态规划)
 * 给定一个包含非负整数的 m x n 网格，请找出一条从左上角到右下角的路径，使得路径上的数字总和为最小。
 * 说明：每次只能向下或者向右移动一步。
 * 示例:
 * 输入:
 * [
 *   [1,3,1],
 *   [1,5,1],
 *   [4,2,1]
 * ]
 * 输出: 7
 * 解释: 因为路径 1→3→1→1→1 的总和最小。
 **/

public class MinimuPathSum {
    public static int minPathSum(int[][] grid) {
        // 从左上角开始
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[0].length; j++) {
//                if (i == 0 && j == 0) {
//                    continue;
//                } else if (i == 0) {
//                    grid[i][j] = grid[i][j-1] + grid[i][j];
//                } else if (j == 0) {
//                    grid[i][j] = grid[i-1][j] + grid[i][j];
//                } else {
//                    grid[i][j] = grid[i][j] + Math.min(grid[i-1][j],grid[i][j-1]);
//                }
//            }
//        }
        // 从右下角开始
        for (int i = grid.length-1; i >= 0; i--) {
            for (int j = grid[0].length-1; j >= 0; j--) {
                if (i == grid.length-1 && j == grid[0].length-1) {
                    continue;
                } else if (i == grid.length-1) {
                    grid[i][j] = grid[i][j+1] + grid[i][j];
                } else if (j == grid[0].length-1) {
                    grid[i][j] = grid[i+1][j] + grid[i][j];
                } else {
                    grid[i][j] = grid[i][j] + Math.min(grid[i+1][j],grid[i][j+1]);
                }
            }
        }
        return grid[0][0];
    }

    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
        int r = minPathSum(grid);
        System.out.println(r);
    }
}
