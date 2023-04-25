package com.example.cse225

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class c24_1RecArc(context: Context?): View(context) {
    lateinit var p: Paint
    init{
        init()
    }
    private fun init(){
        p=Paint()
    }

    override fun onDraw(canvas: Canvas) {
        canvas.drawColor(Color.BLUE)
        p.color=Color.RED
        canvas.drawRect(100f,100f,500f,500f,p)
        canvas.drawArc(500f,500f,800f,800f,0f,60f,true,p)
        canvas.drawArc(500f,500f,800f,800f,90f,60f,true,p)
        canvas.drawArc(500f,500f,800f,800f,210f,60f,true,p)
        canvas.drawArc(300f,1200f,800f,800f,0f,360f,true,p)
        p.color=Color.CYAN
        canvas.drawArc(150f,150f,300f,300f,0f,360f,true,p)

    }
}