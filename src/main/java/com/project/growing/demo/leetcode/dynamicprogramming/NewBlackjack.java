package com.project.growing.demo.leetcode.dynamicprogramming;

/**
 * @author shenya.ji.o
 * @date 2020/6/3
 * @description: 每日一题-新21点(动态规划)
 * 爱丽丝参与一个大致基于纸牌游戏 “21点” 规则的游戏，描述如下：
 * 爱丽丝以 0 分开始，并在她的得分少于 K 分时抽取数字。 抽取时，她从 [1, W] 的范围中随机获得一个整数作为分数进行累计，其中 W 是整数。 每次抽取都是独立的，其结果具有相同的概率。
 * 当爱丽丝获得不少于 K 分时，她就停止抽取数字。 爱丽丝的分数不超过 N 的概率是多少？
 * 示例 1：
 * 输入：N = 10, K = 1, W = 10
 * 输出：1.00000
 * 说明：爱丽丝得到一张卡，然后停止。
 * 示例 2：
 * 输入：N = 6, K = 1, W = 10
 * 输出：0.60000
 * 说明：爱丽丝得到一张卡，然后停止。
 * 在 W = 10 的 6 种可能下，她的得分不超过 N = 6 分。
 * 示例 3：
 * 输入：N = 21, K = 17, W = 10
 * 输出：0.73278
 **/

public class NewBlackjack {
    public static double new21Game(int N, int K, int W) {
        // TODO 仔细研究
        double[] dp = new double[K+W];
        double s = 0;

        // k < x <= n 设置为1 n < x < k+w 设置为0
        for (int i  = K;i < K+W; i++ ) {
            dp[i] = i <= N ? 1 : 0;
            s += dp[i];
        }

        // 往前移 减去右边加左边
        for (int j = K-1;j >= 0;j--) {
            dp[j] = s/W;
            s = s - dp[j+W] + dp[j];
        }

        return dp[0];
    }

    public static void main(String[] args) {
        int N = 28,K = 17,W = 10;
        System.out.println(new21Game(N, K, W));
    }
}
