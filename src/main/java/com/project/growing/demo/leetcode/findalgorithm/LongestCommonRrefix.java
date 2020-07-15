package com.project.growing.demo.leetcode.findalgorithm;

/**
 * @author jsy
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

        // 逐个比较
//        if (strs == null || strs.length == 0) {
//            return "";
//        }
//
//        String prevs = strs[0];
//        for (int i = 0; i < strs.length; i++) {
//            int j = 0;
//            for (;j < prevs.length() && j < strs[i].length(); j++) {
//                if (prevs.charAt(j) != strs[i].charAt(j)) {
//                    break;
//                }
//            }
//            prevs = prevs.substring(0, j);
//            if (prevs.isEmpty()) {
//                return "";
//            }
//        }
//        return prevs;

        // 仅需最大，最小字符串的最长公共前缀
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }

        int max = 0,min = 0;
        for (int i = 1; i < strs.length; i++) {
            if (strs[max].length() < strs[i].length()) {
                max = i;
            }
            if (strs[min].length() > strs[i].length()) {
                min = i;
            }
        }

        for (int i = 0; i < strs[min].length(); i++) {
            if (strs[min].charAt(i) != strs[max].charAt(i)) {
                return strs[min].substring(0, i);
            }
        }
        return strs[min];

        // 二分
//        if (strs == null || strs.length == 0) {
//            return "";
//        }
//        int minLength = Integer.MAX_VALUE;
//        // 最长公共前缀，必然是最短字符串一部分
//        // 获取最短字符串长度
//        for (String str : strs) {
//            minLength = Math.min(minLength, str.length());
//        }
//        // 最短字符串 左侧下标 low 右侧下标 high
//        int low = 0, high = minLength;
//        while (low < high) {
//            // (high + low) / 2 可能会发生溢出
//            int mid = low + (high - low) / 2;
//            if (isCommonPrefix(strs, mid)) {
//                low = mid;
//            } else {
//                high = mid - 1;
//            }
//        }
//        return strs[0].substring(0, low);
    }

//    public static boolean isCommonPrefix(String[] strs, int length) {
//        String str0 = strs[0].substring(0, length);
//        int count = strs.length;
//        // 比较每个字符 前缀相同 返回true 否则false
//        for (int i = 1; i < count; i++) {
//            String str = strs[i];
//            for (int j = 0; j < length; j++) {
//                if (str0.charAt(j) != str.charAt(j)) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }

    public static void main(String[] args) {
        String[] strs = {"flight", "flower","flows"};
        String result = longestCommonPrefix(strs);
        System.out.println("result："+result);
    }
}
