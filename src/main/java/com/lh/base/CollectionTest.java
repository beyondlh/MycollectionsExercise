package com.lh.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by lh on 2016/10/31.
 */
public class CollectionTest {
    /**
     * 说明：
     * 1.Collection java集合框架的根级接口（root interface）
     * 2.常用子接口：List、Set、Queue，注意map是自成体系的
     * 3.方法：新增、包含、遍历、交集、判空、大小、清空等
     */
    public static void main(String[] args) {
        Collection<Object> children = new ArrayList<Object>(); //注意由于这里没有加泛型，所以很多黄线警告
        //新增
        children.add("小明");
        children.add("小红");
        children.add("小白");
        System.out.println("======================");

        //是否包含
        System.out.println("幼儿园一班是否有叫小明的小朋友？ 答：" + children.contains("小明"));
        System.out.println("幼儿园一班是否有叫小黑的小朋友？ 答：" + children.contains("小黑"));
        System.out.println("======================");


        //遍历（2种方式）
        System.out.print("Iterator法遍历：");
        Iterator it = children.iterator(); //Iterator（迭代器） 请参看博客中有关Iterator专门的文章
        while (it.hasNext()) {
            System.out.print((String) it.next() + "  ");//由于没有使用泛型，所以这里需要强转一下
        }
        System.out.println("");  //保持格式，无实际用处

        /*上面这种方式太注重遍历过程的本身，对初学者来说有些复杂，那么试试foreach吧
         *foreach是java 5 提供的一种便捷遍历方法
         */
        System.out.print("foreach法遍历：");
        for (Object one : children) {
            System.out.print((String) one + "  ");
        }
        System.out.println("");  //保持格式，无实际用处
        System.out.println("======================");


        //转换成数组
        Object[] array = children.toArray();
        System.out.println("数组大小：" + array.length);
        System.out.println("======================");

        //删除
        System.out.println("删除前：" + children); //这种打印方法实际用的是Collection实现类的toString方法
        children.remove("小明");
        System.out.println("删除后：" + children);
        System.out.println("======================");

        //交集
        Collection goodBoySet = new HashSet();  //一个set集合
        goodBoySet.add("小明");
        goodBoySet.add("小白");
        children.retainAll(goodBoySet);  //children集合中存在于goodBoySet集合的数据，简单的讲就是交集。
        System.out.println("交集结果：" + children);
        System.out.println("======================");

        //判空、大小、清空
        System.out.println("集合是否是空？答：" + children.isEmpty());
        System.out.println("集合大小：" + children.size());
        children.clear();
        System.out.println("清空后，集合是否是空？答：" + children.isEmpty());
        System.out.println("清空后，集合大小：" + children.size());
        System.out.println("======================");

        String m = "hello world";
        String[] aS = m.split("\\s");
    }
}