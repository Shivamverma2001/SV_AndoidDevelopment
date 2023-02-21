package com.example.cse225

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class c12_b : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c12_b)
        val btnB = findViewById<Button>(R.id.SecondBtn)

        val bundle:Bundle? = intent.extras
        val id = bundle?.get("id_value")
        val msg = bundle?.get("msg_value")

        Toast.makeText(applicationContext, id.toString()+" "+msg, Toast.LENGTH_LONG).show()

        btnB.setOnClickListener {
            val intent = Intent(this, c12_explicitIntent::class.java)
            startActivity(intent)
        }
    }
}