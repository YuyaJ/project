package com.project.growing.demo.leetcode.atodo;

/**
 * @author jsy
 * @date 2020/8/13
 * @description: 字符串相乘
 * 给定两个以字符串形式表示的非负整数num1和num2，返回num1和num2的乘积，它们的乘积也表示为字符串形式。
 * 示例 1:
 * 输入: num1 = "2", num2 = "3"
 * 输出: "6"
 * 示例2:
 * 输入: num1 = "123", num2 = "456"
 * 输出: "56088"
 * 说明：
 * num1和num2的长度小于110。
 * num1 和num2 只包含数字0-9。
 * num1 和num2均不以零开头，除非是数字 0 本身。
 * 不能使用任何标准库的大数类型（比如 BigInteger）或直接将输入转换为整数来处理。
 **/

public class StringMultiply {

    public static String multiply(String num1, String num2) {

        int length1 = num1.length()-1, length2 = num2.length()-1;
        if (length1 < length2) {
            return multiply(num2, num1);
        }

        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }

        int type = 0;
        String r = "";

        while (length2 >=0) {
            int b = num2.charAt(length2)-'0';

            String n = multiplyNum(num1, b);
            for (int i = 0; i < type; i++) {
                n += "0";
            }
            r = addNum(n, r, type);

            type++;
            length2--;
        }

        return r;
    }

    public static String addNum(String x, String y, int type) {
        if (y.isEmpty()) {
            return x;
        }

        StringBuffer r = new StringBuffer();
        int length1 = x.length()-1,length2 = y.length()-1, carry = 0;
        while (length1 >= 0 || length2 >= 0 || carry != 0) {
            int a = length1 < 0 ? 0 : x.charAt(length1)-'0';
            int b = length2 < 0 ? 0 : y.charAt(length2)-'0';

            int temp = a + b + carry;
            r.append(temp % 10);
            carry = temp / 10;

            length1--;
            length2--;
        }
        r.reverse();
        return r.toString();
    }

    public static String multiplyNum(String x, int y) {
        StringBuffer r = new StringBuffer();
        int length = x.length()-1, carry = 0;
        while (length >= 0 || carry != 0) {
            int a = length < 0 ? 0 : x.charAt(length)-'0';

            int temp = a * y + carry;
            r.append(temp % 10);
            carry = temp / 10;

            length--;
        }
        r.reverse();
        return r.toString();
    }

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        String r = multiply(num1, num2);
        System.out.println(r);
    }
}
