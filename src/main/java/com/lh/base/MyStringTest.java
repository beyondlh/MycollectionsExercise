package com.lh.base;

import java.lang.reflect.Field;

/**
 * Created by lh on 2016/11/3.
 * Java中String类型是否不可变？
 * 通过反射是可以改变String的值，修改前后的hashcode是不变的，表示是同一个对象，但是值改变了。
 */
public class MyStringTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String test1 = "hello world";
        String test2 = "hello world";
        String test3 = "hello";
        System.out.println("改变前的hashCode:"+test1.hashCode());
        System.out.println(test1);

        Field valueField  = String.class.getDeclaredField("value");
        valueField.setAccessible(true);
        char[] chars = {'小','明','是','我'};
        valueField.set(test1,chars);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println("改变后的hashCode:"+test1.hashCode());
    }
}
