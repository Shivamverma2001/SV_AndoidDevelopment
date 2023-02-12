package com.example.basic

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class c11calc : AppCompatActivity() {
    lateinit var plus: Button
    lateinit var sub: Button
    lateinit var div: Button
    lateinit var mod: Button
    lateinit var mul: Button
    lateinit var aS: Button
    lateinit var aM: Button
    lateinit var ac: Button
    lateinit var e: EditText
    lateinit var a1: Button
    lateinit var a2: Button
    lateinit var a3: Button
    lateinit var a4: Button
    lateinit var a5: Button
    lateinit var a6: Button
    lateinit var a7: Button
    lateinit var a8: Button
    lateinit var a9: Button
    lateinit var a0: Button
    lateinit var a00: Button
    lateinit var ad: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c11calc)
        plus=findViewById(R.id.b1)
        sub=findViewById(R.id.b2)
        div=findViewById(R.id.b3)
        mod=findViewById(R.id.b4)
        a1=findViewById(R.id.b5)
        a2=findViewById(R.id.b6)
        a3=findViewById(R.id.b7)
        mul=findViewById(R.id.b8)
        a4=findViewById(R.id.b9)
        a5=findViewById(R.id.b10)
        a6=findViewById(R.id.b11)
        aS=findViewById(R.id.b12)
        a7=findViewById(R.id.b13)
        a8=findViewById(R.id.b14)
        a9=findViewById(R.id.b15)
        aM=findViewById(R.id.b16)
        a00=findViewById(R.id.b17)
        a0=findViewById(R.id.b18)
        ad=findViewById(R.id.b19)
        ac=findViewById(R.id.b20)
        var n1:String
        var n2:String
        a1.setOnClickListener{

        }
        var next=findViewById<Button>(R.id.next)
        var previous=findViewById<Button>(R.id.previous)
        next.setOnClickListener{
            var i= Intent(this,c12regformcheckradiospinner::class.java)
            startActivity(i)
        }
        previous.setOnClickListener{
            var i= Intent(this,c10listview::class.java)
            startActivity(i)
        }
    }
}