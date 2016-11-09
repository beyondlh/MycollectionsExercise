package com.lh.designpatterns.singleinstance;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by lh on 2016/11/9.
 */
public class Singleton {
    private final static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {
        return ourInstance;
    }

    private Singleton() {
        if (null != ourInstance) {
            throw new IllegalArgumentException("不能存在两个实例对象");
        }
    }


    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Constructor<Singleton>[] constructor = (Constructor<Singleton>[]) Singleton.class.getDeclaredConstructors();
        for (Constructor<Singleton> constructor1 : constructor) {
            final Object newInstance = constructor1.newInstance();
            System.out.print(newInstance == Singleton.getInstance());
        }
    }
}
