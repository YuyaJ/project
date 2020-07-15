package com.project.growing.demo.leetcode.stackqueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author jsy
 * @date 2020/6/19
 * @description: 用两个栈实现队列
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 * 示例 1：
 * 输入：
 * ["CQueue","appendTail","deleteHead","deleteHead"]
 * [[],[3],[],[]]
 * 输出：[null,null,3,-1]
 * 示例 2：
 * 输入：
 * ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
 * [[],[],[5],[2],[],[]]
 * 输出：[null,-1,null,null,5,2]
 **/

public class TwoStackToQueue {

    Deque<Integer> stack1;
    Deque<Integer> stack2;

    public TwoStackToQueue(){
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty() && stack1.isEmpty()) {
            return -1;
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
        TwoStackToQueue obj = new TwoStackToQueue();
        obj.appendTail(1);
        obj.appendTail(2);
        int param = obj.deleteHead();
        System.out.println(param);
    }
}
