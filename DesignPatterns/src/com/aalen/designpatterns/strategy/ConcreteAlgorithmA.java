package com.aalen.designpatterns.strategy;

/**
 * Created by Aalen on 16/9/14.
 */
public class ConcreteAlgorithmA extends AbstractAlgorithm {

    @Override
    public double calculate(double input) {
        return input + input;
    }

}
