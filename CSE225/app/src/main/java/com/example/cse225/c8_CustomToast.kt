package com.example.cse225

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.cse225.databinding.ActivityC8CustomToastBinding

class c8_CustomToast : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c8_custom_toast)
        val btnToast = findViewById<Button>(R.id.btnToast)

        btnToast.setOnClickListener {
            val vg: ViewGroup? = findViewById(R.id.custom_toast)
            val inflater = layoutInflater

            val layout: View = inflater.inflate(R.layout.activity_c82_custom_toast_layout,vg)

            val tv = layout.findViewById<TextView>(R.id.txtVw)
            tv.text = "CUSTOM TOAST NOTIFICATION"

            val toast = Toast(applicationContext)
            toast.setGravity(Gravity.CENTER_VERTICAL,0,100)
            toast.setView(layout)
            toast.duration = Toast.LENGTH_LONG
            toast.show()
        }
    }
}


