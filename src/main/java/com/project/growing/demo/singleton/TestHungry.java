package com.project.growing.demo.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author shenya.ji.o
 * @date 2020/5/28
 * @description: 懒汉单例test
 **/

public class TestHungry {

    public static void main(String[] args) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        SingletonHungry singletonHungry1 = SingletonHungry.getSingleton();
        SingletonHungry singletonHungry2 = SingletonHungry.getSingleton();
        System.out.println(singletonHungry1.hashCode());
        System.out.println(singletonHungry2.hashCode());

        // 反射破坏单例模式
//        Class<SingletonHungry> singletonHungryClass = SingletonHungry.class;
//        Constructor<SingletonHungry> singletonHungryConstructor = singletonHungryClass.getDeclaredConstructor();
//        singletonHungryConstructor.setAccessible(true);
//
//        SingletonHungry singletonHungry3 = singletonHungryConstructor.newInstance();
//
//        System.out.println(singletonHungry3.hashCode());
//
//        SingletonHungry singletonHungry4 = SingletonHungry.getSingleton();
//        System.out.println(singletonHungry4.hashCode());

        // 序列化破坏代理模式
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("tempfile"));
        objectOutputStream.writeObject(SingletonHungry.getSingleton());

        File file = new File("tempfile");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        Object object = objectInputStream.readObject();
        SingletonHungry singletonHungry5 = (SingletonHungry)object;
        System.out.println(singletonHungry5.hashCode());

    }
}
