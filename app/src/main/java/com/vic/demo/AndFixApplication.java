package com.vic.demo;

import android.app.Application;
import android.content.Context;


/**
 * Created by malijie on 2017/10/28.
 */

public class AndFixApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        initAndFix();
    }

    private void initAndFix() {
        AndFixManager.getInstance().init(this);

    }
}
