package com.lh.collection;

import com.lh.Apple;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lh on 2016/11/2.
 */
public class MyHashSet {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<String>(3);

       /* HashSet的构造器：HashSet(int initialCapacity, float loadFactor)
        --initialCapacity：控制底层数组的长度。
        如果传入数组长度不是2的N次方，HashSet会自动扩展到2的N次方。
        --loadFactory：当HashSet感觉到底层数组快满时，它会再次创建一个长度是原来数组长度2倍的数组。
        原有的数组就变成垃圾，并且要把原有数组中的元素复制到新数组中，这个过程也叫“重hash”。
        loadFactory越小,越耗内存；loadFactory越大，性能越低。*/
//       //底层数组容量会自动会展到4(注意：2的N次方)
//        HashSet<String> hs = new HashSet<String>(3);
//        HashSet<String> hs = new HashSet<String>(3);
        hs.add("1");
        hs.add("2");
        hs.add("3");
        hs.add("4");
        hs.add("5");
        hs.add("5");

        System.out.println(hs.contains("5"));
        //当HashSet感觉到底层数组快满时，它会再次创建一个长度是原来数组长度2倍的数组,此时新的数组长度为8
        System.out.println(hs.size());


//hashset的底层是hashmap，储存的值为map的key值，String还重写了hashcode和equals方法，例子中的几个因为内容相同，hashcode也是一样的。
        String str1 = "123";
        String str2 = "123";
        String str3 = new String("123");
        String str4 = new String("123");


        HashSet<String> set = new HashSet<String>();
        set.add(str1);
        set.add(str2);
        set.add(str3);
        set.add(str4);
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals(str4));
        System.out.println(str4.hashCode());

        HashSet<Apple> setApple = new HashSet<Apple>();
        setApple.add(new Apple(10));
        setApple.add(new Apple(10));
        setApple.add(new Apple(10));
        setApple.add(new Apple(10));

        System.out.println(setApple.size());
    }
}
