package com.example.basic

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class c2BookMyShow5 : AppCompatActivity() {
    lateinit var spinner: Spinner
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c2_book_my_show5)
        var paymentmode= arrayOf("Paytm","Credit Card","UPI","Cash")
        spinner=findViewById(R.id.s)
        if(spinner!=null){
            var ad= ArrayAdapter(this,android.R.layout.simple_list_item_1,paymentmode)
            spinner.setAdapter(ad)
            spinner.onItemSelectedListener=object : AdapterView.OnItemSelectedListener{
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    Toast.makeText(applicationContext,"Your payment mode is "+paymentmode[position],
                        Toast.LENGTH_SHORT).show()
                    Toast.makeText(applicationContext,"ThankYou for Shopping ", Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    Toast.makeText(applicationContext,"Please select your payment mode ", Toast.LENGTH_SHORT).show()
                }
            }
        }
        var tv = findViewById<TextView>(R.id.textView4)
        val i = intent
        val b = i.getBundleExtra("info")
        val x = b?.getInt("First")
        Toast.makeText(this, "" + x, Toast.LENGTH_LONG).show()
        tv.text=x.toString()
        Toast.makeText(applicationContext,"Thank-You ", Toast.LENGTH_SHORT).show()
    }
}