package com.example.basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class c19b : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c19b)
        var tv = findViewById<TextView>(R.id.textView4)
        val i = intent
        val b = i.getBundleExtra("info")
        val x = b?.getInt("First")
        val y = b?.getInt("second")
        var res = 0
        val op = b?.getString("operation")
        Toast.makeText(this, "" + x + y + op, Toast.LENGTH_LONG).show()
        when (op) {
            "+" -> if (x != null && y != null) {
                res = x + y
            }
            "-" -> if (x != null && y != null) {
                res = x - y
            }
            "*" -> if (x != null && y != null) {
                res = x * y
            }
            "/" -> if (x != null && y != null) {
                res = x / y
            }
        }

        tv.text=res.toString()
    }
}