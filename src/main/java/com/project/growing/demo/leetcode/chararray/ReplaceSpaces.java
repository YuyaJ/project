package com.project.growing.demo.leetcode.chararray;

/**
 * @author shenya.ji.o
 * @date 2020/6/18
 * @description: 替换空格
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 * 示例 1：
 * 输入：s = "We are happy."
 * 输出："We%20are%20happy."
 **/

public class ReplaceSpaces {
    public static String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "We are happy.";
        String result = replaceSpace(str);
        System.out.println(result);
    }
}
