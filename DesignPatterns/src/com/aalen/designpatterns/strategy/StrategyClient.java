package com.aalen.designpatterns.strategy;

/**
 * Created by Aalen on 16/9/14.
 */
public class StrategyClient {

    public static void execute() {
        AlgorithmContext contextA = new AlgorithmContext(AlgorithmType.TypeA);
        AlgorithmContext contextB = new AlgorithmContext(AlgorithmType.TypeB);
        AlgorithmContext contextC = new AlgorithmContext(AlgorithmType.TypeC);

        contextA.executeCalculate(300);
        contextB.executeCalculate(300);
        contextC.executeCalculate(300);
    }

}
