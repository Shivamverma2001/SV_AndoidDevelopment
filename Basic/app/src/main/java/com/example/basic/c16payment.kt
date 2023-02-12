package com.example.basic

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.basic.databinding.ActivityC16paymentBinding

class c16payment : AppCompatActivity() {

    lateinit var submit: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c16payment)
        val spinner: Spinner =findViewById(R.id.sp)
        val a= arrayOf("Cash","Paytm","UPI","Credit Card","Debit Card")
        if(spinner!=null) {
            val ad = ArrayAdapter(this, android.R.layout.simple_list_item_1, a)
            spinner.setAdapter(ad)
            spinner.onItemSelectedListener=object : AdapterView.OnItemSelectedListener{
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    Toast.makeText(applicationContext,"Your payment mode is "+a[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    Toast.makeText(applicationContext,"Please select some text", Toast.LENGTH_SHORT).show()
                }
            }
        }
        submit=findViewById(R.id.next)
        submit.setOnClickListener{
        var i= Intent(this,c16thankyou::class.java)
        startActivity(i)

    }
}}