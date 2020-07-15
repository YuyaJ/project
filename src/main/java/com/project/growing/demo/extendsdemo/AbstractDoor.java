package com.project.growing.demo.extendsdemo;

/**
 * @author jsy
 * @date 2020/5/22
 * @description: abstract
 **/

public abstract class AbstractDoor {
    abstract void open();

    abstract void close();

    void hot(){
        System.out.println("hot");
    }

    protected void sale() {
        System.out.println("sale");
    }
}
