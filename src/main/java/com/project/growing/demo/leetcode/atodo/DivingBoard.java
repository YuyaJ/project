package com.project.growing.demo.leetcode.atodo;

import java.util.Arrays;

/**
 * @author jsy
 * @date 2020/7/8
 * @description: 跳水板
 * 你正在使用一堆木板建造跳水板。有两种类型的木板，其中长度较短的木板长度为shorter，长度较长的木板长度为longer。你必须正好使用k块木板。编写一个方法，生成跳水板所有可能的长度。
 * 返回的长度需要从小到大排列。
 * 示例：
 * 输入：
 * shorter = 1
 * longer = 2
 * k = 3
 * 输出： {3,4,5,6}
 * 提示：
 * 0 < shorter <= longer
 * 0 <= k <= 100000
 **/

public class DivingBoard {

    public static int[] divingBoard(int shorter, int longer, int k) {

        if (k == 0) {
            return new int[0];
        }

        if (shorter == longer) {
            return new int[]{k * shorter};
        }

        int[] result = new int[k + 1];
        result[0] = shorter * k;
        for (int i = 1; i <= k; i++) {
            result[i] = (k - i) * shorter + i * longer;
        }

        return result;
    }

    public static void main(String[] args) {
        int shorter = 1, longer = 1, k = 1;
        int[] result = divingBoard(shorter, longer, k);
        System.out.println(Arrays.toString(result));
    }
}
