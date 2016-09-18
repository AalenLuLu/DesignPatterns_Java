package com.aalen.designpatterns.decorator;

/**
 * Created by Aalen on 16/9/18.
 */
public abstract class Baverage {
    String name = "Unknown baverage";
    public String getName() {
        return name;
    }
    public abstract double cost();
}
