package com.project.growing.demo.singleton;

/**
 * @author shenya.ji.o
 * @date 2020/5/28
 * @description: 饿汉单例
 * 类加载时调用
 **/

public class SingletonHungry {
    /**
     * 创建实例对象
     */
    private static final SingletonHungry instance = new SingletonHungry();

    /**
     * 创建私有构造器
     */
    private SingletonHungry(){}
}
