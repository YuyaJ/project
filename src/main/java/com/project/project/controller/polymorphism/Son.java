package com.project.project.controller.polymorphism;

/**
 * @author jsy
 * @description: 2
 **/

public class Son extends Parent{
    @Override
    void call() {
        System.out.println("i am son");
    }
}
