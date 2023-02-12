package com.example.basic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class c17explicitIntent : AppCompatActivity() {
    val id:Int=10
    val msg:String = "kotlin"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c17explicit_intent)
        val btnC = findViewById<Button>(R.id.FirstBtn)
        btnC.setOnClickListener {
            val intent = Intent(this, c17explicitintentb::class.java)
            intent.putExtra("id_value", id)
            intent.putExtra("msg_value", msg)
            startActivity(intent)
        }
    }
}