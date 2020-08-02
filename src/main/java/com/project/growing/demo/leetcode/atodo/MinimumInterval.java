package com.project.growing.demo.leetcode.atodo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 87799
 * @date 2020/8/2
 * @description: 最小区间
 * 你有 k 个升序排列的整数数组。找到一个最小区间，使得 k 个列表中的每个列表至少有一个数包含在其中。
 * 我们定义如果 b-a < d-c 或者在 b-a == d-c 时 a < c，则区间 [a,b] 比 [c,d] 小。
 * 示例 1:
 * 输入:[[4,10,15,24,26], [0,9,12,20], [5,18,22,30]]
 * 输出: [20,24]
 * 解释:
 * 列表 1：[4, 10, 15, 24, 26]，24 在区间 [20,24] 中。
 * 列表 2：[0, 9, 12, 20]，20 在区间 [20,24] 中。
 * 列表 3：[5, 18, 22, 30]，22 在区间 [20,24] 中。
 * 注意:
 * 给定的列表可能包含重复元素，所以在这里升序表示 >= 。
 * 1 <= k <= 3500
 * -105 <= 元素的值 <= 105
 * 对于使用Java的用户，请注意传入类型已修改为List<List<Integer>>。重置代码模板后可以看到这项改动。
 **/

public class MinimumInterval {

    public static int[] smallestRange(List<List<Integer>> nums) {
        // TODO
        return new int[]{};
    }

    public static void main(String[] args) {
        List<List<Integer>> nums = new ArrayList<List<Integer>>(){{
            List<Integer> list1 = new ArrayList<Integer>(){{
                add(4);add(10);add(15);add(24);add(26);
            }};
            List<Integer> list2 = new ArrayList<Integer>(){{
                add(0);add(9);add(12);add(20);
            }};
            List<Integer> list3 = new ArrayList<Integer>(){{
                add(5);add(18);add(22);add(30);
            }};
            add(list1);
            add(list2);
            add(list3);
        }};
        int[] r = smallestRange(nums);
        System.out.println(Arrays.toString(r));
    }
}
