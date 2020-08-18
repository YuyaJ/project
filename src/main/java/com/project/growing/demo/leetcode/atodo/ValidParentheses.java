package com.project.growing.demo.leetcode.atodo;

import java.util.*;

/**
 * @author jsy
 * @date 2020/8/14
 * @description: 有效括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']'的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * 示例 1:
 * 输入: "()"
 * 输出: true
 * 示例2:
 * 输入: "()[]{}"
 * 输出: true
 * 示例3:
 * 输入: "(]"
 * 输出: false
 * 示例4:
 * 输入: "([)]"
 * 输出: false
 * 示例5:
 * 输入: "{[]}"
 * 输出: true
 **/

public class ValidParentheses {

    public static boolean isValid(String s) {
        // TODO
        int length = s.length();
        if (length % 2 == 1) {
            return false;
        }
        Deque<Character> stack = new LinkedList<>();
//        Stack<Character> stack = new Stack<>();

        // 哈希映射
        Map<Character, Character> map = new HashMap<Character, Character>(16) {{
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }};

        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            if (map.containsKey(s.charAt(i))) {
                if (stack.isEmpty() || !stack.peek().equals(map.get(ch))) {
                    return false;
                }
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "[()]";
        boolean r = isValid(s);
        System.out.println(r);
    }
}
