package com.lh.base;

import java.math.BigDecimal;

/**
 * Created by lh on 2016/11/5.
 */
public class BaseType {
    public static void main(String[] args) {
        System.out.println(0.3 - 0.1);
        System.out.println(0.4 - 0.2);


        System.out.println(0.3f - 0.1f);
        System.out.println(0.4f - 0.2f);


        // 在java中float占4个字节32位，double占8个字节64位。java默认的小数声明是double，
        //double d=4.0,
        //而float则必须如下声明，
        //float f=4.of
        float a = 0.4f;
        int b = Float.floatToIntBits(a);
        System.out.println(Integer.toBinaryString(b));

        BigDecimal bigDecimal1 = new BigDecimal("1.0");
        BigDecimal bigDecimal2 = new BigDecimal("0.9");
        System.out.println(bigDecimal1.subtract(bigDecimal2));
/*        short s1 = 1;
        *//*隐含着类型转换，类似  s1 = (short) (s1 + 1);*//*
        s1 += 1;*/



        String s1 = "Programming";
        String s2 = new String("Programming");
        String s3 = "Program" + "ming";
        String s5 = "mytest";
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s1.intern());
        System.out.println(s5 == s5.intern());
    }
}
