package mycom.collection.mytest;

import java.util.*;

class MyCollections {
    public static <T> List<T> reverse(List<T> src) {
        List<T> results = new ArrayList<T>(src);
        Collections.reverse(results);
        return results;
    }
}

public class ReverseIterator {
    public static void main(String[] args) {
        Person ted = new Person("Ted", "Neward", 39,
                new Person("Michael", "Neward", 16),
                new Person("Matthew", "Neward", 10));

        // Make a copy of the List
        List<Person> kids = new ArrayList<Person>(ted.getChildren());
        // Reverse it
        Collections.reverse(kids);
        // Display it
        System.out.println(kids);
    }
}