package com.example.basic

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.LinearLayout
import android.widget.ListView

class c10listview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c10listview)
        val lv=findViewById<ListView>(R.id.lv1)
        val ll=findViewById<LinearLayout>(R.id.ll)
        val a= arrayOf(Color.RED, Color.BLUE, Color.YELLOW, Color.WHITE)
        val b= arrayOf("RED","BLUE","YELLOW","WHITE")
        val ab= ArrayAdapter(this,android.R.layout.simple_list_item_1,b)
        lv.setAdapter(ab)
        lv.setOnItemClickListener{adapterView,view,position,id->ll.setBackgroundColor(a[position])}
        var next=findViewById<Button>(R.id.next)
        var previous=findViewById<Button>(R.id.previous)
        next.setOnClickListener{
            var i= Intent(this,c11calc::class.java)
            startActivity(i)
        }
        previous.setOnClickListener{
            var i= Intent(this,c9checkBox::class.java)
            startActivity(i)
        }
    }
}