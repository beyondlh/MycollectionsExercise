package com.lh.base;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by lh on 2016/10/31.
 */
public class IteratorTest {
    /**
     * 说明：
     * 1.Iterator是一个迭代器
     * 2.Iterator删除问题（工作中遇到的问题）
     */
    public static void main(String[] args)
    {
        Set<String> s = new HashSet<String>();
        s.add("苹果");
        s.add("香蕉");
        s.add("橘子");

        //正常使用，带泛型的迭代器
        Iterator<String> it = s.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+"  ");
        }

        while(it.hasNext())
        {
            System.out.print(it.next()+"  ");
        }
        //发现第二次访问没有打印任何东西，因为it已经迭代到最后 it.hasNext() 是false
        System.out.println("");
        System.out.println("===================");

        //删除问题：工作中经常想用java去处理数据集合，例如：去掉某些不合要求的数据
        it = s.iterator();
        while(it.hasNext())
        {
            String one = it.next(); //传值非传引用
            if("橘子".equals(one))
            {
                it.remove(); //这个删除 是从集合中删除上一次next方法返回的元素
            }
            System.out.print(one+"  ");
        }
        System.out.println(s);

        //上面是正规安全的删除，但是很多朋友会很自然的这样去写
        it = s.iterator();
        s.add("橘子");  //将删除的橘子加回来
        while(it.hasNext())
        {
            String one = it.next();
            if("橘子".equals(one))
            {
                //这个数据我不要了，我从集合中将其删除 OK 如果你这么做了 你会看到一个ConcurrentModificationException 异常
                s.remove(one);
            }
            System.out.print(one+"  ");
        }
    }
}
