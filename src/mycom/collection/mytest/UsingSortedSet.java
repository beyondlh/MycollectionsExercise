package mycom.collection.mytest;

import java.util.*;

public class UsingSortedSet {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Ted", "Neward", 39),
                new Person("Ron", "Reynolds", 39),
                new Person("Charlotte", "Neward", 38),
                new Person("Matthew", "McCullough", 18)
        );
        SortedSet ss = new TreeSet(new Comparator<Person>() {
            public int compare(Person lhs, Person rhs) {
//                此处比较两个person的lastname作为判断两个persont是否相等的依据。
                return lhs.getLastName().compareTo(rhs.getLastName());
//                return lhs.getFirstName().compareTo(rhs.getFirstName());
            }
        });
        ss.addAll(persons);
        System.out.println(ss);

// 为什么输出结果中只有三个Person?
// 与 set 的有状态本质相反，TreeSet 要求对象直接实现 Comparable
// 或者在构造时传入 Comparator，它不使用 equals() 比较对象；
// 它使用 Comparator/Comparable 的 compare 或 compareTo 方法。
// 因此存储在 Set 中的对象有两种方式确定相等性：大家常用的 equals() 方法和 Comparable/Comparator 方法，
// 采用哪种方法取决于上下文。
// 更糟的是，简单的声明两者相等还不够，因为以排序为目的的比较不同于以相等性为目的的比较：
// 可以想象一下按姓排序时两个 Person 相等，但是其内容却并不相同。
// 一定要明白 equals() 和 Comparable.compareTo() 两者之间的不同 — 实现 Set 时会返回 0。甚至在文档中也要明确两者的区别。
    }
}