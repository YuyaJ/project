package com.project.growing.demo.leetcode.perday;

import java.util.Arrays;

/**
 * @author shenya.ji.o
 * @date 2020/6/8
 * @description: 每日一题-等式方程的可满足性(并查集)
 * 给定一个由表示变量之间关系的字符串方程组成的数组，每个字符串方程 equations[i] 的长度为 4，并采用两种不同的形式之一："a==b" 或 "a!=b"。在这里，a 和 b 是小写字母（不一定不同），表示单字母变量名。
 * 只有当可以将整数分配给变量名，以便满足所有给定的方程时才返回 true，否则返回 false。 
 * 示例 1：
 * 输入：["a==b","b!=a"]
 * 输出：false
 * 解释：如果我们指定，a = 1 且 b = 1，那么可以满足第一个方程，但无法满足第二个方程。没有办法分配变量同时满足这两个方程。
 * 示例 2：
 * 输出：["b==a","a==b"]
 * 输入：true
 * 解释：我们可以指定 a = 1 且 b = 1 以满足满足这两个方程。
 * 示例 3：
 * 输入：["a==b","b==c","a==c"]
 * 输出：true
 * 示例 4：
 * 输入：["a==b","b!=c","c==a"]
 * 输出：false
 * 示例 5：
 * 输入：["c==c","b==d","x!=z"]
 * 输出：true
 **/

public class SatisfiabilityOfEquations {
    public static boolean equationsPossible(String[] equations) {
        int length = equations.length;
        int[] parent = new int[26];
        for (int i = 0; i < 26; i++) {
            parent[i] = i;
        }
        System.out.println(Arrays.toString(parent));
        for (String str : equations) {
            if (str.charAt(1) == '=') {
                int index1 = str.charAt(0) - 'a';
                int index2 = str.charAt(3) - 'a';
                union(parent, index1, index2);
            }
        }
        for (String str : equations) {
            if (str.charAt(1) == '!') {
                int index1 = str.charAt(0) - 'a';
                int index2 = str.charAt(3) - 'a';
                // 如果根节点一致 重复
                if (find(parent, index1) == find(parent, index2)) {
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * 添加到根节点上
     * @param parent
     * @param index1
     * @param index2
     */
    public static void union(int[] parent, int index1, int index2) {
        parent[find(parent, index1)] = find(parent, index2);
        System.out.println(Arrays.toString(parent));
    }

    /**
     * 获取 根节点
     * @param parent
     * @param index
     * @return
     */
    public static int find(int[] parent, int index) {
        while (parent[index] != index) {
            parent[index] = parent[parent[index]];
            index = parent[index];
        }
        System.out.println(Arrays.toString(parent));
        return index;
    }

    public static void main(String[] args) {
        String[] equations = {"c==c","b==d","x!=z"};
        boolean result = equationsPossible(equations);
        System.out.println(result);
    }
}
