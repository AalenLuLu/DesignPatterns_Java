package com.aalen.designpatterns.decorator;

/**
 * Created by Aalen on 16/9/19.
 */
public class Espresso extends Baverage {
    @Override
    public String getName() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
