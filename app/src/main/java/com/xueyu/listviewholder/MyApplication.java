package com.xueyu.listviewholder;

import android.app.Application;
import android.content.Context;

/**
 * Created by Flim on 2015/12/4.
 */
public class MyApplication extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context getmContext() {
        return mContext;
    }
}
