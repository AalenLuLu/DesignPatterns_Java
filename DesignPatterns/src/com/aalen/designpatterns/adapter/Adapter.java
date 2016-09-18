package com.aalen.designpatterns.adapter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Aalen on 16/9/19.
 */
public class Adapter extends TargetInterface {
    private AdapteeInterface adaptee;
    public Adapter(AdapteeInterface adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String requestTime() {
        long time = adaptee.requestTime();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(new Date(time));
    }
}
