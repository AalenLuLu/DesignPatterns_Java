package com.aalen.designpatterns.strategy;

/**
 * Created by Aalen on 16/9/14.
 */

enum AlgorithmType {
    TypeA,
    TypeB,
    TypeC
};

public class AlgorithmContext {

    private AbstractAlgorithm algorithm;

    public AlgorithmContext(AlgorithmType type) {
        switch (type) {
            case TypeA:
                algorithm = new ConcreteAlgorithmA();
                break;
            case TypeB:
                algorithm = new ConcreteAlgorithmB(0.5);
                break;
            case TypeC:
                algorithm = new ConcreteAlgorithmC(100);
                break;
            default:
                break;
        }
    }

    public void executeCalculate(double input) {
        if(null != algorithm) {
            System.out.println("result: " + algorithm.calculate(input));
        } else {
            System.out.println("error: algorithm is null...");
        }
    }

}
