package com.example.cse225

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View

class c26_f1(context: Context?): View(context) {
    lateinit var p: Paint
    var x=0
    var y=500
    init{
        init()
    }
    private fun init(){
        p= Paint()
    }

    override fun onDraw(canvas: Canvas) {
        canvas.drawColor(Color.BLUE)
        p.color= Color.RED
        canvas.drawRect(100f,100f,500f,500f,p)
        p.color= Color.GREEN
        canvas.drawRect(1000f,100f,600f,500f,p)
        p.color= Color.GRAY
        //canvas.drawArc(x+100f,100f,x+500f,500f,0f,360f,true,p)
        canvas.drawCircle(x+0f,y+0f,200f,p)

    }
//    override fun onTouchEvent(event: MotionEvent): Boolean {
//        for(i in 0..50000){
//            when(event.action){
//                // MotionEvent.ACTION_DOWN->startFan()
//                MotionEvent.ACTION_MOVE->startFan()
//                MotionEvent.ACTION_UP->startFan()
//            }
//        }
//        return true
//    }
    override fun onTouchEvent(event: MotionEvent): Boolean {
        when(event.action){
            MotionEvent.ACTION_DOWN->moveTo(event.x,event.y)
            MotionEvent.ACTION_MOVE->moveTo(event.x,event.y)
        }
        invalidate()
        return true
    }
    fun stopFan(){}
    fun startFan(){
        if(x==500){
            x=0
        }else if(x==0){
            x=500
        }
        invalidate()//means redraw on screen and results to a call of the view's on Screen
    }
    fun moveTo( a:Float, b:Float){
        x= a.toInt()
        y= b.toInt()
    }
    init{
        init()
    }
}