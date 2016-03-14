package mycom.collection.mytest;

import java.util.*;

public interface SortedCollection<E> extends Collection<E>
{
    public Comparator<E> getComparator();
    public void setComparator(Comparator<E> comp);
}