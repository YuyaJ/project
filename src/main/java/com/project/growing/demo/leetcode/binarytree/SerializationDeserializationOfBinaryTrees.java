package com.project.growing.demo.leetcode.binarytree;

/**
 * @author shenya.ji.o
 * @date 2020/6/16
 * @description: 二叉树的序列化与反序列化
 * 序列化是将一个数据结构或者对象转换为连续的比特位的操作，进而可以将转换后的数据存储在一个文件或者内存中，同时也可以通过网络传输到另一个计算机环境，采取相反方式重构得到原数据。
 * 请设计一个算法来实现二叉树的序列化与反序列化。这里不限定你的序列 / 反序列化算法执行逻辑，你只需要保证一个二叉树可以被序列化为一个字符串并且将这个字符串反序列化为原始的树结构。
 * 示例:
 * 你可以将以下二叉树：
 * 1
 * / \
 * 2   3
 * / \
 * 4   5
 * 序列化为 "[1,2,3,null,null,4,5]"
 * 提示: 这与 LeetCode 目前使用的方式一致，详情请参阅 LeetCode 序列化二叉树的格式。你并非必须采取这种方式，你也可以采用其他的方法解决这个问题。
 * 说明: 不要使用类的成员 / 全局 / 静态变量来存储状态，你的序列化和反序列化算法应该是无状态的。
 **/

public class SerializationDeserializationOfBinaryTrees {
    /**
     * Encodes a tree to a single string.
     *
     * @param root
     * @return
     */
    public static String serialize(TreeNode root) {

        return "";
    }

    /**
     * Decodes your encoded data to tree.
     *
     * @param data
     * @return
     */
    public static TreeNode deserialize(String data) {
        return new TreeNode(0);
    }

    public static void main(String[] args) {
        // TODO
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
