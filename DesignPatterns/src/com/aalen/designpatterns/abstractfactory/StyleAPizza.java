package com.aalen.designpatterns.abstractfactory;

/**
 * Created by Aalen on 16/9/18.
 */
public class StyleAPizza extends Pizza {

    private StyleAMeterialFactory meterialFactory;
    private MeterialA meterialA;
    private MeterialB meterialB;
    private MeterialC meterialC;

    public StyleAPizza(StyleAMeterialFactory meterialFactory) {
        this.meterialFactory = meterialFactory;
    }

    @Override
    public String getName() {
        return "Style A Pizza";
    }

    @Override
    public void prepare() {
        meterialA = meterialFactory.createMeterialA();
        meterialB = meterialFactory.createMeterialB();
        meterialC = meterialFactory.createMeterialC();
        System.out.println(getName() + " prepare with " +
                meterialA.getName() + " " +
                meterialB.getName() + " " +
                meterialC.getName());
    }

    @Override
    public void bake() {
        System.out.println(getName() + " bake...");
    }

    @Override
    public void box() {
        System.out.println(getName() + " box...");
    }

    @Override
    public String toString() {
        return getName() + " with " + meterialA.getName() + " " + meterialB.getName() + " " + meterialC.getName();
    }
}
