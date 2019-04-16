package com.mliuxb.lxbweather;

import android.app.Application;
import android.util.Log;

/**
 * Description:
 * Copyright  : Copyright (c) 2018
 * Company    : ZWZX
 * Author     : Liuxb
 * Date       : 2019/3/18 15:10
 */
public class MyApplication extends Application {
    private static final String TAG = "MyApplication";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e(TAG, "onCreate: ...........");
        //LitePal.initialize(this);
    }
}
