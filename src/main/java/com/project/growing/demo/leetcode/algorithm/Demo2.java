package com.project.growing.demo.leetcode.algorithm;

/**
 * @author shenya.ji.o
 * @date 2020/5/29
 * @description: 打家劫舍
 * 动态规划+滚动数组
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 * 示例 1:
 * 输入: [1,2,3,1]
 * 输出: 4
 * 解释: 偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 *      偷窃到的最高金额 = 1 + 3 = 4 。
 **/

public class Demo2 {

    public static int rob(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return nums[0];
        }
        // 记录当前前一次 金额 first
        // 计算出前两次 最大金额second
        int first = nums[0],second = Math.max(nums[0], nums[1]);
        for (int i = 2; i < length; i++) {
            // i-1最大金额 copy
            int temp = second;
            // 如果选择计算当前金额 当前金额 加上i-2 之前的最大金额
            // 否则 选择i-1 最大金额
            second = Math.max(nums[i]+first, second);
            // i-1 最大金额 copy first
            first = temp;
        }
        return second;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,1,2};
        int result = rob(nums);
        System.out.println(result);
    }
}
