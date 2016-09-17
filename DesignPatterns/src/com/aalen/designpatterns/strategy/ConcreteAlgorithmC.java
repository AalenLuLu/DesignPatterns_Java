package com.aalen.designpatterns.strategy;

/**
 * Created by Aalen on 16/9/14.
 */
public class ConcreteAlgorithmC extends AbstractAlgorithm {

    private double seed = 0.0;

    public ConcreteAlgorithmC(double seed) {
        this.seed = seed;
    }

    @Override
    public double calculate(double input) {
        if(seed > input) {
            seed = input;
        }
        return input - seed;
    }
}
