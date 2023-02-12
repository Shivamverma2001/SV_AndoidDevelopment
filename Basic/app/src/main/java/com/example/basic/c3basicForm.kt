package com.example.basic

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class c3basicForm : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var name: EditText
        lateinit var pass: EditText
        lateinit var email: EditText
        lateinit var date: EditText
        lateinit var phone: EditText
        lateinit var txt: TextView

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c3basic_form)
        var btn=findViewById<Button>(R.id.btn)

        name=findViewById(R.id.txtName)
        pass=findViewById(R.id.textPassword)
        email=findViewById(R.id.textEmail)
        date=findViewById(R.id.textDate)
        phone=findViewById(R.id.textPhone)
        txt=findViewById<TextView>(R.id.textView)
        var next=findViewById<Button>(R.id.next)
        var previous=findViewById<Button>(R.id.previous)
        btn.setOnClickListener(){

            if(name.text.isEmpty()||pass.text.isEmpty()||email.text.isEmpty()||date.text.isEmpty()||phone.text.isEmpty()) {

                txt.text = "Please Fill the TextView Lines"
            }
            else{
                txt.text="name ${name.text}, password ${pass.text}, email ${email.text}, date ${date.text}, phone ${phone.text}"
            }
        }
        next.setOnClickListener{
            var i= Intent(this,c5calculator::class.java)
            startActivity(i)
        }
        previous.setOnClickListener{
            var i= Intent(this,c2basicCalculator::class.java)
            startActivity(i)
        }
    }
}