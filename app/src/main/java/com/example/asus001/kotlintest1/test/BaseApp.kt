package com.example.asus001.kotlintest1.test

import android.app.Application
import android.content.Context

/**
 * Created by BDXK on 2017/11/16.
 */
class BaseApp : Application() {

    companion object {
        var context: Context? = null;
    }

    override fun onCreate() {
        super.onCreate()
        context = baseContext;
    }

}