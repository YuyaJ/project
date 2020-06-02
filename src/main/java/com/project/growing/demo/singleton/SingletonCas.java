package com.project.growing.demo.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author shenya.ji.o
 * @date 2020/6/2
 * @description: 使用CAS锁实现单例(线程安全)
 * CAS实现了区别于synchronouse同步锁的一种乐观锁
 **/

public class SingletonCas {
    private static final AtomicReference<SingletonCas> INSTANCE = new AtomicReference<>();
    /**
     * 私有构造器
     */
    private SingletonCas(){

    }

    public static final SingletonCas getInstance() {
        for (;;) {
            SingletonCas singletonCas = INSTANCE.get();
            if (singletonCas != null) {
                return singletonCas;
            }
            singletonCas = new SingletonCas();
            if (INSTANCE.compareAndSet(null, singletonCas)) {
                return singletonCas;
            }
        }
    }
}
