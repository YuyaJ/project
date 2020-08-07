package com.project.growing.demo.leetcode.chararray;

/**
 * @author jsy
 * @date 2020/8/4
 * @description: 字符串相加
 * 给定两个字符串形式的非负整数num1 和num2，计算它们的和。
 * 提示：
 * num1 和num2的长度都小于 5100
 * num1 和num2 都只包含数字0-9
 * num1 和num2 都不包含任何前导零
 * 你不能使用任何內建 BigInteger 库，也不能直接将输入的字符串转换为整数形式
 **/

public class StringAddition {

    public static String addStrings(String num1, String num2) {
        char[] chars1 = num1.toCharArray();
        char[] chars2 = num2.toCharArray();

        int length1 = chars1.length-1;
        int length2 = chars2.length-1;

        int carry = 0;
        StringBuffer sb = new StringBuffer();

        while (length1 >= 0 || length2 >= 0 || carry != 0) {
            int a = length1 < 0 ? 0 : chars1[length1] - '0';
            int b = length2 < 0 ? 0 : chars2[length2] - '0';

            int temp = a + b + carry;
            sb.append(temp % 10);
            carry = temp / 10;

            length1--;
            length2--;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String num1 = "72", num2 = "29";
        String r = addStrings(num1, num2);
        System.out.println(r);
    }
}
