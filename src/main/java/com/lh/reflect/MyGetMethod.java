package com.lh.reflect;

import java.lang.reflect.Method;

/**
 * Created by lh on 2016/11/8.
 * getDeclaredMethod*()获取的是类自身声明的所有方法，包含public、protected和private方法。
 * getMethod*()获取的是类的所有共有方法，这就包括自身的所有public方法，和从基类继承的、从接口实现的所有public方法。
 */
public class MyGetMethod {
    public static void main(String[] args) throws Exception {
        String methodName = "testMethod";
        String methodName2 = "testMethod2";
        Method method01 = Test.class.getMethod(methodName);  // 1
        Method method02 = Test.class.getDeclaredMethod(methodName);  // 2


        Method method03 = Test.class.getMethod(methodName2);  // 3
        Method method04 = Test.class.getDeclaredMethod(methodName2);  // 4
    }

    static class Test {
        public void testMethod() {
        }

        void testMethod2() {

        }
    }
}