package com.lh.collection;

import com.lh.Bird;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Created by lh on 2016/11/2.
 */
public class MyTreeSet {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("t");
        ts.add("r");
        ts.add("e");
        ts.add("e");
        ts.add("e");
        System.out.println(ts);
        System.out.println(ts.size());


//
//        TreeSet<Apple> set = new TreeSet<Apple>();
//        set.add(new Apple(2.3));
//        set.add(new Apple(1.2));
//        set.add(new Apple(3.5));
//        for (Apple ele : set) {
//            System.out.println(ele.getWeight());
//        }


        TreeSet<Bird> set = new TreeSet<Bird>(new Comparator<Bird>() {
            @Override
            public int compare(Bird o1, Bird o2) {
                if (o1.getName().compareTo(o2.getName()) > 0) {
                    return -1;
                } else if (o1.getName().compareTo(o2.getName()) < 0) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });

        set.add(new Bird("aabc"));
        set.add(new Bird("abc"));
        set.add(new Bird("Z"));
        set.add(new Bird("dx"));
        for (Bird ele : set) {
            System.out.println(ele.getName());
        }
    }
}
