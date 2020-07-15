package com.project.growing.defaultmethod;

/**
 * @author jsy
 */
public interface InterfaceB extends InterfaceA{
    @Override
    default void foo() {
        System.out.println("InterfaceB foo");
    }
}
