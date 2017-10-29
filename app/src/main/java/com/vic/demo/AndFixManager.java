package com.vic.demo;

import android.content.Context;

import com.alipay.euler.andfix.patch.PatchManager;

import java.io.IOException;


/**
 * Created by malijie on 2017/10/28.
 */

public class AndFixManager {
    private static AndFixManager mInstance = null;
    private static PatchManager mPatchManager = null;

    private AndFixManager(){

    }

    public static void init(Context context) {
        mPatchManager = new PatchManager(context);
        mPatchManager.init(Utils.getAppVersion(context));
        mPatchManager.loadPatch();
    }

    public static AndFixManager getInstance(){
        if(mInstance == null){
            synchronized (AndFixManager.class){
                if(mInstance == null){
                    mInstance = new AndFixManager();
                }
            }
        }
        return mInstance;
    }

    public void addPatch(String path){
        try {
            mPatchManager.addPatch(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
