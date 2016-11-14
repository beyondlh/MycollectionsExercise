package com.lh.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
        list.add(2, "在索引2处插入元素");
        System.out.println(list);
        list.set(2, "在索引2处替换的元素");
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        //遍历list(类似数组)
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "   ");
        }



        /*Collections.singletonList，体现在结构和List里对象的值
        * Arrays.asList得到的List结构不可变，但是List中的某个数组的值是可以变的。
        * */
        List test = Collections.singletonList(list);


        int[] a = {1, 2, 3, 4};
        List listArrya = Arrays.asList("mmmmmm");
        listArrya.set(0, "89");
        System.out.println("test.size():" + test.size());
        System.out.println("listArrya.size():" + listArrya.size());

        List<String> list2 = new ArrayList<String>();

        list2.add("s1");
        list2.add("s2");
        list2.add(null);
        list2.add("s3");
        list2.add(null);
        list2.add("s4");
        System.out.println(list2);
        list2.removeAll(Collections.singleton(null));

        System.out.println(list2);

    }
}
