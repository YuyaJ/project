package com.project.growing.demo.leetcode.findalgorithm;

/**
 * @author 87799
 * @date 2020/7/18
 * @description: 搜索插入位置(二分查找)
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 * 示例 1:
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 * 输入: [1,3,5,6], 0
 * 输出: 0
 **/

public class SearchInsertionLocation {

    public static int searchInsert(int[] nums, int target) {
        int length = nums.length;

        if (length == 0) {
            return 0;
        }

        int left = 0,right = length-1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 0;
        int r = searchInsert(nums, target);
        System.out.println(r);
    }
}
