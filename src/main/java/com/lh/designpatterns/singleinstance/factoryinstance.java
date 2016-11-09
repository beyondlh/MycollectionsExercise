package com.lh.designpatterns.singleinstance;

/**
 * Created by lh on 2016/11/9.
 * 工厂方法的优势在于灵活性，在不改变API的前提下，我们可以修改该类
 是否为单例，还是为每一个线程构建一个实例对象
 */
public class factoryinstance {
    private static factoryinstance f = new factoryinstance();

    private factoryinstance() {
        if (f != null) {
//            通过反射构造函数调用会抛出异常
            throw new IllegalArgumentException("不允许存在多个实例");
        }
    }

    public static factoryinstance getInstance() {
        return f;
    }
}
