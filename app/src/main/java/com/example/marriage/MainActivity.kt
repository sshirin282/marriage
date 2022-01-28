package com.example.marriage

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var adapter: Adapter

    val name= arrayOf<String>("ZUBEIR","SHIRIN")
    val des= arrayOf<String>("Husband","Wife")
    val image= arrayOf<Int>(R.drawable.zu,R.drawable.sh)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.recyclerView)

        adapter= Adapter(this,name,des,image)
        val layoutManager=LinearLayoutManager(this)
        recyclerView.layoutManager=layoutManager
        recyclerView.adapter=adapter

        //val layoutManager= LinearLayoutManager(context)
        //RecyclerView.layoutManager=layoutManager
        //RecyclerView.Adapter=adapter

    }
}