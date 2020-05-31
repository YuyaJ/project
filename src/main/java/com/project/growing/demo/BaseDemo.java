package com.project.growing.demo;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author shenya.ji.o
 * @date 2020/5/25
 * @description: 基础
 **/

public class BaseDemo {
    // 静态属性
    private static String staticField = getStaticField();
    // 静态方法块
    static {
        System.out.println(staticField);
        System.out.println("静态方法块初始化");
    }
    // 普通属性
    private String field = getField();
    // 普通方法块
    {
        System.out.println(field);
    }
    // 构造函数
    public BaseDemo() {
        System.out.println("构造函数初始化");
    }

    public static String getStaticField() {
        String statiFiled = "Static Field Initial";
        return statiFiled;
    }

    public static String getField() {
        String filed = "Field Initial";
        return filed;
    }

    public static void main(String[] args) {
        new BaseDemo();
        System.out.println(BaseDemo.staticField);

        HashSet hashSet = new HashSet();
        hashSet.add("aaa");
        hashSet.add("bbb");
        hashSet.add(null);
        System.out.println(hashSet.toString());

        Set hashSet1 = Collections.synchronizedSet(new HashSet<>());
        hashSet1.add("ccc");
        hashSet1.add("ddd");
        hashSet1.add(null);
        System.out.println(hashSet1.toString());

        List list = new CopyOnWriteArrayList();
        list.add("1");
        list.add("2");
        System.out.println(list.toString());

        Map map = new ConcurrentHashMap();
    }
}
