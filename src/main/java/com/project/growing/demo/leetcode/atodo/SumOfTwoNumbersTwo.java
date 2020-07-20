package com.project.growing.demo.leetcode.atodo;

import java.util.Arrays;

/**
 * @author 87799
 * @date 2020/7/20
 * @description: 两数之和II-输入有序数组
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 * 说明:
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * 示例:
 * 输入: numbers = [2, 7, 11, 15], target = 9
 * 输出: [1,2]
 * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 **/

public class SumOfTwoNumbersTwo {

    public static int[] twoSum(int[] numbers, int target) {
        int length = numbers.length;
        int left = 0, right = length-1;

        while (left < right) {
            int num = numbers[left] + numbers[right];
            if (num < target) {
                left++;
            } else if (num > target) {
                right--;
            } else {
                return new int[]{left+1, right+1};
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] r = twoSum(numbers, target);
        System.out.println(Arrays.toString(r));
    }
}
