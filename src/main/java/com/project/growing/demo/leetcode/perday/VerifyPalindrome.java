package com.project.growing.demo.leetcode.perday;

/**
 * @author shenya.ji.o
 * @date 2020/6/19
 * @description: 验证回文串
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 * 示例 1:
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:pbt abs
 * 输入: "race a car"
 * 输出: false
 **/

public class VerifyPalindrome {
    public static boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : chars) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        System.out.println(sb);
        StringBuilder sbRev = new StringBuilder(sb).reverse();
        System.out.println(sbRev);
        return sbRev.toString().equals(sb.toString());
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean flag = isPalindrome(s);
        System.out.println(flag);
    }
}
