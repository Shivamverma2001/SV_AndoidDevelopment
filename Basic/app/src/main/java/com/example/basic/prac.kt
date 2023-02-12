package com.example.basic

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class prac : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        var e1=findViewById<EditText>(R.id.e1)
        var b1=findViewById<Button>(R.id.b1)
        var b2=findViewById<Button>(R.id.b2)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prac)
        b1.setOnClickListener{
            val t = e1.text.toString()
            Toast.makeText(this,t,Toast.LENGTH_SHORT).show()
        }
        b2.setOnClickListener {
            e1.text=null
        }
    }
}