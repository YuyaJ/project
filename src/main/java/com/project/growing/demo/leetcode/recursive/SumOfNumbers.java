package com.project.growing.demo.leetcode.recursive;

/**
 * @author: 87799
 * @date: 2020/6/2
 * @description: 每日一题-求1+2+…+n(递归)
 * 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 * 示例 1：
 * 输入: n = 3
 * 输出: 6
 **/

public class SumOfNumbers {
    public static int sumNums(int n) {
        // 仔细看看
        boolean flag = n > 0 && (n+=sumNums(n-1)) > 0;
        return n;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(sumNums(n));
    }
}
