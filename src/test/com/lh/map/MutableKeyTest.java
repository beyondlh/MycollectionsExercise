package com.lh.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by lh on 2017/3/21.
 */
public class MutableKeyTest {




    @Test
    public void test1() {
        // Object created
        MutableKey key = new MutableKey(10, 20);
        System.out.println("Hash code: " + key.hashCode());

        // Object State is changed after object creation.
        key.setI(30);
        key.setJ(40);
        System.out.println("Hash code: " + key.hashCode());
    }

    /*如果HashMap Key的哈希值在存储键值对后发生改变，Map可能再也查找不到这个Entry了。
    如果Key对象是可变的，那么Key的哈希值就可能改变。在HashMap中可变对象作为Key会造成数据丢失。*/

    @Test
    public void MutableDemo() {
        // HashMap
        Map<MutableKey, String> map = new HashMap<>();
        // Object created
        MutableKey key = new MutableKey(10, 20);
        // Insert entry.
        map.put(key, "Robin");
        // This line will print 'Robin'
        System.out.println(map.get(key));
        // Object State is changed after object creation.
        // i.e. Object hash code will be changed.
        key.setI(30);
        // This line will print null as Map would be unable to retrieve the
        // entry.
        System.out.println(map.get(key));
    }


    /* 在下面的Employee示例类中，哈希值是用实例变量id来计算的。一旦Employee的对象被创建，id的值就能再改变。只有name可以改变，但name不能用来计算哈希值。所以，一旦Employee对象被创建，它的哈希值不会改变。所以Employee在HashMap中用作Key是安全的。*/
    @Test
    public void MutableDemo2() {
        Employee emp = new Employee(2);
        emp.setName("Robin");

        // Put object in HashMap.
        Map<Employee, String> map = new HashMap<>();
        map.put(emp, "Showbasky");

        System.out.println(map.get(emp));

        // Change Employee name. Change in 'name' has no effect
        // on hash code.
        emp.setName("Lily");
        System.out.println(map.get(emp));
    }
}