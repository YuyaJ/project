package com.project.growing.demo.leetcode.atodo;

/**
 * @author jsy
 * @date 2020/8/10
 * @description: 计数二进制子串
 * 给定一个字符串s，计算具有相同数量0和1的非空(连续)子字符串的数量，并且这些子字符串中的所有0和所有1都是组合在一起的。
 * 重复出现的子串要计算它们出现的次数。
 * 示例 1 :
 * 输入: "00110011"
 * 输出: 6
 * 解释: 有6个子串具有相同数量的连续1和0：“0011”，“01”，“1100”，“10”，“0011” 和 “01”。
 * 请注意，一些重复出现的子串要计算它们出现的次数。
 * 另外，“00110011”不是有效的子串，因为所有的0（和1）没有组合在一起。
 * 示例 2 :
 * 输入: "10101"
 * 输出: 4
 * 解释: 有4个子串：“10”，“01”，“10”，“01”，它们具有相同数量的连续1和0。
 * 注意：
 * s.length 在1到50,000之间。
 * s 只包含“0”或“1”字符。
 **/

public class CountingBinarySubstrings {

    public static int countBinarySubstrings(String s) {
        int last, cur, res;
        last = res = 0;
        cur = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                cur++;
            } else {
                // 如果改了，说明从0 变到 1了，或者从 1变到 0了
                // 那刚才的cur就变成了现在的pre
                last = cur;
                cur = 1;
            }
            //  如果前一种值比当前的值多，就表明可以满足一个
            // 当pre小于cur的时候，
            // 就比如  00 111， 从00 1 到 00 11 到 00 111 加了两次count，
            // 第三次就加不了了，因为00111 已经不满足个数相等了
            if (last >= cur) {
                res++;
            }
        }
        return res;

        // 按字符分组
//        int ptr = 0, n = s.length(), last = 0, ans = 0;
//        while (ptr < n) {
//            char c = s.charAt(ptr);
//            int count = 0;
//            while (ptr < n && s.charAt(ptr) == c) {
//                ++ptr;
//                ++count;
//            }
//            ans += Math.min(count, last);
//            last = count;
//        }
//        return ans;
    }

    public static void main(String[] args) {
        String s = "00110011";
        int r = countBinarySubstrings(s);
        System.out.println(r);
    }
}
