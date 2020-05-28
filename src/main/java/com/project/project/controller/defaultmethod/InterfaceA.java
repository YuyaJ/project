package com.project.project.controller.defaultmethod;

/**
 * @author shenya.ji.o
 */
public interface InterfaceA {
    default void foo() {
        System.out.println("InterfaceA foo");
    }
}
