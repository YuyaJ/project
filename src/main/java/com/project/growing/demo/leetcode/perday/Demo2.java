package com.project.growing.demo.leetcode.perday;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author shenya.ji.o
 * @date 2020/6/1
 * @description: 每日一题-拥有最多糖果的孩纸(枚举)
 * 给你一个数组 candies 和一个整数 extraCandies ，其中 candies[i] 代表第 i 个孩子拥有的糖果数目。
 * 对每一个孩子，检查是否存在一种方案，将额外的 extraCandies 个糖果分配给孩子们之后，此孩子有 最多 的糖果。注意，允许有多个孩子同时拥有 最多 的糖果数目。
 * 示例 1：
 * 输入：candies = [2,3,5,1,3], extraCandies = 3
 * 输出：[true,true,true,false,true]
 * 解释：
 * 孩子 1 有 2 个糖果，如果他得到所有额外的糖果（3个），那么他总共有 5 个糖果，他将成为拥有最多糖果的孩子。
 * 孩子 2 有 3 个糖果，如果他得到至少 2 个额外糖果，那么他将成为拥有最多糖果的孩子。
 * 孩子 3 有 5 个糖果，他已经是拥有最多糖果的孩子。
 * 孩子 4 有 1 个糖果，即使他得到所有额外的糖果，他也只有 4 个糖果，无法成为拥有糖果最多的孩子。
 * 孩子 5 有 3 个糖果，如果他得到至少 2 个额外糖果，那么他将成为拥有最多糖果的孩子。
 **/

public class Demo2 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int n = candies.length;
        int maxCandies = 0;
        for (int i = 0; i < n; ++i) {
            maxCandies = Math.max(maxCandies, candies[i]);
        }
        List<Boolean> ret = new ArrayList<Boolean>();
        for (int i = 0; i < n; ++i) {
            ret.add(candies[i] + extraCandies >= maxCandies);
        }
        return ret;

//        List<Boolean> resultList = new ArrayList<>();
//        // 获取目前糖果最多的孩纸
//        int max = Arrays.stream(candies).max().getAsInt();
//        // int[] -> List<Integer>
//        // 1.先转成stream流 2.boxed 转成Integer 3.map 装成Boolean 4.最后转成List<Boolean>
//        resultList = Arrays.stream(candies).boxed().map(item -> item+extraCandies >= max).collect(Collectors.toList());
//
//        return resultList;
    }

    public static void main(String[] args) {
        int[] candies = {12, 1, 12};
        int extraCandies = 10;
        List<Boolean> list = kidsWithCandies(candies, extraCandies);
        System.out.println(list);
    }
}
