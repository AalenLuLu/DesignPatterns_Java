package com.aalen.designpatterns.adapter;

/**
 * Created by Aalen on 16/9/19.
 */
public class AdapteeInterface {
    public long requestTime() {
        return System.currentTimeMillis();
    }
}
