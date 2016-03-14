package mycom.collection.mytest;

import java.util.*;

public class OrderAndPosition {
    public static <T> void dumpArray(T[] array) {
        System.out.println("=============");
        for (int i = 0; i < array.length; i++)
            System.out.println("Position " + i + ": " + array[i]);
    }

    public static <T> void dumpList(List<T> list) {
        System.out.println("=============");
        for (int i = 0; i < list.size(); i++)
            System.out.println("Ordinal " + i + ": " + list.get(i));
    }

    public static void main(String[] args) {
        List<String> argList = new ArrayList<String>(Arrays.asList(args));

        dumpArray(args);
        args[1] = null;
        dumpArray(args);

        dumpList(argList);
        argList.remove(1);
        dumpList(argList);

        /*当第三个元素从上面的 List 中被移除时，
        其 “后面” 的各项会上升填补空位。很显然，
        此集合行为与数组的行为不同（事实上，
        从数组中移除项与从 List 中移除它也不完全是一回事儿 —
        从数组中 “移除” 项意味着要用新引用或 null 覆盖其索引槽）*/
    }
}