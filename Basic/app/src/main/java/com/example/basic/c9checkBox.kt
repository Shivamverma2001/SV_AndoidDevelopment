package com.example.basic

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class c9checkBox : AppCompatActivity() {
    lateinit var b1: Button
    lateinit var pizza: CheckBox
    lateinit var burger: CheckBox
    lateinit var noodles: CheckBox
    lateinit var momos: CheckBox
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c9check_box)
        b1=findViewById(R.id.b1)
        pizza=findViewById(R.id.c1)
        burger=findViewById(R.id.c2)
        noodles=findViewById(R.id.c3)
        momos=findViewById(R.id.c4)
        b1.setOnClickListener(){
            var result:String="You select "
            var sum:Int=0
            if(pizza.isChecked()) {
                result = result + pizza.text + " "
                sum+=250
            }
            if(burger.isChecked()) {
                result = result + burger.text + " "
                sum+=30
            }
            if(noodles.isChecked()) {
                result = result + noodles.text + " "
                sum+=60
            }
            if(momos.isChecked()) {
                result = result + momos.text + " "
                sum+=60
            }
            result+=sum
            Toast.makeText(applicationContext,result, Toast.LENGTH_SHORT).show()
        }
        var next=findViewById<Button>(R.id.next)
        var previous=findViewById<Button>(R.id.previous)
        next.setOnClickListener{
            var i= Intent(this,c10listview::class.java)
            startActivity(i)
        }
        previous.setOnClickListener{
            var i= Intent(this,c8regformradiobtn::class.java)
            startActivity(i)
        }
    }
}