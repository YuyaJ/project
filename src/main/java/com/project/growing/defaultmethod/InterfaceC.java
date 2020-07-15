package com.project.growing.defaultmethod;

/**
 * @author jsy
 */
public interface InterfaceC extends InterfaceA{
    /**
     * 注释方法 编译无法通过
     */
    @Override
    default void foo() {
        System.out.println("InterfaceC foo");
    }
}
