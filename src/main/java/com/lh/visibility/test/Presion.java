package com.lh.visibility.test;

/**
 * Created by lh on 2016/10/28.
 */
public class Presion {

    public Presion() {
        this.age = 50;
    }

    short age;
    String name;

    protected short getAge() {
        return age;
    }

    void setAge(short age) {
        this.age = age;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}
