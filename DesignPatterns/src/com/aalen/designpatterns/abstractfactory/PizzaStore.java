package com.aalen.designpatterns.abstractfactory;

/**
 * Created by Aalen on 16/9/18.
 */
public class PizzaStore {

    public Pizza orderPizza() {
        Pizza pizza = this.createPizza();

        if(null != pizza) {
            pizza.prepare();
            pizza.bake();
            pizza.box();
        }
        return pizza;
    }

    protected Pizza createPizza() {
        return null;
    }

}
