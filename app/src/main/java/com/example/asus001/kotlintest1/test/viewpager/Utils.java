package com.example.asus001.kotlintest1.test.viewpager;

import android.content.Context;
import android.widget.Toast;

import com.example.asus001.kotlintest1.test.BaseApp;

/**
 * Created by BDXK on 2017/11/16.
 */

public class Utils {
    public static void toast(String content){
        Toast.makeText(BaseApp.Companion.getContext(),content,Toast.LENGTH_SHORT).show();
    }
}
