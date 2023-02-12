package com.example.basic

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class c27Snackbar : AppCompatActivity() {
    lateinit var clmain : ConstraintLayout
    lateinit var btn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c27_snackbar)

        // view bindings
        clmain = findViewById(R.id.main)
        btn = findViewById(R.id.button)
        btn.setOnClickListener {
            val snackbar = Snackbar.make(clmain, "Message is Deleted", Snackbar.LENGTH_LONG)
                .setAction("UNDO") {
                    val snackbar =Snackbar.make(clmain, "Message is restored", Snackbar.LENGTH_LONG)
                    snackbar.show()
                }
            snackbar.show()
        }
    }
}