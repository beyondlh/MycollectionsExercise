package com.lh.exception;

/**
 * Created by lh on 2016/10/23.
 */
/*从代码来看，貌似finally块中的println语句应该会被执行5次。但当程序运行后，你会发现finally块只执行了4次。
第5次迭代的时候会触发exit函数的调用，于是这第5次的finally便永远也触发不到了。
原因便是——System.exit会挂起所有线程的执行，包括当前线程。即便是try语句后的finally块，只要是执行了exit，便也无力回天了。
在调用System.exit时，JVM会在关闭前执行两个结束任务：
首先，它会执行完所有通过Runtime.addShutdownHook注册进来的终止的钩子程序。这一点很关键，因为它会释放JVM外部的资源。
接下来的便是Finalizer了。可能是System.runFinalizersOnExit也可能是Runtime.runFinalizersOnExit。finalizer的使用已经被废弃有很长一段时间了。
finalizer可以在存活对象上进行调用，即便是这些对象仍在被其它线程所使用。而这会导致不可预期的结果甚至是死锁。*/
public class ShutDownHooksDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            try {
                if (i == 4) {
                    System.out.println("Inside Try Block.Exiting without executing Finally block.");
                    System.exit(0);
                }
            } finally {
                System.out.println("Inside Finally Block.");
            }
        }
    }
}
