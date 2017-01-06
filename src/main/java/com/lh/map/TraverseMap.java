package com.lh.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by lh on 2017/1/6.
 * 测试遍历Map的几种方法
 */
public class TraverseMap {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    public static void main(String[] args) {

    }

    /*方法一 在for-each循环中使用entries来遍历,这是最常见的并且在大多数情况下也是最可取的遍历方式。在键值都需要时使用。
    * 注意：for-each循环在Java 5中被引入所以该方法只能应用于java 5或更高的版本中。
    * 如果你遍历的是一个空的map对象，for-each循环将抛出NullPointerException，因此在遍历前你总是应该检查空引用
    * */
    void test1() {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

    /*只需要取Key或者Value的情况*/
    void test2() {
        for (Integer key : map.keySet()) {
            System.out.println("Key = " + key);
        }
    }

    {
        //方法三和方法四的有点是在遍历的时候可以删除Map中的对象
    }

    /*使用泛型*/
    void testIterator3() {
        Iterator<Map.Entry<Integer, Integer>> mapIterator = map.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = mapIterator.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

    /*不使用泛型*/
    void testIterator4() {
        Iterator mapIterator = map.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) mapIterator.next();
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

    /*作为方法一的替代，这个代码看上去更加干净；但实际上它相当慢且无效率。因为从键取值是耗时的操作（与方法一相比，在不同的Map实现中该方法慢了20%~200%）。如果你安装了FindBugs，它会做出检查并警告你关于哪些是低效率的遍历。所以尽量避免使用。*/
    void test5() {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (Integer key : map.keySet()) {
            Integer value = map.get(key);
            System.out.println("Key = " + key + ", Value = " + value);
        }
    }
}
