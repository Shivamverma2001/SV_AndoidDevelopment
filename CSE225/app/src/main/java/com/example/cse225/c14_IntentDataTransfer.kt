package com.example.cse225

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup

class c14_IntentDataTransfer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c14_intent_data_transfer)
        var b1 = findViewById<Button>(R.id.button)
        var rg1 = findViewById<RadioGroup>(R.id.radioGroup)
        var rb = arrayOfNulls<RadioButton>(4)
        var et1 = findViewById<EditText>(R.id.editText2)
        var et2= findViewById<EditText>(R.id.editText3)

        rb[0] = findViewById(R.id.radioButton)
        rb[1] = findViewById(R.id.radioButton2)
        rb[2] = findViewById(R.id.radioButton3)
        rb[3] = findViewById(R.id.radioButton4)
        b1.setOnClickListener{

            val i = Intent(this, c14_b::class.java)
            var b = Bundle()
            var x: Int = et1.getText().toString().toInt()
            var y: Int = et2.getText().toString().toInt()
            if (rg1.getCheckedRadioButtonId() == R.id.radioButton) {
                b.putString("operation", "+")
            } else if (rg1.getCheckedRadioButtonId() == R.id.radioButton2) {
                b.putString("operation", "-")
            } else if (rg1.getCheckedRadioButtonId() == R.id.radioButton3) {
                b.putString("operation", "*")
            } else if (rg1.getCheckedRadioButtonId() == R.id.radioButton4) {
                b.putString("operation", "/")
            }
//Toast.makeText(MainActivity.this," hh"+b.getString("operation"),Toast.LENGTH_LONG).show();
            b.putInt("second", y)
            b.putInt("First", x)
            i.putExtra("info", b)
            startActivity(i)
        }
    }
}