package com.project.project.controller.demo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: demo1
 * @author: 87799
 * 两数之和
 **/

public class Demo1 {
    public static int[] twoSum(int[] nums, int target) {
        int count = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0;i < nums.length-1;i++){
            for(int j = i+1;j < nums.length;j++){
                count = nums[i]+nums[j];
                if(count == target){
                    list.add(i);
                    list.add(j);
                }
            }
        }
        int[] nsz=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            nsz[i] = list.get(i);
        }
        return nsz;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
