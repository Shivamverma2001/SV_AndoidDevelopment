package com.example.basic

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class c22AppChooser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c22_app_chooser)

        val btnApp = findViewById<Button>(R.id.button2)
        val btnApp2 = findViewById<Button>(R.id.button3)

        btnApp.setOnClickListener {

            val location = Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+California")
            val mapIntent = Intent(Intent.ACTION_VIEW, location)
            startActivity(mapIntent)
        }

        btnApp2.setOnClickListener {
            var url = "http://www.google.com"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setDataAndType(Uri.parse(url),"text/plain")
            val choose = Intent.createChooser(intent, "Share URL")
            startActivity(choose)
        }
    }
}