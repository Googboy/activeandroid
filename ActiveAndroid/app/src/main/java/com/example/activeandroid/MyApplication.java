package com.example.activeandroid;

import android.app.Application;

import com.activeandroid.ActiveAndroid;

/**
 * Created by 潘硕 on 2017/11/9.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);
    }
}
