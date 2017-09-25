package com.example.asus001.kotlintest1.test.recycleview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.asus001.kotlintest1.R

class RecyclerViewTextActivity : AppCompatActivity() {

    private var recyclerView:RecyclerView? = null;
    private var linerLayoutParam : LinearLayoutManager? = null;
    private var list:MutableList<String>? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view_text)

        getData()

        recyclerView = findViewById(R.id.recyclerView)
        linerLayoutParam = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerView!!.layoutManager = linerLayoutParam;
        recyclerView!!.adapter=RecyclerBaseAdapter(this,list);
    }

    private fun getData():Unit{
        list = ArrayList<String>()
        for (i in 1..12){
            list!!.add("$i")
        }
    }
}
