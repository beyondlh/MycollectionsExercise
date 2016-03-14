package mycom.collection.mytest;

import java.util.*;

public class Person implements Iterable<Person> {
    public Person(String fn, String ln, int a, Person... kids) {
        this.firstName = fn;
        this.lastName = ln;
        this.age = a;
        for (Person kid : kids)
            children.add(kid);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public List<Person> getChildren() {
        return children;
    }

    public Iterator<Person> iterator() {
        return children.iterator();
    }

    public void setFirstName(String value) {
        this.firstName = value;
    }

    public void setLastName(String value) {
        this.lastName = value;
    }

    public void setAge(int value) {
        this.age = value;
    }

    public int hashCode() {
        return firstName.hashCode() & lastName.hashCode() & age;
    }

    public boolean equals(Object other) {
        if (other == this)
            return true;

        if (other instanceof Person) {
            Person rhs = (Person) other;
            return rhs.lastName.equals(this.lastName) &&
                    rhs.firstName.equals(this.firstName) &&
                    rhs.age == this.age;
        } else
            return false;
    }

    public String toString() {
        return "[Person: " +
                "firstName=" + firstName + " " +
                "lastName=" + lastName + " " +
                "age=" + age + "]";
    }

    private String firstName;
    private String lastName;
    private int age;
    private List<Person> children = new ArrayList<Person>();
}
