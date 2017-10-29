package com.vic.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    private static final String FILE_END = ".apatch";
    private static String mPatchDir ;//AndFixApplication.sContext.getExternalCacheDir().getAbsolutePath() + File.separator + "patch";
    private Button mBtnCreateBugs = null;
    private Button mBtnFixBugs = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPatchDir = getExternalCacheDir().getAbsolutePath() + "/apatch/";
        final File file = new File(mPatchDir);
        if(file== null || !file.exists()){
            file.mkdir();
        }

//        mBtnCreateBugs = findViewById(R.id.id_generate_bug);
//        mBtnFixBugs = findViewById(R.id.id_fix_bug);
//
//        mBtnCreateBugs.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                creaert
//            }
//        });
    }

    public void createBug(View v){
        Utils.printLog();
    }

    public void fixBug(View v){
        AndFixManager.getInstance().addPatch(getPatchName());
    }



    //获取patch文件名
    private String getPatchName(){
        return mPatchDir.concat("imooc").concat(FILE_END);
    }
}
