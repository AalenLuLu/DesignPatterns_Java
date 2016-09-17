package com.aalen.designpatterns.abstractfactory;

/**
 * Created by Aalen on 16/9/18.
 */
abstract class Pizza {

    public abstract String getName();
    public abstract void prepare();
    public abstract void bake();
    public abstract void box();
}
