package com.project.growing.demo.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author jsy
 * @date 2020/6/2
 * @description: 使用CAS锁实现单例(线程安全)
 * synchronized是悲观锁，这种线程一旦得到锁，其他需要锁的线程就挂起的情况就是悲观锁。
 * CAS操作的就是乐观锁，每次不加锁而是假设没有冲突而去完成某项操作，如果因为冲突失败就重试，直到成功为止
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
