package com.project.growing.demo.singleton;

import java.io.Serializable;

/**
 * @author shenya.ji.o
 * @date 2020/5/28
 * @description: 懒汉单例
 **/

public class SingletonLazy implements Serializable {
    /**
     * 定义实例变量，volatile必须添加，禁止重排列
     * volatile阻止的不singleton = newSingleton()这句话内部[1-2-3]的指令重排，
     * 而是保证了在一个写操作（[1-2-3]）完成之前，不会调用读操作（if (instance == null)）。
     * 也就彻底防止了6中的问题发生。
     */
    private volatile static SingletonLazy instance;

    /**
     * 私有构造器
     */
    private SingletonLazy() {
        if (instance != null) {
            throw new RuntimeException("单例已创建");
        }
    }

    /**
     * 获取实例对象
     */
    public static SingletonLazy getInstance() {
        if (instance == null) {
            synchronized (SingletonLazy.class) {
                if (instance == null) {
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }

    /**
     * 阻止序列化破坏单例
     */
    public Object readResolve(){
        return getInstance();
    }
}
