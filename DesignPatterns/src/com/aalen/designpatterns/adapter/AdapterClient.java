package com.aalen.designpatterns.adapter;

/**
 * Created by Aalen on 16/9/19.
 */
public class AdapterClient {
    public static void execute() {
        TargetInterface target = new TargetInterface();
        AdapteeInterface adaptee = new AdapteeInterface();
        Adapter adapter = new Adapter(adaptee);
        System.out.println("Target: " + target.requestTime());
        System.out.println("Adapter: " + adapter.requestTime());
    }
}
