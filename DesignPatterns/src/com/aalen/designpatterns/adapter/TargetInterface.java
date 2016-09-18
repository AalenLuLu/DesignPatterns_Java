package com.aalen.designpatterns.adapter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Aalen on 16/9/19.
 */
public class TargetInterface {
    public String requestTime() {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(new Date());
    }
}
