package com.example.cse225

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.RemoteInput
import android.content.ContentResolver
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.graphics.Color
import android.graphics.ColorSpace.RenderIntent
import android.media.AudioAttributes
import android.net.Uri
import android.os.Build
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
            pendingIntent=PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_IMMUTABLE)
            soundUri= Uri.parse(ContentResolver.SCHEME_ANDROID_RESOURCE+"://"+applicationContext.packageName+"/"+R.raw.ringtone)
            audioAttr=AudioAttributes.Builder()
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .setUsage(AudioAttributes.USAGE_NOTIFICATION)
                .build()
            //remoteCollapsedViews= RemoteViews(packageName,R.layout.activity_c92)
            //remoteCollapsedViews=RemoteViews(packageName,R.layout.activity_c9_splash_screen)
            myNotificationChannel()
            /*remoteInput=RemoteInput.Builder(myKey).setLabel("Replying...").build()
            val action:Notification.Action=Notification.Action.Builder(R.drawable.check,"Reply",pendingIntent)
                .addRemoteInput(remoteInput).build()
            builder.addAction(action)*/
            notificationManager.notify(notificationId,builder.build())
        }
    }
    private fun myNotificationChannel(){
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            notificationChannel= NotificationChannel(channelId,description,NotificationManager.IMPORTANCE_HIGH)
            notificationChannel.enableLights(true)
            notificationChannel.lightColor= Color.GREEN
            notificationChannel.enableVibration(false)
            notificationChannel.setSound(soundUri,audioAttr)
            notificationManager.createNotificationChannel(notificationChannel)

            builder=Notification.Builder(this,channelId)
                .setSmallIcon(R.drawable.baseline_announcement_24)
                .setContentTitle(title)
                .setContentText(description)
                .setLargeIcon(BitmapFactory.decodeResource(this.resources,R.drawable.logo_toolbar))
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
        }
        else{
            builder=Notification.Builder(this)
                .setSmallIcon(R.drawable.baseline_announcement_24)
                .setContentTitle(title)
                .setContentText(description)
                .setLargeIcon(BitmapFactory.decodeResource(this.resources,R.drawable.logo_toolbar))
                .setContentIntent(pendingIntent)
                .setAutoCancel(true)
        }
    }
}