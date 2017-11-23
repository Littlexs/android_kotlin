package com.example.asus001.kotlintest1.test.viewpager

import android.support.v4.view.PagerAdapter
import android.view.View
import android.view.ViewGroup

/**
 * Created by BDXK on 2017/11/16.
 */
class MyPagerAdapter constructor(viewList: MutableList<View>?) : PagerAdapter() {

    var viewList: MutableList<View>? = null;

    init {
        this.viewList = viewList;
    }


    override fun isViewFromObject(view: View?, `object`: Any?): Boolean {
        return view == `object`
    }

    override fun getCount(): Int {
        return viewList!!.size
    }

    override fun instantiateItem(container: ViewGroup?, position: Int): Any {
        return super.instantiateItem(container, position)
    }

}