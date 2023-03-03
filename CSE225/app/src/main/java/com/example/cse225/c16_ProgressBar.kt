package com.example.cse225

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.cse225.databinding.ActivityC16ProgressBarBinding

class c16_ProgressBar : AppCompatActivity() {
    private var i = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c16_progress_bar)

        val pgsBar = findViewById<ProgressBar>(R.id.pBar)
        val pgsBar1 = findViewById<ProgressBar>(R.id.pBarCircular)
        val txtView = findViewById<TextView>(R.id.tView)
        val btn = findViewById<Button>(R.id.btnShow)
        val btnR = findViewById<Button>(R.id.btnReset)

        pgsBar1.visibility = View.INVISIBLE
        btn.setOnClickListener {
            pgsBar1.visibility = View.VISIBLE
            i= pgsBar.progress
            Thread{
                while(i<100){
                    i = i+1
                    Handler(Looper.getMainLooper()).post {
                        pgsBar.progress = i
                        txtView.text = i.toString() + "/" + pgsBar.max
                        if (i == 100) {
                            pgsBar1.visibility = View.INVISIBLE
                        }
                    }
                    try {
                        Thread.sleep(1000)
                    }
                    catch (e: InterruptedException) {
                        e.printStackTrace()
                    }
                }
            }.start()
        }
        btnR.setOnClickListener {
            pgsBar.progress = 0
            txtView.text = 0.toString() + "/" + pgsBar.max
        }
    }

}