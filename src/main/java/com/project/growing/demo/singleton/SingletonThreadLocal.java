package com.project.growing.demo.singleton;

/**
 * @author jsy
 * @date 2020/6/2
 * @description: 使用ThreadLocal实现单例模式(线程安全) 不适用synchronized
 * ThreadLocal会为每一个线程提供一个独立的变量副本，从而隔离了多个线程对数据的访问冲突。对于多线程资源共享的问题，同步机制采用了“以时间换空间”的方式，
 * 而ThreadLocal采用了“以空间换时间”的方式。前者仅提供一份变量，让不同的线程排队访问，而后者为每一个线程都提供了一份变量，因此可以同时访问而互不影响
 **/

public class SingletonThreadLocal {
    public static final ThreadLocal<SingletonThreadLocal> tlSingleton = new ThreadLocal<SingletonThreadLocal>() {
        protected SingletonThreadLocal initialValur() {
            return new SingletonThreadLocal();
        }
    };

    public static SingletonThreadLocal getInstance() {
        return tlSingleton.get();
    }

    private SingletonThreadLocal(){

    }
}
