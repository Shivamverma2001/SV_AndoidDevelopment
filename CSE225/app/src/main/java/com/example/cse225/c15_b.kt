package com.example.cse225

import android.annotation.SuppressLint
import android.app.NotificationManager
import android.app.RemoteInput
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class c15_b : AppCompatActivity() {
    lateinit var notificationManager:NotificationManager
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c15_b)
        var txtView=findViewById<TextView>(R.id.tv)
        var inp=c15_Notification()
        var bundle:Bundle=RemoteInput.getResultsFromIntent(intent)
        if(bundle!=null)
            txtView.setText(bundle.getString(inp.myKey))
        //txtView.text="hey"
        notificationManager=getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        notificationManager.cancel(inp.notificationId)
    }
}