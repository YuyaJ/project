package com.project.growing.demo.leetcode.perday;

import sun.security.util.Length;

/**
 * @author shenya.ji.o
 * @date 2020/6/10
 * @description: 回文数
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 示例 1:
 * 输入: 121
 * 输出: true
 * 示例 2:
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 *
 * 进阶:
 * 你能不将整数转为字符串来解决这个问题吗？
 **/

public class Demo11 {
    public static boolean isPalindrome(int x) {


        Integer integer = x;

        if (x == 0 || x == 1) {
            return true;
        }

        if (x < 0) {
            return false;
        }

        int length = integer.toString().length();

        int a = length - 1,b = 0;

        for (int i = 0; i <= length / 2; i++) {
            if (x / (a * 10) == x / 10) {
                return false;
            }
            x = x % 10;
        }



        return true;
    }

    public static void main(String[] args) {
        int n = -10;
        boolean result = isPalindrome(n);
        System.out.println(result);
    }
}
