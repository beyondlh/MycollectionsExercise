package com.lh;

/**
 * Created by lh on 2016/11/3.
 */
public class Student {
    private String name;
    private Integer age;

    /**
     * 无参构造并赋默认值
     */
    public Student() {
        this.name = "张三";
        this.age = 22;
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void info() {
        System.out.println("做一个快乐的程序员~" + this);
    }

    private void joke() {
        System.out.println("开个玩笑啦。。。");
    }

    // 无参
    public void play() {
        System.out.println(this.name + " is playing...");
    }

    // 重载play
    public void play(String name) {
        System.out.println(this.name + " is playing xx with " + name);
    }

    /**
     * getClass().getName() + "@" + Integer.toHexString(hashCode());
     * 推荐实体类都覆写toString方法，方便查看日志信息
     *
     * @return
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}