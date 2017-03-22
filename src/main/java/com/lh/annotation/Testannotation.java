package com.lh.annotation;

import java.lang.annotation.Annotation;

/**
 * Created by lh on 2016/11/1.
 */
public class Testannotation {
    @MyAnnotation(name = "jack")
    public String name;

    String age;
}

class Test {
    public static void main(String[] args) throws Exception{
        Testannotation t = new Testannotation();
        Annotation[] annotations = t.getClass().getField("name").getDeclaredAnnotations();
        for (Annotation a : annotations) {
            System.out.print(((MyAnnotation)a).name());
        }
    }
}