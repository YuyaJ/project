package com.project.growing.demo.leetcode.perday;

import jdk.nashorn.internal.ir.ReturnNode;

import javax.xml.transform.Result;
import java.util.Arrays;

/**
 * @author shenya.ji.o
 * @date 2020/6/15
 * @description: 最长公共前缀(二分查找)
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 示例 1:
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 **/

public class LongestCommonRrefix {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int minLength = Integer.MAX_VALUE;
        // 最长公共前缀，必然是最短字符串一部分
        // 获取最短字符串长度
        for (String str : strs) {
            minLength = Math.min(minLength, str.length());
        }
        // 最短字符串 左侧下标 low 右侧下标 high
        int low = 0, high = minLength;
        while (low < high) {
            // (high + low) / 2 可能会发生溢出
            int mid = low + (high - low) / 2;
            if (isCommonPrefix(strs, mid)) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }
        return strs[0].substring(0, low);
    }

    public static boolean isCommonPrefix(String[] strs, int length) {
        String str0 = strs[0].substring(0, length);
        int count = strs.length;
        // 比较每个字符 前缀相同 返回true 否则false
        for (int i = 1; i < count; i++) {
            String str = strs[i];
            for (int j = 0; j < length; j++) {
                if (str0.charAt(j) != str.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] strs = {"flight", "flower","flows"};
        String result = longestCommonPrefix(strs);
        System.out.println("result："+result);
    }
}
