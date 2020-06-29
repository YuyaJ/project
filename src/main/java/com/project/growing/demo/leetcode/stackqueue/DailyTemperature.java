package com.project.growing.demo.leetcode.stackqueue;

import java.util.*;

/**
 * @author shenya.ji.o
 * @date 2020/6/11
 * @description: 每日温度(单调栈)
 * 根据每日 气温 列表，请重新生成一个列表，对应位置的输出是需要再等待多久温度才会升高超过该日的天数。如果之后都不会升高，请在该位置用 0 来代替。
 * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
 * 提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的均为华氏度，都是在 [30, 100] 范围内的整数。
 **/

public class DailyTemperature {
    public static int[] dailyTemperatures(int[] T) {
        int length = T.length;
        int[] result = new int[length];

        // 暴力解法 时间复杂度 O(nm) 空间复杂度O(m)
//        for (int i = 0; i < length; i++) {
//            int index = T[i];
//            if (index < 100) {
//                for (int j = i + 1; j < length; j++) {
//                    int last = T[j];
//                    if (index < last) {
//                        result[i] = j - i;
//                        break;
//                    }
//                }
//            }
//        }

        // 单调栈 栈里面放下标 时间复杂度：O(n) 时间复杂度：O(n)
        Deque<Integer> stack = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            int temp = T[i];
            // 栈不为空 当前元素大于栈顶元素
            // peek() 获取栈顶元素值 不移除元素
            // pop() 获取栈顶元素 移除元素
            while (!stack.isEmpty() && temp > T[stack.peek()]) {
                int index = stack.pop();
                // 当前元素下标减去栈顶元素下标 即为栈顶元素需要前进的数字
                result[index] = i - index;
            }
            stack.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = dailyTemperatures(T);
        System.out.println(Arrays.toString(result));
    }
}
