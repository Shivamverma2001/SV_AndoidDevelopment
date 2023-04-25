package com.example.cse225

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

// to find shared preference are saved go to
// device file explorer --> data --> data -->
// your package name
class c27_sharedPreferences : AppCompatActivity() {
    lateinit var sharedpreferences:SharedPreferences
    lateinit var name:TextView
    lateinit var email:TextView
    val mypreference="mypref"
    val Name="nameKey"
    val Email="emailKey"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c27_shared_preferences)
        name=findViewById(R.id.name)
        email=findViewById(R.id.email)
        sharedpreferences=getSharedPreferences(mypreference, Context.MODE_PRIVATE)
        name.text=sharedpreferences.getString(Name,"")
        email.text=sharedpreferences.getString(Email,"")
    }
    fun save(view: View?){
        val n=name.text.toString()
        val e=email.text.toString()
        val editor=sharedpreferences.edit()
        editor.putString(Name,n)
        editor.putString(Email,e)
        editor.apply()
    }
    fun clear(view: View?){
        name.text=""
        email.text=""
    }
    fun retrive(view: View?){
        sharedpreferences=getSharedPreferences(mypreference,Context.MODE_PRIVATE)
        name.text=sharedpreferences.getString(Name,"")
        email.text=sharedpreferences.getString(Email,"")
    }
}