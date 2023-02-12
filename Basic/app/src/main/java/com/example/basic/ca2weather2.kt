package com.example.basic

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.basic.databinding.ActivityCa2weather2Binding

class ca2weather2 : AppCompatActivity() {
    lateinit var img:ImageButton
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ca2weather2)
        img=findViewById(R.id.i1)
        img.setOnClickListener{
            var i= Intent(this,ca2weather3::class.java)
            startActivity(i)
        }
    }
}