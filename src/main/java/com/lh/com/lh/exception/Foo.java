package com.lh.com.lh.exception;

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
        System.out.println(b);
    }

    public int get() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }
}