package com.project.growing.utils;

import com.project.growing.demo.leetcode.binarytree.treenode.TreeNode;

/**
 * @author jsy
 * @date 2020/7/7
 * @description: 二叉树工具类
 **/

public class TreeUtils {

    /**
     * 数组转二叉树
     * @param array
     * @param index
     * @return
     */
    public static TreeNode createBinaryTreeByArray(Integer[] array, int index) {
        TreeNode tn = null;
        if (index < array.length) {
            Integer value = array[index];
            if (value == null) {
                return null;
            }

            tn = new TreeNode(value);
            tn.left = createBinaryTreeByArray(array, 2 * index + 1);
            tn.right = createBinaryTreeByArray(array, 2 * index + 2);
            return tn;
        }
        return tn;
    }
}
