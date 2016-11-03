package com.lh.innerClass;

/**
 * Created by lh on 2016/11/3.
 * 详细解释参考http://www.cnblogs.com/dolphin0520/p/3811445.html
 * 　为什么在Java中需要内部类？总结一下主要有以下四点：

 　　1.每个内部类都能独立的继承一个接口的实现，所以无论外部类是否已经继承了某个(接口的)实现，对于内部类都没有影响。内部类使得多继承的解决方案变得完整，

 　　2.方便将存在一定逻辑关系的类组织在一起，又可以对外界隐藏。

 　　3.方便编写事件驱动程序

 　　4.方便编写线程代码
 */
public class MyInnerClass {
    double radius = 0;

    public MyInnerClass(double radius) {
        this.radius = radius;
    }

    protected Draw getDrawInstance() {
        return new Draw();
    }

    protected class Draw {     //内部类
        public void drawSahpe() {
            System.out.println("外部类成员变量:" + radius);
            /*局部内部类,局部内部类就像方法里面的变量一样，不能有可见性修饰符*/
            class Test implements Comparable<Test> {
                public void mytest() {
                    System.out.println(radius);
                }

                @Override
                public int compareTo(Test o) {
                    return 0;
                }
            }
        }

    }

    public void testHHHH(int b) {
        int a = 10;
        new Thread() {
            public void run() {
                System.out.println(a);
                System.out.println(b);
            }

            ;
        }.start();
    }
}
