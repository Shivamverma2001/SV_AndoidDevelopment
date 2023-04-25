package com.example.cse225

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.annotation.RequiresApi

class c24_Drawing : AppCompatActivity() {
    lateinit var customDrawing:c24_1RecArc
    lateinit var clear:Button
    lateinit var customFan:c25_CustomViewFan
    lateinit var signature: c25_Signature
    @RequiresApi(Build.VERSION_CODES.M)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c24_drawing)
        signature=findViewById(R.id.signature) as c25_Signature
//        clear=findViewById(R.id.clear)
//        customDrawing=c24_1RecArc(this)
//        setContentView(customDrawing)
//        customFan=c25_CustomViewFan(this)
//        setContentView(customFan)
        signature= c25_Signature(this)
        setContentView(signature)
        clear.setOnClickListener{
            signature.clear()
        }
    }
}