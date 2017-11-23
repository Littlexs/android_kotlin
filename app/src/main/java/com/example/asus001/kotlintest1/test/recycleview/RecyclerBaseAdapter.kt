package com.example.asus001.kotlintest1.test.recycleview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.asus001.kotlintest1.R

/**
 * Created by ASUS001 on 2017/9/21.
 */
class RecyclerBaseAdapter(var context:Context,var list:MutableList<String>?) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        var itemHolder:ViewHolder = holder as ViewHolder
        itemHolder.textView.setText(position.toString())
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.recycler_item,null);
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return list!!.size
    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        var textView:TextView;
        init {
            textView = itemView!!.findViewById(R.id.textView)
        }
    }

}