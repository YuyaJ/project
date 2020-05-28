package com.project.project.controller.polymorphism;

/**
 * @author jsy
 * @description: 4
 **/

public class Test {
    public static void main(String[] args) {
        Parent p = new Son();
        Parent p1 = new Daughter();
        p.call();
        p1.call();
    }
}
