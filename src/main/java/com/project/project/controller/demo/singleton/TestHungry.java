package com.project.project.controller.demo.singleton;

/**
 * @author shenya.ji.o
 * @date 2020/5/28
 * @description: 懒汉单例test
 **/

public class TestHungry {
    SingletonHungry singletonHungry1 = SingletonHungry.instance;
    SingletonHungry singletonHungry2 = SingletonHungry.instance;
}
