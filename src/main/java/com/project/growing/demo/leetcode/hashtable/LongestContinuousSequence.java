package com.project.growing.demo.leetcode.hashtable;

import java.util.*;

/**
 * @author jsy
 * @date 2020/6/6
 * @description: 每日一题-最长连续序列(哈希表)
 * 给定一个未排序的整数数组，找出最长连续序列的长度。
 * 要求算法的时间复杂度为 O(n)。
 * 示例:
 * 输入: [100, 4, 200, 1, 3, 2]
 * 输出: 4
 * 解释: 最长连续序列是 [1, 2, 3, 4]。它的长度为 4。
 **/

public class LongestContinuousSequence {
    public static int longestConsecutive(int[] nums) {

        Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }

        int longestStreak = 0;

        for (int num : num_set) {
            if (!num_set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;

//        int length = nums.length;
//
//        if (length == 0) {
//            return 0;
//        }
//
//        Arrays.sort(nums);
//
//        Set<Integer> numSet = new HashSet<>();
//
//        int result = 0;
//        // 数组排序
//        List<Integer> tempList = Arrays.stream(nums).boxed().distinct().sorted().collect(Collectors.toList());
//        // 存取连续序列个数
//        List<Integer> list = new ArrayList();
//        // 记录第一位
//        int num = tempList.get(0);
//        int count = 0;
//        // 从第二位开始记录是否是连续序列
//        for (Integer temp : tempList) {
//            if (num == temp) {
//                count++;
//            } else {
//                num = temp;
//                list.add(count);
//                count = 1;
//            }
//            num++;
//        }
//        list.add(count);
//
//        System.out.println(list);
//        // 获取list中最大数字
//        result = Collections.max(list);
//        return result;
    }

    public static void main(String[] args) {
//        int[] nums = {100,4,200,1,3,2,201};
        int[] nums = {1,2,0,1};
//        int[] nums = {100,4,1,3,2};

        System.out.println(longestConsecutive(nums));
    }
}
