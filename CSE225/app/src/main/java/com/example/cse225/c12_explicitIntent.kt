package com.example.cse225

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class c12_explicitIntent : AppCompatActivity() {
    val id:Int=10
    val msg:String = "kotlin"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c12_explicit_intent)
        val btnC = findViewById<Button>(R.id.FirstBtn)
        btnC.setOnClickListener {
            val intent = Intent(this, c12_b::class.java)
            intent.putExtra("id_value", id)
            intent.putExtra("msg_value", msg)
            startActivity(intent)
        }
    }
}