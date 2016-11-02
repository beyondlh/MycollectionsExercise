package com.lh;

import java.io.Serializable;

/**
 * Created by lh on 2016/11/2.
 */
public class Apple implements Comparable<Apple>, Serializable {

    private static final long serialVersionUID = 4759696852430836329L;

    Bird bird;

    public Apple(double weight) {
        this.weight = weight;
        this.bird = new Bird("黄鹂");
    }

    public Bird getBird() {
        return bird;
    }

    public void setBird(Bird bird) {
        this.bird = bird;
    }

    double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Apple apple) {
        if (this.weight > apple.getWeight()) {
            return 1;
        } else if (this.weight < apple.getWeight()) {
            return -1;
        } else {
            return 0;
        }
    }

}
