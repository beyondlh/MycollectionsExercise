package com.lh.base;

import java.util.Map;

/**
 * Created by lh on 2016/10/31.
 */
public class SystemTest {
    public static void main(String[] args)
    {
        //获得系统所有环境变量，在这里我们可以找到熟悉的 JAVA_HOME
        Map<String,String> env=System.getenv();
        for(String one:env.keySet())
        {
            System.out.println(one+"::::"+env.get(one));
        }
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");
        System.out.println("-----------------------------");


        //当然我们也可以直接获取某个环境变量，只要你知道他的名字
        System.out.println(System.getenv("java_home"));
        System.out.println("-----------------------------");

        System.out.println("-----------------------------");
        //获得系统属性 更多的请参见JAVA API
        System.out.println("os.name:" + System.getProperty("os.name"));
        System.out.println(System.getProperty("java.vm.name"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.dir"));
        System.out.println("-----------------------------");

        //由对象地址计算的hashCode，标识对象的唯一性（新手请绕过）
        String s1=new String("cxy");
        String s2=new String("cxy");
        System.out.println("对象s1和s2的自身的hashCode是否一样："+(s1.hashCode()==s2.hashCode()));
        System.out.println("对象s1和s2的由地址计算的hashCode是否一样："+(System.identityHashCode(s1)==System.identityHashCode(s2)));

        String s3="cxy";
        String s4="cxy";
        System.out.println("对象s3和s4的由地址计算的hashCode是否一样："+(System.identityHashCode(s3)==System.identityHashCode(s4)));
        System.out.println("-----------------------------");

        //两个获取系统当前时间的方法（1970年1月1日午夜的时间差）
        System.out.println(System.currentTimeMillis());  //毫秒级
        System.out.println(System.nanoTime());  //纳米级
        System.out.println("-----------------------------");

        System.runFinalization();  //运行对象的finalize方法。
        System.gc();  //运行垃圾回收器（官方解释） 实际上这种运行可能只是建议性运行

        //终止当前运行的java虚拟机（官方文档翻译）
        //实际上调用的是Runtime.getRuntime().exit(status)
        System.exit(0);  //参数 如果是非0代表异常终止，多放在捕获异常的catch块中
    }
}
