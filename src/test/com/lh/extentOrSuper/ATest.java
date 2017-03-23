package com.lh.extentOrSuper;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lh on 2017/3/23.
 */
public class ATest {

    @Test
    public void t() {
        List<? extends A> list1 = new ArrayList<A>();
        List<? extends B> list2 = new ArrayList<C>();
        List<? extends C> list3 = new ArrayList<C>();

        List<? super A> list4 = new ArrayList<A>();
        List<? super B> list5 = new ArrayList<B>();
        List<? super C> list6 = new ArrayList<C>();


        List<? super B> list7 = new ArrayList<A>();
        List<? super C> list8 = new ArrayList<B>();
        List<? super C> list9 = new ArrayList<A>();
    }
}