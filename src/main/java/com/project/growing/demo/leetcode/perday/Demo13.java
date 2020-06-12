package com.project.growing.demo.leetcode.perday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author shenya.ji.o
 * @date 2020/6/12
 * @description: 三数之和 (排序+双指针)
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 * 示例：
 * 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 **/

public class Demo13 {
    public static List<List<Integer>> threeSum(int[] nums) {
        int length = nums.length;
        // 排序
        Arrays.sort(nums);
        List<List<Integer>> resultLit = new ArrayList<>();

        for (int first = 0; first < length; first++) {
            // 和上次枚举的数不相同
            if (first > 0 && nums[first] == nums[first-1]) {
                continue;
            }
            
            // a+b+c=0 -> a+b=-c
            int target = -nums[first];
            // 第三轮 从最后一位开始计算
            int third = length - 1;

            for (int second = first + 1; second < length; second++) {
                // 和上次枚举的数不相同
                if (second > first + 1 && nums[second] == nums[second-1]) {
                    continue;
                }

                // 保证b在c前面  获取应该 nums[second] + nums[third] = target 的 c
                while (second < third && nums[second] + nums[third] > target) {
                    --third;
                }

                // 如果指针重合 b 后续增加 就不会出现 a+b+c=0 b<c且的c了
                if (second == third) {
                    break;
                }

                if (nums[second] + nums[third] == target) {
                    List<Integer> tempList = new ArrayList<>();
                    tempList.add(nums[first]);
                    tempList.add(nums[second]);
                    tempList.add(nums[third]);
                    resultLit.add(tempList);
                }
            }
        }

        return resultLit;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> resultLit = threeSum(nums);
        System.out.println(resultLit);
    }
}
