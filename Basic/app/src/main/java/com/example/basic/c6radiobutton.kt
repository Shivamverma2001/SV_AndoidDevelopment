package com.example.basic

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class c6radiobutton : AppCompatActivity() {
    lateinit var radioButton: RadioButton
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c6radiobutton)
        val Rgrp = findViewById<RadioGroup>(R.id.rg1)
        val BtnSubmit = findViewById<Button>(R.id.b1)
        val BtnReset = findViewById<Button>(R.id.b2)
        val txtView = findViewById<TextView>(R.id.t3)
        var next=findViewById<Button>(R.id.next)
        var previous=findViewById<Button>(R.id.previous)

        BtnSubmit.setOnClickListener {
            val selectId:Int = Rgrp.checkedRadioButtonId
            radioButton = findViewById(selectId)
            var out:String = radioButton.text.toString()
            txtView.text = "Selected: $out "
        }
        BtnReset.setOnClickListener {
            Toast.makeText(applicationContext,"hello", Toast.LENGTH_SHORT).show()
            Rgrp.setOnCheckedChangeListener(null);
            Rgrp.clearCheck();
            txtView.text = " "
            Rgrp.setOnCheckedChangeListener(
                RadioGroup.OnCheckedChangeListener { group, checkedId ->val radio: RadioButton = findViewById(checkedId)
                    Toast.makeText(applicationContext, " On checked change : ${radio.text}",Toast.LENGTH_SHORT).show()
                }
            )
        }
        Rgrp.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(applicationContext, " On checked change : ${radio.text}",Toast.LENGTH_SHORT).show()
// radio.setTextColor(Color.parseColor("#fe9c02"))
            }
        )
        next.setOnClickListener{
            var i= Intent(this,c7ImageButton::class.java)
            startActivity(i)
        }
        previous.setOnClickListener{
            var i= Intent(this,c5calculator::class.java)
            startActivity(i)
        }
    }
}