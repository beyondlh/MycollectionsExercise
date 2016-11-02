package com.lh.collection;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by lh on 2016/11/2.
 */
public class MyDeque {
    public static void main(String[] args) {
        //把Deque当成栈堆列用：先进后出
        Deque<String> dq = new ArrayDeque<String>();
        dq.push("a");
        dq.push("b");
        dq.push("c");
        dq.push("d");
        while (dq.iterator().hasNext()){
            dq.iterator().next();
            System.out.println(dq.pop());
        }


        //把Deque当成栈堆列用：先进先出
        Deque<String> dq2 = new ArrayDeque<String>();
        dq2.offer("1");
        dq2.offer("2");
        dq2.offer("3");
        dq2.offer("4");
        while (dq2.iterator().hasNext()){
            dq2.iterator().next();
            System.out.println(dq2.poll());
        }
    }
}
