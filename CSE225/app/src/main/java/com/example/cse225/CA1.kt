package com.example.cse225

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.EditText
import android.widget.RatingBar
import android.widget.Toast

class CA1 : AppCompatActivity() {
    lateinit var alarm:Button
    lateinit var ratingBar:RatingBar
    lateinit var text1:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ca1)
        alarm=findViewById(R.id.alarm)
        ratingBar=findViewById(R.id.ratingbar)
        text1=findViewById(R.id.e1)
        var alarmManager: AlarmManager
        val intent = Intent(this,ca13::class.java)
        val pendingIntent = PendingIntent.getBroadcast(this,798, intent, PendingIntent.FLAG_IMMUTABLE)
        alarm.setOnClickListener {
            var i = text1.text.toString().toInt()
            alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
            alarmManager.set(AlarmManager.RTC_WAKEUP,System.currentTimeMillis()+ (i*1000),pendingIntent)
            Toast.makeText(this, "Alarm set in $i seconds", Toast.LENGTH_LONG ).show()
        }
        Handler(Looper.getMainLooper()).postDelayed(
            {
                val i = Intent(this, CA12::class.java)
                startActivity(i)
                finish() },5000 )
        ratingBar.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            Toast.makeText(this,"Your rating 1 score is ${ratingBar.rating}", Toast.LENGTH_SHORT).show()
        }
    }
}