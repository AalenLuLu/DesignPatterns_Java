package com.aalen.designpatterns.abstractfactory;

/**
 * Created by Aalen on 16/9/18.
 */
public class StyleAMeterialFactory implements MeterialFactory {
    @Override
    public MeterialA createMeterialA() {
        return new StyleAMeterialA();
    }

    @Override
    public MeterialB createMeterialB() {
        return new StyleAMeterialB();
    }

    @Override
    public MeterialC createMeterialC() {
        return new StyleAMeterialC();
    }
}
