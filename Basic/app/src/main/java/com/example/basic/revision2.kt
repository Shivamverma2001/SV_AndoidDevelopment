package com.example.basic

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class revision2 : AppCompatActivity() {
    lateinit var ans:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_revision2)
        ans=findViewById(R.id.ans)
        var i=intent
        var b=i.getBundleExtra("info")
        var x=b?.getInt("first")
        ans.text=x.toString()
    }
}