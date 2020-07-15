package com.project.growing.demo.leetcode.dynamicprogramming;

/**
 * @author jsy
 * @date 2020/6/9
 * @description: 青蛙跳台阶问题(动态规划)
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 * 示例 1：
 * 输入：n = 2
 * 输出：2
 * 示例 2：
 * 输入：n = 7
 * 输出：21
 **/

public class FrogJumpSteps {

    public static int numWays(int n) {
        // a=dp[0] b=dp[1] sum=dp[i]

        if (n == 0 || n == 1) {
            return 1;
        }

        int a = 1,b = 1,sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        // a 记录目标数字的数值
        return b;
    }

    public static void main(String[] args) {
        int n = 7;
        int result = numWays(n);
        System.out.println(result);
    }
}
