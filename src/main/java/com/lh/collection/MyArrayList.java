package com.lh.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lh on 2016/11/2.
 */
public class MyArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println(list);
        list.add(2,"在索引2处插入元素");
        System.out.println(list);
        list.set(2,"在索引2处替换的元素");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        //遍历list(类似数组)
        for(int i =0;i<list.size();i++){
            System.out.print(list.get(i)+"   ");
        }
    }
}
