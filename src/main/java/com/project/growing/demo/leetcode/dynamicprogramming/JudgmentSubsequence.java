package com.project.growing.demo.leetcode.dynamicprogramming;

/**
 * @author jsy
 * @date 2020/7/27
 * @description: 判断子序列
 * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
 * 你可以认为 s 和 t 中仅包含英文小写字母。字符串 t 可能会很长（长度 ~= 500,000），而 s 是个短字符串（长度 <=100）。
 * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
 * 示例 1:
 * s = "abc", t = "ahbgdc"
 * 返回 true.
 * 示例 2:
 * s = "axc", t = "ahbgdc"
 * 返回 false.
 * 后续挑战 :
 * 如果有大量输入的 S，称作S1, S2, ... , Sk 其中 k >= 10亿，你需要依次检查它们是否为 T 的子序列。在这种情况下，你会怎样改变代码？
 **/

public class JudgmentSubsequence {

    public static boolean isSubsequence(String s, String t) {
        // TODO
        // 双指针 时间复杂度 O(m+n) 空间复杂度 O(1)
//         int n = s.length(), m = t.length();
//         int i = 0,j = 0;
//         while (i < n && j < m) {
//             if (s.charAt(i) == t.charAt(j)) {
//                 i++;
//             }
//             j++;
//         }
//        return i == n;

        // 动态规划
        int n = s.length(), m = t.length();

        int[][] f = new int[m + 1][26];
        for (int i = 0; i < 26; i++) {
            f[m][i] = m;
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = 0; j < 26; j++) {
                if (t.charAt(i) == j + 'a') {
                    f[i][j] = i;
                } else {
                    f[i][j] = f[i + 1][j];
                }
            }
        }
        int add = 0;
        for (int i = 0; i < n; i++) {
            if (f[add][s.charAt(i) - 'a'] == m) {
                return false;
            }
            add = f[add][s.charAt(i) - 'a'] + 1;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        boolean r = isSubsequence(s, t);
        System.out.println(r);
    }
}
