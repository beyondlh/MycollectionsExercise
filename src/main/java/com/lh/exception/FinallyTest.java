package com.lh.exception;

import com.lh.Student;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lh on 2016/11/4.
 */

public class FinallyTest {
    public static void main(String[] args) {

//        System.out.println(getMap().get("KEY").toString());
        System.out.println(getStudent().getName());
    }

    public static Map<String, String> getMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("KEY", "INIT");
        try {
            map.put("KEY", "TRY");
            /*从这里返回*/
            return map;
        } catch (Exception e) {
            map.put("KEY", "CATCH");
        } finally {
            map.put("KEY", "FINALLY");
            map = null;
        }
        /*最后一句从来没有执行*/
        return map;
    }

    public static Student getStudent(){
        Student student = new Student("张三",20);
        try{
            int m=1;
            int b = 1/0;

        }catch (ArithmeticException ex){

        }finally {
            student.setName("李四");
            return student;
        }
    }
}