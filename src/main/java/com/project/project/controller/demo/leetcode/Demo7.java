package com.project.project.controller.demo.leetcode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author shenya.ji.o
 * @date 2020/5/29
 * @description: 回文排列
 * 回文 去除重复的 之后 <= 1
 **/

public class Demo7 {
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
