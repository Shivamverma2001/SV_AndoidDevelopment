package com.example.cse225

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class c26_Drawing : AppCompatActivity() {
    lateinit var drawing:c26_f1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c26_drawing)
        drawing=c26_f1(this)
        setContentView(drawing)
    }
}