package com.lh.map;

/**
 * Created by lh on 2017/3/21.
 * 危险！在HashMap中将可变对象用作Key
 * 1、什么是可变对象
 可变对象是指创建后自身状态能改变的对象。换句话说，可变对象是该对象在创建后它的哈希值可能被改变。
 在下面的代码中，对象MutableKey的键在创建时变量 i=10 j=20，哈希值是1291。
 然后我们改变实例的变量值，该对象的键 i 和 j 从10和20分别改变成30和40。现在Key的哈希值已经变成1931。
 显然，这个对象的键在创建后发生了改变。所以类MutableKey是可变的。

 在HashMap中使用不可变对象。在HashMap中，使用String、Integer等不可变类型用作Key是非常明智的。

 我们也能定义属于自己的不可变类。

 如果可变对象在HashMap中被用作键，那就要小心在改变对象状态的时候，不要改变它的哈希值了。



 具体例子查看测试类MutableKeyTest
 参考 http://www.importnew.com/13384.html#comment-543265
 */
public class MutableKey {
    private int i;
    private int j;

    public MutableKey(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public final int getI() {
        return i;
    }

    public final void setI(int i) {
        this.i = i;
    }

    public final int getJ() {
        return j;
    }

    public final void setJ(int j) {
        this.j = j;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + i;
        result = prime * result + j;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof MutableKey)) {
            return false;
        }

        MutableKey other = (MutableKey) obj;
        if (this.i != other.i || this.j != other.j) {
            return false;
        }

        return true;
    }


}
