package com.aalen.designpatterns.abstractfactory;

/**
 * Created by Aalen on 16/9/18.
 */
public class StyleAPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza() {
        StyleAMeterialFactory meterialFactory = new StyleAMeterialFactory();
        return new StyleAPizza(meterialFactory);
    }
}
