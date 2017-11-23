package com.example.asus001.kotlintest1.test.viewpager

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import com.example.asus001.kotlintest1.R

class ViewPageActivity : AppCompatActivity() {

    var viewPage:ViewPager? = null;
    var viewList:MutableList<View>? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_page)
        viewPage = findViewById(R.id.viewPager)
        init();
    }

    fun init(): Unit {
        var view:View? = null;
        for (i in 1..10){
            view = LayoutInflater.from(this).inflate(R.layout.viewpager_item,null);
            viewList!!.add(view);
        }
    }
}
