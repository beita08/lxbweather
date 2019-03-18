package com.mliuxb.lxbweather;

import android.app.Application;

import org.litepal.LitePal;

/**
 * Description:
 * Copyright  : Copyright (c) 2018
 * Company    : ZWZX
 * Author     : Liuxb
 * Date       : 2019/3/18 15:10
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LitePal.initialize(this);
    }
}
