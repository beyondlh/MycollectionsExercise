package com.lh.base;

import java.io.IOException;

/**
 * Created by lh on 2016/10/31.
 */
public class RuntimeTest {
    /**
     * 1.java程序的运行时环境
     * 2.通过Runtime.getRuntime() 获得当前的运行环境实例
     * 3.程序不能创建自己的Runtime实例
     * 4.能访问jvm相关信息，最重要的是它可以执行命令行
     */
    public static void main(String[] args) throws IOException
    {
        //获得当前Runtime实例
        Runtime rt=Runtime.getRuntime();

        System.out.println("可用处理器个数："+rt.availableProcessors());
        System.out.println("可用最大内存："+rt.maxMemory());
        System.out.println("当前总内存："+rt.totalMemory());
        System.out.println("空闲内存："+rt.freeMemory());
        System.out.println("-----------------------------");

        //重点方法 运行命令行 （notepad.exe、calc.exe、某个可执行文件的路径）
        String command="calc.exe";  //打开计算器
        rt.exec(command);

        //和System类似的方法，实际上System中调用的就是Runtime对应的方法
        rt.runFinalization();  //运行finalize方法。
        rt.gc();  //运行垃圾回收器（官方解释） 实际上这种运行可能只是建议性运行
        rt.exit(0);  //参数 如果是非0代表异常终止，多放在捕获异常的catch块中
    }
}
