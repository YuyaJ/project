package com.project.growing.demo.leetcode.hashtable;

import java.util.*;

/**
 * @description: 两数之和(哈希表)
 * @author jsy
 * 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 **/

public class SumOfTwoNumbers {
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>(16);
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");

//        for(int i = 0;i < nums.length-1;i++){
//            for(int j = i+1;j < nums.length;j++){
//                if(nums[j] == target - nums[i]){
//                    return new int[] {i,j};
//                }
//            }
//        }
//        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
