package com.geosurf.logtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {

    String path;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        path = FileUtil.getSdCardPath();

        Log.i("-----1",FileUtil.isSdCardExist()+"");
        Log.i("-----1",FileUtil.getSdCardPath());
        Log.i("-----1",FileUtil.getDefaultFilePath("Sunny.txt"));
        FileUtil.createDIR(path+"/Sunny");
        FileUtil.createFile(path+"/Sunny.txt");
        Log.i("-----1",FileUtil.getDefaultFilePath("Sunny.txt"));
    }
}
