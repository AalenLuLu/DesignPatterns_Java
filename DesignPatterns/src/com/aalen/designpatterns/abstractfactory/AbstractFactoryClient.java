package com.aalen.designpatterns.abstractfactory;

/**
 * Created by Aalen on 16/9/18.
 */
public class AbstractFactoryClient {

    public static void execute() {
        PizzaStore storeA = new StyleAPizzaStore();
        PizzaStore storeB = new StyleBPizzaStore();

        Pizza pizzaA = storeA.orderPizza();
        System.out.println("I order " + pizzaA);
        Pizza pizzaB = storeB.orderPizza();
        System.out.println("I order " + pizzaB);
    }

}
