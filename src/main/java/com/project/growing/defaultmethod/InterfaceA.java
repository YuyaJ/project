package com.project.growing.defaultmethod;

/**
 * @author jsy
 */
public interface InterfaceA {
    default void foo() {
        System.out.println("InterfaceA foo");
    }
}
