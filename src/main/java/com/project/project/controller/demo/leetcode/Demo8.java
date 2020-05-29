package com.project.project.controller.demo.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author shenya.ji.o
 * @date 2020/5/29
 * @description: 一次编辑
 **/

public class Demo8 {
    public static boolean oneEditAway(String first, String second) {
        if (first == second) {
            return true;
        }

        if (first == null || second == null) {
            return false;
        }

        int num = Math.abs(first.length() - second.length());

        if (num > 1) {
            return false;
        }

        // 位数一直 同样下标索引 值不同计数
        int disNum = 0;
        if (num == 0) {
            for (int i = 0; i < first.length(); i++ ) {
                if (first.charAt(i) != second.charAt(i)) {
                    disNum++;
                }
            }

            return disNum <= 1;
        }

        // 位数不一致 比较两者长度 统一作为删除处理 first作为被删除字符
        if (first.length() < second.length()) {
            String temp = second;
            second = first;
            first = temp;
        }

        for (int i = 0,j = 0; i < first.length(); i++,j++) {
            if (first.charAt(i) != second.charAt(j)) {
                disNum++;
                // 第i个不一致 假设就是在second删除元素的位置
                // 继续比较就从i+1位置开始 比较first的下一位
                i++;
            }
        }

        return disNum <= 1;
    }

    public static void main(String[] args) {
        String first = "",second = "a";
        System.out.println(oneEditAway(first, second));
    }
}
