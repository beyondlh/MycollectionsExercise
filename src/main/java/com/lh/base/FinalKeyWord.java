package com.lh.base;

/**
 * Created by lh on 2016/11/3.
 * 规则1：final修饰的方法不可以被重写。
 * 规则2：final修饰的方法仅仅是不能重写，但它完全可以被重载。
 * 规则3：父类中private final方法，子类可以重新定义，这种情况不是重写。
 */
public class FinalKeyWord {
    public final void test() {

    }

    private final void mm() {
    }

    //    final修饰的方法仅仅是不能重写，但它完全可以被重载。
    public final void test(String s) {

    }
}

class mytest extends FinalKeyWord {
//    final修饰的方法不可以被重写
/*    public void test() {

    }*/

    //父类中private final方法，子类可以重新定义，这种情况不是重写。
    public final void mm() {
    }

}
