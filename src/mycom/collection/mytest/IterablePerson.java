package mycom.collection.mytest;

public class IterablePerson
{
    public static void main(String[] args)
    {
        Person ted = new Person("Ted", "Neward", 39,
            new Person("Michael", "Neward", 16),
            new Person("Matthew", "Neward", 10));

        // Iterate over the kids
        for (Person kid : ted)
        {
            System.out.println(kid.getFirstName());
        }
    }
}