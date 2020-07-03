package com.project.growing.demo.leetcode.findalgorithm;

import java.util.Arrays;

/**
 * @author shenya.ji.o
 * @date 2020/7/3
 * @description: 有序矩阵中第K小的元素(二分查找)
 * 给定一个 n x n 矩阵，其中每行和每列元素均按升序排序，找到矩阵中第 k 小的元素。
 * 请注意，它是排序后的第 k 小元素，而不是第 k 个不同的元素。
 * 示例：
 * matrix = [
 *    [ 1,  5,  9],
 *    [10, 11, 13],
 *    [12, 13, 15]
 * ],
 * k = 8,
 *
 * 返回 13。
 **/

public class KthSmallestElementInOrderedMatrix {
    /**
     * 二分查找
     * @param matrix
     * @param k
     * @return
     */
    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        // 左上角
        int left = matrix[0][0];
        // 右下角
        int right = matrix[n - 1][n - 1];
        // left = right 即为第k小元素
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            // [left,mid] [mid+1,right]
            // 如果 k<=mid right = mid
            // 否则 left = mid+1
            if (check(matrix, mid, k, n)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        // todo 弄明白为什么 left一定是在矩阵中的值
        // 二分查找思路如何 想到的
        return left;
    }

    public static boolean check(int[][] matrix, int mid, int k, int n) {
        int i = n - 1;
        int j = 0;
        // 从左下角开始比较
        // num 记录每一列小于mid 的个数之和
        int num = 0;
        while (i >= 0 && j < n) {
            if (matrix[i][j] <= mid) {
                num += i + 1;
                j++;
            } else {
                i--;
            }
        }
        return num >= k;
    }

//    public static int kthSmallest(int[][] matrix, int k) {
//        // 直接排序
//        int length = matrix.length;
//        if (length == 0) {
//            return 0;
//        }
//
//        int[] temp = new int[length * length];
//        int nt = 0;
//        for (int[] ints : matrix) {
//            for (int num : ints) {
//                temp[nt++] = num;
//            }
//        }
//
//        Arrays.sort(temp);
//
//        return temp[k-1];
//    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1,  5,  9},
                {10, 11, 13},
                {12, 13, 15}
        };
        int k = 8;

        int result = kthSmallest(matrix, k);
        System.out.println(result);
    }
}
