package com.lh.myenum;

/**
 * Created by lh on 2016/11/4.
 */
public enum Gender implements Displayable {
    MALE("male"),
    FEMALE("female"),
    OTHER("other");

    private String displayName;

    //    枚举类型构造方法必须声明为private,且无法扩展或者继承其它枚举类型,但是可以实现一个接口
    private Gender(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return this.displayName;
    }
}
