package com.lh.exception;

/**
 * Created by lh on 2016/10/23.
 */
public class ShutDownHooksDemo2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            final int final_i = i;
            try {
                System.gc();
                Runtime.getRuntime().addShutdownHook(
                        new Thread() {
                            public void run() {
                                if (final_i == 4) {
                                    System.out.println("Inside Try Block.Exiting without executing Finally block.");
                                    System.exit(0);

                                }
                            }
                        });
            } finally {
                System.out.println("Inside Finally Block.");
            }
        }
    }
}

/*验证一个类中只能有一个public类，比并且编译后还是两个.class文件。一个ShutDownHooksDemo2.class一个ShutDownHooksDemo3.class*/
class ShutDownHooksDemo3 {
    public static void main(String[] args) {
        Test t = new Test();
        System.out.print("t.aChar:" + t.aChar);
//        System.out.print(t.m);
        /*for (int i = 0; i < 5; i++) {
            final int final_i = i;
            try {
                System.gc();
                Runtime.getRuntime().addShutdownHook(
                        new Thread() {
                            public void run() {
                                if (final_i == 4) {
                                    System.out.println("Inside Try Block.Exiting without executing Finally block.");
                                    System.exit(0);

                                }
                            }
                        });
            } finally {
                System.out.println("Inside Finally Block.");
            }
        }*/
    }
}

class  Test{
    int m;
    char aChar;
}