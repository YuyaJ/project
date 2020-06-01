package com.project.growing.demo.leetcode.audition;

/**
 * @author: 87799
 * @description: 字符串压缩
 * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。比如，字符串aabcccccaaa会变为a2b1c5a3。
 * 若“压缩”后的字符串没有变短，则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）
 * 示例1:
 *  输入："aabcccccaaa"
 *  输出："a2b1c5a3"
 **/

public class Demo6 {
    public static String compressString(String S) {
        // 为null 返回空字符串
        if (S == null) {
            return "";
        }
        int length = S.length();
        StringBuffer sb = new StringBuffer();

        // 长度为0 和 1 返回本身
        if (length == 0 || length == 1) {
            return S;
        }

        char[] strs = S.toCharArray();

        char temp = strs[0];
        int count = 1;

        for (int i = 1;i < strs.length; i++) {
            if (temp == strs[i]) {
                count++;
            } else {
                sb.append(temp).append(count);
                count = 1;
                temp= strs[i];
            }
        }
        // 添加最后一个元素 判断的结果
        sb.append(temp).append(count);

        if (length <= sb.length()) {
            return S;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "a";
        System.out.println(compressString(s));
    }
}
