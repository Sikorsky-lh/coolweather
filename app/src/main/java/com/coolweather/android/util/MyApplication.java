package com.coolweather.android.util;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePalApplication;

/**
 * Created by lihang on 2017/4/21.
 */

public class MyApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        context=getApplicationContext();
        LitePalApplication.initialize(context);
    }

    public static Context getContext(){
        return context;
    }
}
