package com.lh.referenceorvalue;

/**
 * Created by lh on 2016/10/22.
 */
public class Main {
    public static void modifyReference(Foo c) {
        c.setAttribute("修改值C");
    }

    public static void changeReference(Foo aRef) {
        Foo bRef = new Foo("b");
        /*将bRef的引用赋给aRef,传递过来的对象的属性值没有改变*/
        aRef = bRef;
    }

    public static void main(String[] args) {
        Foo fooRef = new Foo("初始值A");
        changeReference(fooRef);
        System.out.println(fooRef.getAttribute());

        modifyReference(fooRef);
        System.out.println(fooRef.getAttribute());

    }
}