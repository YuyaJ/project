package com.project.growing.demo.singleton;

/**
 * @author shenya.ji.o
 * @date 2020/6/2
 * @description: 枚举方法(线程安全)
 **/

public enum SingletonEnum {
    /**
     * 实例
     */
    INSTANCE;
    public void otherMethod(){
        System.out.println("Something");
    }
}
