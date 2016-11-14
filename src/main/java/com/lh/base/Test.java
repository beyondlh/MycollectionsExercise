package com.lh.base;

/**
 * Created by lh on 2016/11/14.
 * ++num运算符是先运算后返回。
 * 本例中的运行细节
 * 1 num++是先将m的值拷贝到临时变量区
 * 2 num值加1，此时num的值是1
 * 3 返回临时变量区的值，没有有改过的0
 * 4 返回的值赋值给num,此时num的值被重置为0
 */
public class Test {
    public static void main(String[] args) {

        int num = 0;
        for (int i = 0; i < 100; i++) {
            num = num++;
        }


        System.out.println("num=" + num);
        for (int i = 0; i < 100; i++) {
            num = ++num;
        }
        System.out.println("num=" + num);
    }
}
