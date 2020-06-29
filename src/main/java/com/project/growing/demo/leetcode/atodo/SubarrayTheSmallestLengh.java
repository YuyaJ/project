package com.project.growing.demo.leetcode.atodo;

/**
 * @author 87799
 * @date 2020/6/28
 * @description: 长度最小的子数组
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组，并返回其长度。如果不存在符合条件的连续子数组，返回 0。
 * 示例：
 * 输入：s = 7, nums = [2,3,1,2,4,3]
 * 输出：2
 * 解释：子数组 [4,3] 是该条件下的长度最小的连续子数组。
 **/

public class SubarrayTheSmallestLengh {
    public static int minSubArrayLen(int s, int[] nums) {
        //todo



        return 0;
    }

    public static void main(String[] args) {
        int s = 7;
        int[] nums = {2,3,1,2,4,3};
        int result = minSubArrayLen(s, nums);
        System.out.println(result);
    }

}
