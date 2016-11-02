package com.lh.collection;

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
    }
}
