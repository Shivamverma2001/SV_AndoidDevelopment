package com.example.basic

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class c15dynamicview : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c15dynamicview)
        var ll=findViewById<LinearLayout>(R.id.linearLayout)
        var b1=findViewById<Button>(R.id.b1)
        b1.setOnClickListener{
            var b2: Button = Button(this)
            b2.text="New Button"
            b2.layoutParams=
                LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
            var pf: TextView = TextView(this)
            pf.text="New Button Added!"
            pf.layoutParams=
                LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
            b2.setOnClickListener{
                Toast.makeText(applicationContext,"New Button Added!", Toast.LENGTH_SHORT).show()
            }
            ll.addView(b2)
            ll.addView(pf)
        }
        var next=findViewById<Button>(R.id.next)
        var previous=findViewById<Button>(R.id.previous)
        next.setOnClickListener{
            var i= Intent(this,c1basic::class.java)
            startActivity(i)
        }
        previous.setOnClickListener{
            var i= Intent(this,c14imagebtn::class.java)
            startActivity(i)
        }
    }
}