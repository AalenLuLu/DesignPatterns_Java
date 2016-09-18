package com.aalen.designpatterns.facade;

/**
 * Created by Aalen on 16/9/19.
 */
public class Facade {

    private SubSystemA subSystemA;
    private SubSystemB subSystemB;
    private SubSystemC subSystemC;

    public Facade(SubSystemA subSystemA, SubSystemB subSystemB, SubSystemC subSystemC) {
        this.subSystemA = subSystemA;
        this.subSystemB = subSystemB;
        this.subSystemC = subSystemC;
    }

    public void operationOne() {
        System.out.println("Operation one start...");
        subSystemA.operationOne();
        subSystemB.operationTwo();
        subSystemA.operationTwo();
        System.out.println("Operation one end...");
    }

    public void operationTwo() {
        System.out.println("Operation two start...");
        subSystemB.operationOne();
        subSystemC.operationOne();
        subSystemC.operationTwo();
        System.out.println("Operation two end...");
    }

}
