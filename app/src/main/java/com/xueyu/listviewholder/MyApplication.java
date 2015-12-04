package com.xueyu.listviewholder;

import android.app.Application;
import android.content.Context;

/**
 * Created by Flim on 2015/12/4.
 */
public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
