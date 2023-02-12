package com.example.basic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class c1basic : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c1basic)
        val editText = findViewById<EditText>(R.id.edt_text)
        val btn = findViewById<Button>(R.id.btn2)


        btn.setOnClickListener(){
            val t = editText.text.toString()
            Toast.makeText(this,t, Toast.LENGTH_LONG).show()
        }
        var next=findViewById<Button>(R.id.next)
        var previous=findViewById<Button>(R.id.previous)
        next.setOnClickListener{
            var i= Intent(this,c2basicCalculator::class.java)
            startActivity(i)
        }
        previous.setOnClickListener{
            var i= Intent(this,c15dynamicview::class.java)
            startActivity(i)
        }
    }
}