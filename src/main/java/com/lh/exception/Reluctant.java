package com.lh.exception;

/**
 * Created by lh on 2016/11/3.
 * main 方法调用了 Reluctant 构造器，它将抛出一个异常。你可能期望catch 子句能够捕获这个异常，并且打印 I told you so。
 * 凑近仔细看看这个程序就会发现，Reluctant 实例还包含第二个内部实例，它的构造器也会抛出一个异常。无论抛出哪一个异常，看起来main 中的catch 子句都应该捕获它，但是当尝试着去运行它时，就会发现它压根没有去做这类的事情：它抛出了 StackOverflowError 异常，为什么呢？
 与大多数抛出 StackOverflowError 异常的程序一样，本程序也包含了一个无限递归。
 当你调用一个构造器时，实例变量的初始化操作将先于构造器的程序体而运行。在本题中， internalInstance 变量的初始化操作递归调用了构造器，而该构造器通过再次调用Reluctant 构造器而初始化该变量自己的 internalInstance 域，如此无限递归下去。这些递归调用在构造器程序体获得执行机会之前就会抛出StackOverflowError 异常，
 而它是Error 的子类型而不是Exception 的子类型，所以catch 子句无法捕获它。
 对于一个对象包含与它自己类型相同的实例的情况，并不少见。例如，链接节点、树节点和图节点都属于这种情况。
 必须非常小心地初始化这样的包含实例，以避免StackOverflowError 异常。

 解析
 */
public  class Reluctant {
    private Reluctant internalInstance = new Reluctant();

    public Reluctant() throws Exception {
        throw new Exception("I'm not coming out");
    }

    public static void main(String[] args) {
        try {
            Reluctant b = new Reluctant();
            System.out.println("Surprise!");
        } catch (Exception ex) {
            System.out.println("I told you so");
        }
    }
}
