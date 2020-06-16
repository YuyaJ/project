package com.project.growing.demo.leetcode.audition;

/**
 * @author shenya.ji.o
 * @date 2020/5/29
 * @description: 面试题 01.03-URL化
 * URL化。编写一种方法，将字符串中的空格全部替换为%20。假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。（注：用Java实现的话，请使用字符数组实现，以便直接在数组上操作。）
 * 示例1:
 *  输入："Mr John Smith    ", 13
 *  输出："Mr%20John%20Smith"
 **/

public class URLization {
    public static String replaceSpaces(String S, int length) {
        // 1.API
//        return S.substring(0, length).replace(" ", "%20");

        // 2.StringBuffer
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < length; i++) {否互为字符重排
//            if (S.charAt(i) == ' ') {
//                sb.append("%20");
//            } else {
//                sb.append(S.charAt(i));
//            }
//        }
//
//        return sb.toString();

        // 3.字符数组
        char[] chars = new char[length * 3];
        int j = 0;
        for (int i = 0; i < length; i++) {
            if (S.charAt(i) == ' ') {
                chars[j++] = '%';
                chars[j++] = '2';
                chars[j++] = '0';
            } else {
                chars[j++] = S.charAt(i);
            }
        }
        return new String(chars, 0, j);

    }

    public static void main(String[] args) {
        String str = "Mr John Smith    ";
        int length = 13;

        String result = replaceSpaces(str, length);

        System.out.println(result);
    }
}
