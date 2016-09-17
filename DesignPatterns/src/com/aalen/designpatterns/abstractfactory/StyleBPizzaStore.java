package com.aalen.designpatterns.abstractfactory;

/**
 * Created by Aalen on 16/9/18.
 */
public class StyleBPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza() {
        StyleBMeterialFactory meterialFactory = new StyleBMeterialFactory();
        return new StyleBPizza(meterialFactory);
    }
}
