package com.example.basic

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class ca2BookMyShow1 : AppCompatActivity() {
    lateinit var btn:ImageButton
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ca2_book_my_show1)
        btn=findViewById(R.id.next)
        btn.setOnClickListener {
            var i = Intent(this, ca2BookMyShow2::class.java)
            startActivity(i)
        }
    }
}