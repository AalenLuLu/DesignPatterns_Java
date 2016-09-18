package com.aalen.designpatterns.decorator;

/**
 * Created by Aalen on 16/9/19.
 */
public class Soy extends CondimentDecorator {
    private Baverage baverage;

    public Soy(Baverage baverage) {
        this.baverage = baverage;
    }

    @Override
    public String getName() {
        return baverage.getName() + ", Soy";
    }

    @Override
    public double cost() {
        return baverage.cost() + 0.99;
    }
}
