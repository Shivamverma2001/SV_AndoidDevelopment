package com.example.cse225

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Color
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.content.res.ResourcesCompat

class c23_2EditTextCustom(context: Context,attrs:AttributeSet?) : AppCompatEditText(context, attrs) {
    private var sethint:String?=null
    private var setcolor=false
    var darkButton:Drawable?=null
    var lightButton:Drawable?=null
    fun init(){
        darkButton=ResourcesCompat.getDrawable(resources,R.drawable.ic_clear_black_24dp,null)
        lightButton=ResourcesCompat.getDrawable(resources,R.drawable.ic_clear_black_22dp,null)
        addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                showButton()
                show()
            }

            override fun afterTextChanged(s: Editable?) {}
        })
    }
    fun show(){
        setOnTouchListener{view,motionEvent->
            var isclicked:Boolean=false
            val clearButtonStart=(width-paddingStart-darkButton!!.intrinsicWidth).toFloat()
            if(motionEvent.x>clearButtonStart){
                isclicked=true
            }
            if(isclicked){
                when(motionEvent.action){
                    MotionEvent.ACTION_DOWN->text!!.clear()
                    MotionEvent.ACTION_UP->hideButton()
                }
            }
            true
        }
    }
    fun showButton(){
        setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,darkButton,null)
    }
    fun hideButton(){
        setCompoundDrawablesRelativeWithIntrinsicBounds(null,null,lightButton,null)
    }
    init{
        val tarry1:TypedArray=context.obtainStyledAttributes(attrs,R.styleable.EditTextcustom)
        try{
            sethint=tarry1.getString(R.styleable.EditTextcustom_setHint)
            if(sethint==null)
                setHint("Enter your meddage")
            else
                setHint("Enter your message here")
            setcolor=tarry1.getBoolean(R.styleable.EditTextcustom_setColor1,false)
            if(setcolor)
                setTextColor(Color.RED)
        }
        finally {
            tarry1.recycle()
            init()
        }
    }
}