package com.project.growing.demo.basedemo;

/**
 * @author jsy
 */
public class CpuNum {
    public static void main(String[] args) {

        String str = "111";
        String str1 = "222";
        Boolean flag = true;

        // 获取CPU 数量
        int ncpus = Runtime.getRuntime().availableProcessors();
        System.out.println(ncpus);
    }

}
