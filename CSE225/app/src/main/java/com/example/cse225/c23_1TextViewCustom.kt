package com.example.cse225

import android.content.Context
import android.content.res.TypedArray
import android.graphics.Color
import android.os.Bundle
import android.util.AttributeSet
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.cse225.databinding.ActivityC231TextViewCustomBinding

class c23_1TextViewCustom : AppCompatTextView {
    private var title:String?=null
    private var color=false
    constructor(context:Context):super(context){}
    constructor(context: Context,attrs:AttributeSet):super(context,attrs){
        val tarry:TypedArray=context.obtainStyledAttributes(attrs,R.styleable.TextViewCustom)
        try{
            title=tarry.getString(R.styleable.TextViewCustom_settitle)
            if(title==null)
                setText("Custom Message")
            else
                setText("Hello")
            color=tarry.getBoolean(R.styleable.TextViewCustom_setColor,false)
            if(color)
                setTextColor(Color.MAGENTA)
        }
        finally {
            tarry.recycle()
        }
    }
    constructor(context: Context,attrs: AttributeSet?,defStyleAttr:Int):super(context, attrs, defStyleAttr){}
}
