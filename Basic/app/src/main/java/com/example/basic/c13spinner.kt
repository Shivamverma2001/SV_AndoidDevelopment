package com.example.basic

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class c13spinner : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c13spinner)
        val txt2=findViewById<TextView>(R.id.txt2)
        val spinner: Spinner =findViewById(R.id.sp1)
        val a= arrayOf("Uttar Pradesh","Haryana","Delhi","Uttarakhand")
        if(spinner!=null) {
            val ad = ArrayAdapter(this, android.R.layout.simple_list_item_1, a)
            spinner.setAdapter(ad)
            spinner.onItemSelectedListener=object : AdapterView.OnItemSelectedListener{
                override fun onItemSelected(parent: AdapterView<*>?,view: View?, position: Int, id: Long) {
                    Toast.makeText(applicationContext,"Selected Item "+a[position], Toast.LENGTH_SHORT).show()
                    val outp:String=a[position]
                    txt2.text="Selected: $outp"
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    Toast.makeText(applicationContext,"Please select some text", Toast.LENGTH_SHORT).show()
                }
            }
        }
        var next=findViewById<Button>(R.id.next)
        var previous=findViewById<Button>(R.id.previous)
        next.setOnClickListener{
            var i= Intent(this,c14imagebtn::class.java)
            startActivity(i)
        }
        previous.setOnClickListener{
            var i= Intent(this,c12regformcheckradiospinner::class.java)
            startActivity(i)
        }

    }
}