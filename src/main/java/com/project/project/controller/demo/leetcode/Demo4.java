package com.project.project.controller.demo.leetcode;

/**
 * @author shenya.ji.o
 * @date 2020/5/29
 * @description: 判断字符是否唯一
 **/

public class Demo4 {

    public static boolean isUnique(String astr) {
        for (char str : astr.toCharArray()) {
            if (astr.indexOf(str) != astr.lastIndexOf(str)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(isUnique(str));
    }
}
