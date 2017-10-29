package com.vic.demo;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;


/**
 * Created by malijie on 2017/10/28.
 */

public class Utils {
    public static String getAppVersion(Context context) {
        String versionName = "1.0.0";
        try {
            PackageManager pm = context.getPackageManager();
            PackageInfo pi = pm.getPackageInfo(context.getPackageName(), 0);
            versionName = pi.versionName;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return versionName;
    }


    public static void printLog(){
        String log = null;
        Log.e("MainActivity","fix ok");
    }
}
