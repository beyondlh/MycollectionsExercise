package com.lh.exception;

/**
 * Created by lh on 2016/10/23.
 */
/*众所周知，在一个try-finally 语句中，finally 语句块总是在控制权离开try 语句块时执行的，
但是finally中如果有return则try中的return结果不再返回给主调者，所以返回的结果是
2。即，如果finally里也有返回语句，那么以finally的为主。也就是说，千万不要用一个return、break、continue 或throw 来退出一个finally 语句块，
且千万不要允许将一个受检查的异常传播到一个finally 语句块之外去。容易出一些潜在bug。*/
public class Foo {
    public static void main(String args[]) {
        Foo t = new Foo();
        int b = t.get();
        int[] m = {1,3};
        System.out.println(b);
        System.out.println(m[6]);

        /*
        好像看起来应该是可以编译的，但是本程序编译期间错误。
        try 子句执行打印的I/O操作，并且catch 子句捕获 IOException 异常。
        但是这不能编译，因为println 方法没有声明会抛出任何被检查异常，而 IOException 却正是一个被检查异常。
        Exception 类的异常包括 checked exception 和 unchecked exception（unchecked exception也称运行时异常RuntimeException）
        Java语言规范中描述道：如果一个catch 子句要捕获一个类型为 E 的被检查异常，
        而其相对应的try 子句如不能抛出E 的某种子类型的异常，那么这就是一个编译期错误。
        * */


       /* try {
            System.out.println("Hello world");
        } catch (IOException e) {
            System.out.println("I've never seenprintln fail!");
        }*/
    }

    public int get() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }
}

class Arcane2 {
    public static void main(String[] args) {
        try {
        } catch (Exception e) {
            System.out.println("This can't happen");
        }
    }
}