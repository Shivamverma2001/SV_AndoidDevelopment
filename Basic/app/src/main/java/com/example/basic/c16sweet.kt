package com.example.basic

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.basic.databinding.ActivityC16sweetBinding

class c16sweet : AppCompatActivity() {
    lateinit var c1: CheckBox
    lateinit var c2: CheckBox
    lateinit var c3: CheckBox
    lateinit var c4: CheckBox
    lateinit var c5: CheckBox
    lateinit var c6: CheckBox
    lateinit var c7: CheckBox
    lateinit var c8: CheckBox
    lateinit var c9: CheckBox
    lateinit var c10: CheckBox
    lateinit var c11: CheckBox
    lateinit var c12: CheckBox
    lateinit var submit: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_c16sweet)
        c1=findViewById(R.id.c1)
        c2=findViewById(R.id.c2)
        c3=findViewById(R.id.c3)
        c4=findViewById(R.id.c4)
        c5=findViewById(R.id.c5)
        c6=findViewById(R.id.c6)
        c7=findViewById(R.id.c7)
        c8=findViewById(R.id.c8)
        c9=findViewById(R.id.c9)
        c10=findViewById(R.id.c10)
        c11=findViewById(R.id.c11)
        c12=findViewById(R.id.c12)
        submit=findViewById(R.id.submit)
        submit.setOnClickListener{
            var ans:String="You order "
            var price=0
            if(c1.isChecked()) {
                ans+=c1.text.toString()
                price+=50
            }
            if(c2.isChecked()) {
                ans+=c2.text.toString()
                price+=50
            }
            if(c3.isChecked()) {
                ans+=c3.text.toString()
                price+=50
            }
            if(c4.isChecked()) {
                ans+=c4.text.toString()
                price+=50
            }
            if(c5.isChecked()) {
                ans+=c5.text.toString()
                price+=40
            }
            if(c6.isChecked()) {
                ans+=c6.text.toString()
                price+=40
            }
            if(c7.isChecked()) {
                ans+=c7.text.toString()
                price+=45
            }
            if(c8.isChecked()) {
                ans+=c8.text.toString()
                price+=45
            }
            if(c9.isChecked()) {
                ans+=c5.text.toString()
                price+=70
            }
            if(c10.isChecked()) {
                ans+=c6.text.toString()
                price+=60
            }
            if(c11.isChecked()) {
                ans+=c7.text.toString()
                price+=60
            }
            if(c12.isChecked()) {
                ans+=c8.text.toString()
                price+=70
            }
            if(ans.length==10)
                Toast.makeText(applicationContext,"Please select some food", Toast.LENGTH_SHORT).show()
            else{
                Toast.makeText(applicationContext,ans+" "+price, Toast.LENGTH_SHORT).show()
                var i= Intent(this,c16payment::class.java)
                startActivity(i)
            }
        }

    }
}