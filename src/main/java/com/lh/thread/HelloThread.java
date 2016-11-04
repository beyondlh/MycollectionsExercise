package com.lh.thread;

/**
 * Created by lh on 2016/11/3.
 */
public class HelloThread extends Thread {
    public void run(){
        System.out.println("Hello Thread");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new HelloThread();
        thread.sleep(2000);
        thread.start();
    }
}
