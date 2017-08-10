package com.kenny.mysmall;

import android.app.Application;

import net.wequick.small.Small;

/**
 * description
 * Created by kenny on 2017/8/9.
 * version
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Small.preSetUp(this);//small框架的初始化
    }
}
