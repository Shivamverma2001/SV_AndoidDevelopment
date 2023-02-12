package com.example.basic

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.basic.databinding.ActivityC14imagebtnBinding

class c14imagebtn : AppCompatActivity() {
    lateinit var fb: ImageButton
    lateinit var insta: ImageButton
    lateinit var whatsapp: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c14imagebtn)
        fb = findViewById(R.id.img1)
        insta = findViewById(R.id.img2)
        whatsapp = findViewById(R.id.img3)

        fb.setOnClickListener {
            Toast.makeText(applicationContext,"Facebook", Toast.LENGTH_LONG).show()
        }

        insta.setOnClickListener {
            Toast.makeText(applicationContext,"Instagram", Toast.LENGTH_LONG).show()
        }

        whatsapp.setOnClickListener {
            Toast.makeText(applicationContext,"Whatsapp", Toast.LENGTH_LONG).show()
        }
        var next=findViewById<Button>(R.id.next)
        var previous=findViewById<Button>(R.id.previous)
        next.setOnClickListener{
            var i= Intent(this,c15dynamicview::class.java)
            startActivity(i)
        }
        previous.setOnClickListener{
            var i= Intent(this,c13spinner::class.java)
            startActivity(i)
        }
    }
}