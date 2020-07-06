package com.project.growing.demo.leetcode.dynamicprogramming;

/**
 * @author shenya.ji.o
 * @date 2020/6/9
 * @description: 每日一题-把数字翻译成字符串 (动态规划)
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 * 示例 1:
 * 输入: 12258
 * 输出: 5
 * 解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi"
 **/

public class TranslateNumbersIntoStrings {

    public static int translateNum(int num) {

        String str = String.valueOf(num);

        int[] dp = new int[str.length()+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= str.length(); i++) {
            String temp = str.substring(i-2,i);
            if (temp.compareTo("10") >= 0 && temp.compareTo("25") <= 0) {
                dp[i] = dp[i-1] + dp[i-2];
            } else {
                dp[i] = dp[i-1];
            }
        }

        return dp[str.length()];
    }

    public static void main(String[] args) {
        int num = 12258;
        int result = translateNum(num);
        System.out.println(result);
    }
}
