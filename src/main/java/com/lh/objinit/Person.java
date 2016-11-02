package com.lh.objinit;

/**
 * Created by lh on 2016/10/30.
 */
class Person {
    protected String name;
    protected int age;
    protected String sex;
    public Person() {
        System.out.println("构造器Person()被调用");
        sex = "Male";
        System.out.println("name=" + name + " ,age=" + age + " ,sex=" + sex);
    }
    public Person(String theName,String... more) {
        System.out.println("构造器Person(String theName)被调用");
        name = theName;
        System.out.println("name=" + name + " ,age=" + age + " ,sex=" + sex);
    }
    public Person(String theName, int theAge) {
        System.out.println("构造器Person(String theName,int theAge)被调用");
        name = theName;
        age = theAge;
        System.out.println("name=" + name + " ,age=" + age + " ,sex=" + sex);
    }
    // 初始化块
    {
        name = "Tony Blair";
        age = 50;
        sex = "Female";
        System.out.println("Person初始化块执行后：name=" + name + " ,age="
                + age + " ,sex=" + sex);
    }
}

