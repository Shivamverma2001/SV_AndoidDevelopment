package com.example.basic

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class c7ImageButton : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c7_image_button)
        var next=findViewById<Button>(R.id.next)
        var previous=findViewById<Button>(R.id.previous)
        next.setOnClickListener{
            var i= Intent(this,c8regformradiobtn::class.java)
            startActivity(i)
        }
        previous.setOnClickListener{
            var i= Intent(this,c6radiobutton::class.java)
            startActivity(i)
        }
    }
}