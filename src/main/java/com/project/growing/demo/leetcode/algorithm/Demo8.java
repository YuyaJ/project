package com.project.growing.demo.leetcode.algorithm;

/**
 * @author shenya.ji.o
 * @date 2020/6/5
 * @description: 顺时针打印矩阵
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 * 示例 1：
 * 输入：matrix = [[1,2,3],[4,5,6],[7,8,9]]
 * 输出：[1,2,3,6,9,8,7,4,5]
 **/

public class Demo8 {
    public int[] spiralOrder(int[][] matrix) {
        int[] nums = new int[matrix.length];


        return nums;
    }

    public static void main(String[] args) {
        String s1 = new StringBuilder("go").append("od").toString();
        System.out.println(s1.intern().equals(s1));
        System.out.println(s1.intern().hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s1.intern() == s1);
        String s2 = new StringBuilder("ja").append("va").toString();
        System.out.println(s2.intern().equals(s2));
        System.out.println(s2.intern().hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s2.intern() == s2);
    }
}
