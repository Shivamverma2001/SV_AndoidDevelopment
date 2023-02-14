package com.example.cse225

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class c9_SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c9_splash_screen)
        Handler(Looper.getMainLooper()).postDelayed(
            {
                val i = Intent(this, c9_2::class.java)
                startActivity(i)
                finish() },5000 )

    }
}