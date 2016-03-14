package mycom.collection.mytest;

import java.util.*;

public class MissingHash {
    public static void main(String[] args) {
        Person p1 = new Person("Ted", "Neward", 39);
        Person p2 = new Person("Charlotte", "Neward", 38);
        System.out.println(p1.hashCode());/*3*/

        Map<Person, Person> map = new HashMap<Person, Person>();
        map.put(p1, p2);

        p1.setLastName("Finkelstein");
        System.out.println(p1.hashCode());/*34*/

        /*永远不要将可变对象类型用作 HashMap 中的键。*/
        System.out.println(map.get(p1));/*null*/
    }
}