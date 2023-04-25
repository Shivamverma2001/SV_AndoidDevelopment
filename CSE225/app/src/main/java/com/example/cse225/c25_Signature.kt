package com.example.cse225

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.graphics.Path
import android.view.MotionEvent

class c25_Signature : View {
    lateinit var  p: Paint
    //lateinit var cv:Canvas
    lateinit var  mpath: Path
    constructor(context:Context?):super(context){
        init()
    }
    constructor(context: Context?,attributeSet: AttributeSet?):super(context,attributeSet){
        init()
    }
    fun init(){
        p=Paint()
        mpath=Path()
        p.color= Color.BLACK
        p.style=Paint.Style.STROKE
        p.strokeWidth=10f
    }

    override fun onDraw(canvas: Canvas) {
        canvas.drawColor(Color.MAGENTA)
        canvas.drawPath(mpath,p)
    }
    fun clear(){
        mpath.reset()
        postInvalidate()
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        when(event.action){
            MotionEvent.ACTION_DOWN->mpath.moveTo(event.x,event.y)
            MotionEvent.ACTION_MOVE->mpath.lineTo(event.x,event.y)
        }
        invalidate()
        return true
    }

}