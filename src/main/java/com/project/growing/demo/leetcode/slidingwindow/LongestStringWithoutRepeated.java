package com.project.growing.demo.leetcode.slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jsy
 * @date 2020/6/15
 * @description: 无重复字符的最长子串(滑动窗口)
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 * 示例 1:
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
 * 示例 2:
 * 输入: "bbbbb"
 * 输出: 1
 * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
 * 示例 3:
 * 输入: "pwwkew"
 * 输出: 3
 * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
 *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 **/

public class LongestStringWithoutRepeated {
    public static int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> map = new HashMap<>(16);
        int max = 0;

        for (int start = 0, end = 0; end < s.length(); end++) {
            char temp = s.charAt(end);
            // 已经存在
            if (map.containsKey(temp)) {
                // 更改左侧开始下标
                start = Math.max(map.get(temp), start);
            }

            max = Math.max(end - start + 1, max);
            map.put(temp, end + 1);
        }

        return max;

        // List 效率太低
//        List<Object> list = new ArrayList<>();
//
//        int maxLength = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            list.clear();
//            list.add(s.charAt(i));
//            for (int j = i+1; j < s.length(); j++) {
//                if (list.contains(s.charAt(j))) {
//                    break;
//                }
//                list.add(s.charAt(j));
//            }
//            maxLength = Math.max(list.size(), maxLength);
//        }
//        return maxLength;
    }

    public static void main(String[] args) {
        String str = "pwwkew";
        int result = lengthOfLongestSubstring(str);
        System.out.println(result);
    }
}
