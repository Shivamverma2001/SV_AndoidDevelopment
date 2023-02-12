package com.example.basic

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class c5calculator : AppCompatActivity() {
    lateinit var n1: EditText
    lateinit var n2: EditText
    lateinit var add: Button
    lateinit var sub: Button
    lateinit var mul: Button
    lateinit var div: Button
    lateinit var mod: Button
    lateinit var ans: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c5calculator)
        n1=findViewById(R.id.E1)
        n2=findViewById(R.id.E2)
        add=findViewById(R.id.B1)
        sub=findViewById(R.id.B2)
        mul=findViewById(R.id.B3)
        div=findViewById(R.id.B4)
        mod=findViewById(R.id.B5)
        ans=findViewById(R.id.T2)
        var next=findViewById<Button>(R.id.next)
        var previous=findViewById<Button>(R.id.previous)
        add.setOnClickListener(){
            if(n1.text.isEmpty()||n2.text.isEmpty())
                ans.text="Please Enter the value"
            var a:Int=n1.text.toString().toInt()+n2.text.toString().toInt()
            ans.text=a.toString()
        }
        sub.setOnClickListener(){
            if(n1.text.isEmpty()||n2.text.isEmpty())
                ans.text="Please Enter the value"
            var a:Int=n1.text.toString().toInt()-n2.text.toString().toInt()
            ans.text=a.toString()
        }
        mul.setOnClickListener(){
            if(n1.text.isEmpty()||n2.text.isEmpty())
                ans.text="Please Enter the value"
            var a:Int=n1.text.toString().toInt()*n2.text.toString().toInt()
            ans.text=a.toString()
        }
        div.setOnClickListener(){
            if(n1.text.isEmpty()||n2.text.isEmpty())
                ans.text="Please Enter the value"
            var a:Int=n1.text.toString().toInt()/n2.text.toString().toInt()
            ans.text=a.toString()
        }
        mod.setOnClickListener(){
            if(n1.text.isEmpty()||n2.text.isEmpty())
                ans.text="Please Enter the value"
            var a:Int=n1.text.toString().toInt()%n2.text.toString().toInt()
            ans.text=a.toString()
        }
        next.setOnClickListener{
            var i= Intent(this,c6radiobutton::class.java)
            startActivity(i)
        }
        previous.setOnClickListener{
            var i= Intent(this,c3basicForm::class.java)
            startActivity(i)
        }
    }
}