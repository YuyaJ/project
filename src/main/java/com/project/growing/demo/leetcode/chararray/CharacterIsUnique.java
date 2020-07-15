package com.project.growing.demo.leetcode.chararray;

/**
 * @author jsy
 * @date 2020/5/29
 * @description: 面试题 01.01-判断字符是否唯一
 * 实现一个算法，确定一个字符串 s 的所有字符是否全都不同。
 * 示例 1：
 * 输入: s = "leetcode"
 * 输出: false
 **/

public class CharacterIsUnique {

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
