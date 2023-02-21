package com.example.cse225

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.RemoteInput
import android.content.ContentResolver
import android.content.Context
import android.content.Intent
import android.graphics.ColorSpace.RenderIntent
import android.media.AudioAttributes
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RemoteViews

class c15_Notification : AppCompatActivity() {
    lateinit var notificationManager:NotificationManager
    lateinit var notificationChannel:NotificationChannel
    lateinit var builder: Notification.Builder
    lateinit var btnNotify:Button
    lateinit var remoteCollapsedViews: RemoteViews
    lateinit var remoteExpandedViews: RemoteViews
    lateinit var pendingIntent: PendingIntent
    lateinit var soundUri:Uri
    lateinit var audioAttr: AudioAttributes
    lateinit var remoteInput:RemoteInput
    private val channelId="My Channel Id"
    private val description="Test Notification"
    private val title="Notification"
    val mKey="Remote Key"
    val notificationId=1234
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c15_notification)
        btnNotify =findViewById(R.id.btnNotify)
        notificationManager=getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        btnNotify.setOnClickListener {
            val intent =Intent(this, c15_b::class.java)
            pendingIntent=PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_UPDATE_CURRENT)
            soundUri= Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE+"://"+applicationContext.packageName+"/"+R.raw.ringtone)
            audioAttr=AudioAttributes.Builder()
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .setUsage(AudioAttributes.USAGE_NOTIFICATION)
                .build()
        }
    }
}