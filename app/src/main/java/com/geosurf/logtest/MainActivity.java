package com.geosurf.logtest;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private LogWriter mLogWriter;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Log.d("tag", "onCreate");

//        String SDCardPath = Environment.getExternalStorageDirectory().getAbsolutePath();//"/mnt/shared/Android_sdcard";//
//        File logf = new File(SDCardPath + "/iCE/DemoLog.txt");
//        if (!logf.exists()) {
//            try {
//                logf.createNewFile();
//            } catch (Exception e) {
//            }
//        }

//        File logf = new File(Environment.getExternalStorageDirectory()
//                + File.separator + "DemoLog.txt");

//        try {
//            mLogWriter = LogWriter.open(logf.getAbsolutePath());
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            Log.d("tag", e.getMessage());
//        }

//        log("onCreate()");
    }

    private void log(String msg) {
        try {
            mLogWriter.print(MainActivity.class, msg);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            Log.d("tag", e.getMessage());
        }
    }
}
