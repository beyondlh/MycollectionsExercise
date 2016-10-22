package com.lh.referenceorvalue;

/**
 * Created by lh on 2016/10/22.
 */
public class Foo {
    String attribute;

    Foo(String s) {
        this.attribute = s;
    }

    void setAttribute(String s) {
        this.attribute = s;
    }

    String getAttribute() {
        return this.attribute;
    }
}