package mycom.collection.mytest;

import java.util.*;

public class ArraySortedCollection<E> implements SortedCollection<E>, Iterable<E> {
    private Comparator<E> comparator;
    private ArrayList<E> list;

    public ArraySortedCollection(Comparator<E> c) {
        this.list = new ArrayList<E>();
        this.comparator = c;
    }

    public ArraySortedCollection(Collection<? extends E> src, Comparator<E> c) {
        this.list = new ArrayList<E>(src);
        this.comparator = c;
        sortThis();
    }

    public Comparator<E> getComparator() {
        return comparator;
    }

    public void setComparator(Comparator<E> cmp) {
        comparator = cmp;
        sortThis();
    }

    public boolean add(E e) {
        boolean r = list.add(e);
        sortThis();
        return r;
    }

    public boolean addAll(Collection<? extends E> ec) {
        boolean r = list.addAll(ec);
        sortThis();
        return r;
    }

    public boolean remove(Object o) {
        boolean r = list.remove(o);
        sortThis();
        return r;
    }

    public boolean removeAll(Collection<?> c) {
        boolean r = list.removeAll(c);
        sortThis();
        return r;
    }

    public boolean retainAll(Collection<?> ec) {
        boolean r = list.retainAll(ec);
        sortThis();
        return r;
    }

    public void clear() {
        list.clear();
    }

    public boolean contains(Object o) {
        return list.contains(o);
    }

    public boolean containsAll(Collection<?> c) {
        return list.containsAll(c);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public Iterator<E> iterator() {
        return list.iterator();
    }

    public int size() {
        return list.size();
    }

    public Object[] toArray() {
        return list.toArray();
    }

    public <T> T[] toArray(T[] a) {
        return list.toArray(a);
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;

        if (o instanceof ArraySortedCollection) {
            ArraySortedCollection<E> rhs = (ArraySortedCollection<E>) o;
            return this.list.equals(rhs.list);
        }

        return false;
    }

    public int hashCode() {
        return list.hashCode();
    }

    public String toString() {
        return list.toString();
    }

    private void sortThis() {
        Collections.sort(list, comparator);
    }
}