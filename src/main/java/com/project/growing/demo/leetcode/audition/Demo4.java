package com.project.growing.demo.leetcode.audition;

import java.util.HashSet;
import java.util.Set;

/**
 * @author shenya.ji.o
 * @date 2020/5/29
 * @description: 回文排列
 * 回文 去除重复的 之后 <= 1
 * 给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。
 * 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。
 * 回文串不一定是字典当中的单词。
 * 示例1：
 * 输入："tactcoa"
 * 输出：true（排列有"tacocat"、"atcocta"，等等）
 **/

public class Demo4 {
    public static boolean canPermutePalindrome(String s) {
        Set set = new HashSet();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(i));
            } else {
                set.add(s.charAt(i));
            }
        }
        return set.size() <= 1;
    }

    public static void main(String[] args) {
        String str = "tactcoa";
        System.out.println(canPermutePalindrome(str));
    }
}
