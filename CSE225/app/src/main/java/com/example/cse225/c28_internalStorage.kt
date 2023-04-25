package com.example.cse225

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class c28_internalStorage : AppCompatActivity() {
    lateinit var b1: Button
    lateinit var b2: Button
    lateinit var tv: TextView
    lateinit var ed1: EditText
    lateinit var data: String
    private val file = "mydata.txt"
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c28_internal_storage)
        b1 = findViewById(R.id.button)
        b2 = findViewById(R.id.button2)
        ed1 = findViewById(R.id.editText)
        tv = findViewById(R.id.textView2)
        b1.setOnClickListener {
            data = ed1.text.toString()
            try {
                //MODE_PRIVATE for override
                val fOut = openFileOutput(file, MODE_APPEND)
                fOut.write(data.toByteArray())
                fOut.close()
                Toast.makeText(baseContext, "file saved", Toast.LENGTH_SHORT).show()
            } catch (e: Exception) {
                // TODO Auto-generated catch block
                e.printStackTrace()
            }
        }
        b2.setOnClickListener {
            try {
                val fin = openFileInput(file)
                var c: Int
                var temp = ""
                while (fin.read().also { c = it } != -1) {
                    temp = temp + Character.toString(c.toChar())
                }
                tv.text = temp
                Toast.makeText(baseContext, "file read", Toast.LENGTH_SHORT).show()
            } catch (e: Exception) {
            }
        }
    }

}