package com.example.basic

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class c16Swiggy : AppCompatActivity() {
    lateinit var starter: ImageButton
    lateinit var main: ImageButton
    lateinit var sweet: ImageButton
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c16_swiggy)
        starter=findViewById(R.id.b1)
        main=findViewById(R.id.b2)
        sweet=findViewById(R.id.b3)
        starter.setOnClickListener{
            var i= Intent(this,c16starter::class.java)
            startActivity(i)
        }
        main.setOnClickListener{
            var i= Intent(this,c16main::class.java)
            startActivity(i)
        }
        sweet.setOnClickListener{
            var i= Intent(this,c16sweet::class.java)
            startActivity(i)
        }
    }
}