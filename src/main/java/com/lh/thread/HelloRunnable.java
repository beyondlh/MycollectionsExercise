package com.lh.thread;

/**
 * Created by lh on 2016/11/3.
 */
public class HelloRunnable implements Runnable {
    @Override
    public void run() {
        System.out.print("Hello");
    }

    public static void main(String[] args) {
        new Thread(new HelloRunnable()).start();
    }
}
