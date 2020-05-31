package com.project.growing.demo.leetcode.audition;

import java.util.Arrays;

/**
 * @author shenya.ji.o
 * @date 2020/5/29
 * @description: 判断是否互为字符重排
 * 给定两个字符串 s1 和 s2，请编写一个程序，确定其中一个字符串的字符重新排列后，能否变成另一个字符串。
 * 示例 1：
 * 输入: s1 = "abc", s2 = "bca"
 * 输出: true
 **/

public class Demo2 {

    public static boolean CheckPermutation(String s1, String s2) {
        if (s1 == s2) {
            return true;
        }

        if (s1 == null || s2 == null ||s1.length() != s2.length()) {
            return false;
        }

        char[] str1 = s1.toCharArray();
        char[] str2 = s2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        if (Arrays.equals(str1, str2)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "bca";
        System.out.println(CheckPermutation(str1, str2));
    }
}
