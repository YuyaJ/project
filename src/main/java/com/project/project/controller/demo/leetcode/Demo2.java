package com.project.project.controller.demo.leetcode;

import javafx.scene.transform.Scale;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shenya.ji.o
 * @date 2020/5/29
 * @description: 打家劫舍
 * 动态规划+滚动数组
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
