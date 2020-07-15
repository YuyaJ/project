package com.project.growing.demo.singleton;

import java.io.Serializable;

/**
 * @author jsy
 * @date 2020/5/28
 * @description: 饿汉单例(线程安全)
 * 类加载时调用
 **/

public class SingletonHungry implements Serializable {
    /**
     * 创建实例对象
     */
    private static final SingletonHungry instance = new SingletonHungry();

    /**
     * 创建私有构造器
     */
    private SingletonHungry(){
        // 阻止反射 破坏单例模式
        if (instance != null) {
            throw new RuntimeException("单例已创建");
        }
    }

    /**
     * 获取实例对象
     */
    public static SingletonHungry getSingleton(){
        return instance;
    }

    /**
     * 阻止序列化破坏单例模式, 添加如下代码
     */
    public Object readResolve() {
        return getSingleton();
    }
}
