package com.lh.visibility.test;

/**
 * Created by lh on 2016/10/28.
 */
public class Student extends Presion {

    public Student() {
//        super();
    }
}

class test {
    public static void main(String[] args) {
        Student student = new Student();

        System.out.print(student.getAge());

    }
}

