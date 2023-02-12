package com.example.basic

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class c2basicCalculator : AppCompatActivity() {
    lateinit var txt: TextView
    lateinit var input1: EditText
    lateinit var input2: EditText
    lateinit var result: TextView
    lateinit var next: Button
    lateinit var previous: Button
    lateinit var btn: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c2basic_calculator)
        txt=findViewById(R.id.txtView)
        input1=findViewById(R.id.edtTxtone)
        input2=findViewById(R.id.edtTxttwo)
        result=findViewById(R.id.textView2)
        next=findViewById(R.id.next)
        previous=findViewById(R.id.previous)
        btn=findViewById(R.id.button)
        btn.setOnClickListener() {
            if (input1.text.toString().isEmpty() || input2.text.toString().isEmpty())
                result.text = "Please enter the number.."
            else {
                var a: Int = input1.text.toString().toInt()
                var b: Int = input2.text.toString().toInt()
                var c: Int = a + b
                result.text = c.toString()
            }
        }
        next.setOnClickListener{
            var i= Intent(this,c3basicForm::class.java)
            startActivity(i)
        }
        previous.setOnClickListener{
            var i= Intent(this,c2basicCalculator::class.java)
            startActivity(i)
        }
    }
}