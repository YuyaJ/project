package com.project.growing.defaultmethod;

/**
 * @author shenya.ji.o
 */
public interface InterfaceB extends InterfaceA{
    @Override
    default void foo() {
        System.out.println("InterfaceB foo");
    }
}
