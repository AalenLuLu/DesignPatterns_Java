package com.aalen.designpatterns.decorator;

/**
 * Created by Aalen on 16/9/19.
 */
public class DecoratorClient {
    public static void execute() {
        Baverage baverage1 = new Espresso();
        baverage1 = new Mocha(baverage1);
        baverage1 = new Soy(baverage1);

        System.out.println("name: " + baverage1.getName() + ", cost: " + String.format("%.2f", baverage1.cost()));

        Baverage baverage2 = new Espresso();
        baverage2 = new Mocha(baverage2);
        baverage2 = new Milk(baverage2);
        baverage2 = new Soy(baverage2);

        System.out.println("name: " + baverage2.getName() + ", cost: " + String.format("%.2f", baverage2.cost()));
    }
}
