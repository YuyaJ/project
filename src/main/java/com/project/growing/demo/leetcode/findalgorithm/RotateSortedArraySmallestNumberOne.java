package com.project.growing.demo.leetcode.findalgorithm;

/**
 * @author jsy
 * @date 2020/6/30
 * @description: 寻找旋转排序数组中的最小值
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 * 请找出其中最小的元素。
 * 你可以假设数组中不存在重复元素。
 * 示例 1:
 * 输入: [3,4,5,1,2]
 * 输出: 1
 * 示例 2:
 * 输入: [4,5,6,7,0,1,2]
 * 输出: 0
 **/

public class RotateSortedArraySmallestNumberOne {

    public static int findMin(int[] nums) {

        int left = 0,right = nums.length - 1;

        if (nums[left] < nums[right]) {
            return nums[left];
        }

        while (left < right) {
            int mid = (left + right) / 2;

            if (nums[mid] < nums[right]) {
                right = mid;
            } else if (nums[mid] > nums[right]){
                left = mid + 1;
            }
        }
        return nums[left];
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        int result = findMin(nums);
        System.out.println(result);
    }
}
