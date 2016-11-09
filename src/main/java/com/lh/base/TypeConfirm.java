package com.lh.base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lh on 2016/11/8.
 */
public class TypeConfirm {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        System.out.println(list instanceof List);
        System.out.println(list instanceof ArrayList);

        System.out.println("list.getClass():" + list.getClass());
        System.out.println("List.class:" + List.class);
        System.out.println("ArrayList.class:" + ArrayList.class);

        System.out.println(list.getClass().isAssignableFrom(List.class));
        System.out.println(List.class.isAssignableFrom(list.getClass()));

//       a instance of b标识  a是b的实例。
//        a.isAssignableFrom(b)  表示a能否通过b得到。
//        list.class是java.util.List  list.getClass() 是java.util.ArrayList。
//        List能从ArrayList得到，因为ArrayList是List类型。而ArrayList无法从List中得到，因为List接口的实现由很多
    }
}
