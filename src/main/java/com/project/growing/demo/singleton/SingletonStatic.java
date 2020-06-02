package com.project.growing.demo.singleton;

/**
 * @author shenya.ji.o
 * @date 2020/6/2
 * @description: 静态类内部加载(线程安全)
 **/

public class SingletonStatic {
    /**
     * 静态内部类
     */
    private static class SingletonHolder{
        private static SingletonStatic instance = new SingletonStatic();
    }

    /**
     * 私有构造器
     */
    private SingletonStatic(){

    }

    /**
     * 获取内部类中参数
     * @return
     */
    public static SingletonStatic getInstance(){
        return SingletonHolder.instance;
    }
}
