package com.project.growing.demo.leetcode.enumerate;

/**
 * @author shenya.ji.o
 * @date 2020/6/22
 * @description: 模式匹配
 * 你有两个字符串，即pattern和value。 pattern字符串由字母"a"和"b"组成，用于描述字符串中的模式。例如，字符串"catcatgocatgo"匹配模式"aabab"（其中"cat"是"a"，"go"是"b"），该字符串也匹配像"a"、"ab"和"b"这样的模式。但需注意"a"和"b"不能同时表示相同的字符串。编写一个方法判断value字符串是否匹配pattern字符串。
 * 示例 1：
 * 输入： pattern = "abba", value = "dogcatcatdog"
 * 输出： true
 * 示例 2：
 * 输入： pattern = "abba", value = "dogcatcatfish"
 * 输出： false
 * 示例 3：
 * 输入： pattern = "aaaa", value = "dogcatcatdog"
 * 输出： false
 * 示例 4：
 * 输出： true
 * 解释： "a"="dogdog",b=""，反之也符合规则
 **/

public class PatternMatching {
    public static boolean patternMatching(String pattern, String value) {
        // TODO

        if (value.isEmpty()) {

            if (pattern.isEmpty()) {
                return true;
            }

            boolean ff = (pattern.contains("a") && !pattern.contains("b")) || (pattern.contains("b") && !pattern.contains("a"));
            if (ff) {
                return true;
            }

            return false;
        }

        if (pattern.isEmpty()) {
            return false;
        }

        String a, b;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        boolean flag = false;

        for (int i = 0; i < value.length(); i++) {
            if (flag) {
                String str1 = "";
                String str2 = "";
                String p1 = pattern.replace("a", "");
                String p2 = pattern.replace("b", "");
                if (sb1.length() == 0) {
                    str1 = value.replace(sb, "a");
                    str2 = value.replace(sb, "b");
                } else {
                    str1 = value.replace(sb, "a").replace(sb1, "b");
                    str2 = value.replace(sb, "b").replace(sb1, "a");
                }

                if (str1.equals(pattern) || str2.equals(pattern) || str1.equals(p1)
                        || str2.equals(p1) || str1.equals(p2) || str2.equals(p2)) {
                    return true;
                } else {
                    flag = false;
                }
            }
            String temp = value;
            sb.append(value.charAt(i));
            temp = temp.replace(sb, "");
            a = sb.toString();

            sb1 = new StringBuilder();

            if (temp.isEmpty()) {
                flag = true;
                continue;
            }

            for (int j = 0; j < temp.length(); j++) {
                String temp1 = temp;
                sb1.append(temp.charAt(j));

                temp1 = temp1.replace(sb1, "");
                b = sb1.toString();
                if (temp1.isEmpty()) {
                    flag = true;
                    break;
                }
            }
        }

        boolean p1 = pattern.contains("a") && pattern.indexOf("a") == pattern.lastIndexOf("a");
        boolean p2 = pattern.contains("b") && pattern.indexOf("b") == pattern.lastIndexOf("b");

        if (p1 || p2) {
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        String pattern = "baabab";
        String value = "eimmieimmieeimmiee";
        boolean result = patternMatching(pattern, value);
        System.out.println(result);
    }
}
