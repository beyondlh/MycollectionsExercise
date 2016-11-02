package com.lh;

import java.io.Serializable;

/**
 * Created by lh on 2016/11/2.
 */
public class Bird implements Serializable{

    private static final long serialVersionUID = 7479005249039605620L;
    private String name;

    public String getName() {
        return name;
    }

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bird[name=" + name + "]";
    }
}
