package com.lh;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * Created by lh on 2016/11/3.
 * 创建的对象的几种方式
 */
public class StudentTest {

    String className = "com.lh.Student";

    @BeforeClass
    public static void before() {
        System.out.println("=========在所有测试方法执行前执行--beforeClass=====\n");
    }

    @Test
    public void testInfo() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> t = Class.forName(className);
        Student student = (Student) t.newInstance();
        System.out.println("名称:" + student.getName());
    }

    /**
     * 通过类的加载器来获取某个类
     *
     * @throws Exception
     */
    @Test
    public void testInfo2() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        Class<?> aClass = classLoader.loadClass(className);
        Student student = (Student) aClass.newInstance();
        System.out.println("名称:" + student.getName());
    }

    @Test
    public void testConstruction() throws Exception {
        Class<?> c1 = Class.forName(className);
        // 获取带有指定参数列表的构造方法的Constructor对象
        Constructor<?> constructor = c1.getConstructor(String.class, Integer.class);
        Student student = (Student) constructor.newInstance("张三", 5);
        System.out.println("名称:" + student.getName());
        // 获取指定类的所有构造器
        Constructor<?>[] constructors = c1.getDeclaredConstructors();
        for (Constructor<?> con : constructors) {
            System.out.println("constructor = " + con);
        }
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("==========在所有测试方法执行后执行--afterClass=====\n");
    }
}