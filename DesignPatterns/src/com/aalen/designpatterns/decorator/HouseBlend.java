package com.aalen.designpatterns.decorator;

/**
 * Created by Aalen on 16/9/19.
 */
public class HouseBlend extends Baverage {
    @Override
    public String getName() {
        return "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
