package com.project.growing.demo.leetcode.atodo;

import java.util.Arrays;

/**
 * @author jsy
 * @date 2020/7/31
 * @description: 扑克牌中得顺子
 * 从扑克牌中随机抽5张牌，判断是不是一个顺子，即这5张牌是不是连续的。2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
 * 示例 1:
 * 输入: [1,2,3,4,5]
 * 输出: True
 * 示例 2:
 * 输入: [0,0,1,2,5]
 * 输出: True
 **/

public class StraightInPlayingCards {

    public static boolean isStraight(int[] nums) {
        int length = nums.length;
        int zero = 0;
        int first = 0;

        Arrays.sort(nums);

        for (int i = 0; i < length; i++) {
            if (nums[i] == 0) {
                zero++;
            }
            break;
        }

        int[] temp = Arrays.copyOfRange(nums, zero, length);

        for (int i = 1; i < temp.length; i++) {
            if (nums[i]- nums[i-1] == 1) {
                break;
            }
            if (zero <= 0) {
                return false;
            }
            zero--;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,2,6};
        boolean r = isStraight(nums);
        System.out.println(r);
    }
}
