package com.project.growing.demo.leetcode.offer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author shenya.ji.o
 * @date 2020/6/17
 * @description: 数组中重复数字
 * 找出数组中重复的数字。
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * 示例 1：
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 **/

public class RepeatNumbersInArray {
    public static int findRepeatNumber(int[] nums) {
        int result = 0, length = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < length; i++) {

            if (!set.add(nums[i])) {
                result = nums[i];
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 0, 2, 5, 3};
        int result = findRepeatNumber(nums);
        System.out.println(result);
    }
}
