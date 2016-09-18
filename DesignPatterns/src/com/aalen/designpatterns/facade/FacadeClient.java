package com.aalen.designpatterns.facade;

/**
 * Created by Aalen on 16/9/19.
 */
public class FacadeClient {
    public static void execute() {
        SubSystemA systemA = new SubSystemA();
        SubSystemB systemB = new SubSystemB();
        SubSystemC systemC = new SubSystemC();
        Facade facade = new Facade(systemA, systemB, systemC);
        facade.operationTwo();
        facade.operationOne();
    }
}
