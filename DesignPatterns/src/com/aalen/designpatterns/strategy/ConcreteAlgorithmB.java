package com.aalen.designpatterns.strategy;

/**
 * Created by Aalen on 16/9/14.
 */
public class ConcreteAlgorithmB extends AbstractAlgorithm {

    private double seed = 0.0;

    public ConcreteAlgorithmB(double seed) {
        this.seed = seed;
    }

    @Override
    public double calculate(double input) {
        return input * seed;
    }

}
