package com.geosurf.logtest;

import android.os.Environment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by Professor on 2017/11/6.
 */

public class FileUtil {

    /**
     * 判断SDCard是否存在 [当没有外挂SD卡时，内置ROM也被识别为存在sd卡]
     */
    public static boolean isSdCardExist() {
        return Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
    }


    /**
     * 获取SD卡根目录路径
     */
    public static String getSdCardPath() {
        boolean exist = isSdCardExist();
        String sdpath = "";
        if (exist) {
            sdpath = Environment.getExternalStorageDirectory().getAbsolutePath();
        } else {
            sdpath = "不适用";
        }
        return sdpath;
    }


    /**
     * 判断文件是否已经存在
     */
    public static boolean checkFileExists(String filepath) {
        String SDPATH = Environment.getExternalStorageDirectory() + "/";
        File file = new File(SDPATH + filepath);
        return file.exists();
    }


    /**
     * 在SD卡上创建目录
     */
    public static void createDIR(String dirpath) {
        File dir = new File(dirpath);
        dir.mkdir();
    }

    /**
     * 在SD卡上创建文件；
     */
    public static void createFile(String filepath){
        File file = new File(filepath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    /**
     * 获取默认的文件路径
     */
    public static String getDefaultFilePath(String fileName) {
        String filepath = "";
        File file = new File(Environment.getExternalStorageDirectory(), fileName);
        if (file.exists()) {
            filepath = file.getAbsolutePath();
        } else {
            filepath = fileName + "文件不存在";
        }
        return filepath;
    }

}
