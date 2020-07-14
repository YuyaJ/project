package com.project.growing.demo.leetcode.hashtable;

import java.util.*;

/**
 * @author shenya.ji.o
 * @date 2020/7/13
 * @description: 两个数组的交集
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 示例 1:
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2,2]
 * 示例 2:
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [4,9]
 * 说明：
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 * 进阶:
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 **/

public class IntersectionOfTwoArrays {

    public static int[] intersect(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            return intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums1) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }
        int[] intersection = new int[nums1.length];
        int index = 0;
        for (int num : nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                intersection[index++] = num;
                count--;
                if (count > 0) {
                    map.put(num, count);
                } else {
                    map.remove(num);
                }
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);

//        Map<Integer, Integer> map1 = new HashMap<>(16);
//        Map<Integer, Integer> map2 = new HashMap<>(16);
//
//        for (int i : nums1) {
//            map1.merge(i, 1, Integer::sum);
//        }
//        for (int i : nums2) {
//            map2.merge(i, 1, Integer::sum);
//        }
//        int idx = 0, count = 0;
//        int length = Math.min(nums1.length, nums2.length);
//        int[] out = new int[length];
//        for (Integer i : map1.keySet()) {
//            if (map2.containsKey(i)) {
//                count = Math.min(map1.get(i), map2.get(i));
//                for (int j = 0; j < count; j++) {
//                    out[idx++] = i;
//                }
//            }
//        }
//        return Arrays.copyOf(out, idx);
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        int[] r = intersect(nums1, nums2);
        System.out.println(Arrays.toString(r));
    }
}
