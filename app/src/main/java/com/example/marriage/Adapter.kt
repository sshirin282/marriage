package com.example.marriage

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class Adapter(val context:Context, val name:Array<String>, val des:Array<String>, val image:Array<Int>):RecyclerView.Adapter<Adapter.ViewHolder>() {

   private val inflater:LayoutInflater=context.getSystemService(Context.LAYOUT_INFLATER_SERVICE)as LayoutInflater


    class ViewHolder (view: View):RecyclerView.ViewHolder(view){
        val textView:TextView=view.findViewById(R.id.textView1)
        val textView2:TextView=view.findViewById(R.id.textView2)
        val image:ImageView=view.findViewById(R.id.imageView1)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val rowView=inflater.inflate(R.layout.list,parent,false)
        return ViewHolder(rowView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = name[position]
        holder.textView2.text=des.get(position)
        holder.image.setImageResource(image[position])
    }

    override fun getItemCount(): Int {
        return name.size
    }
}