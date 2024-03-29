package com.example.basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast

class c26popupmenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c26popupmenu)
        val btn = findViewById<Button>(R.id.btnShow)

        btn.setOnClickListener {
            val popup = PopupMenu(this,btn)
            popup.menuInflater.inflate(R.menu.popupmenu, popup.menu)

            popup.setOnMenuItemClickListener {
                Toast.makeText(applicationContext,"You Clicked : " + it.title, Toast.LENGTH_LONG).show()
                true
            }
            popup.show()
        }
    }
}