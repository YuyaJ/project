package com.project.project.controller.demo.leetcode;

import org.apache.tomcat.util.buf.StringUtils;

import java.util.Arrays;

/**
 * @author shenya.ji.o
 * @date 2020/5/29
 * @description: URL化
 **/

public class Demo6 {
    public static String replaceSpaces(String S, int length) {
        // 1.API
//        return S.substring(0, length).replace(" ", "%20");

        // 2.StringBuffer
//        StringBuffer sb = new StringBuffer();
//        for (int i = 0; i < length; i++) {
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
