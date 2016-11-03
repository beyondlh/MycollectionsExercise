package com.lh.innerClass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lh on 2016/11/3.
 */
public class MyInnerClassTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void test(){
        MyInnerClass myInnerClass = new MyInnerClass(10);
        myInnerClass.new Draw().drawSahpe();
        myInnerClass.getDrawInstance();
    }
}