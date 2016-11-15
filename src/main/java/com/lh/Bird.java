package com.lh;

import java.io.Serializable;

/**
 * Created by lh on 2016/11/2.
 */
public class Bird implements Serializable {

    private static final long serialVersionUID = 7479005249039605620L;

    //    如果final属性是直接量，那么反序列化的时候回重新计算该变量的值。比如序列化的时候num的值是123.
//    完成序列化后将Bird中的该属性修改成456，反序列化后得到的结果中的num的值为456
    public final int num = 123;
    private String name;
    //    private  int weight;
//    添加上transient关键字后序列化得不到这个值
    private transient int weight;

    public Bird(String name) {
        this.name = name;
        this.weight = 50;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Bird[name=" + name + "]";
    }
}
