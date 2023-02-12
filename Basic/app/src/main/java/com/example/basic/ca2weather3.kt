package com.example.basic

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
import com.example.basic.databinding.ActivityCa2weather3Binding

class ca2weather3 : AppCompatActivity() {
    lateinit var name: EditText
    lateinit var email: EditText
    lateinit var pass: EditText
    lateinit var dob: EditText
    lateinit var spinner: Spinner
    lateinit var submit: Button
    lateinit var reset: Button
    lateinit var radiobutton: RadioButton
    lateinit var r1: RadioButton
    lateinit var r2: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_ca2weather3)
        name=findViewById(R.id.name)
        email=findViewById(R.id.email)
        pass=findViewById(R.id.password)
        dob=findViewById(R.id.dob)
        val rg=findViewById<RadioGroup>(R.id.rg1)
        submit=findViewById(R.id.b1)
        reset=findViewById(R.id.b2)
        submit.setOnClickListener{
            var radioid=rg.checkedRadioButtonId
            var ans:String="Hi "
            var price:Double=0.0
            if(name.text.isEmpty()||email.text.isEmpty()||pass.text.isEmpty()||dob.text.isEmpty())
                Toast.makeText(applicationContext,"Please fill all the details", Toast.LENGTH_SHORT).show()
            else {
                ans = ans + name.text
                Toast.makeText(applicationContext,ans, Toast.LENGTH_SHORT).show()
                ans="Your details "+email.text + " " + dob.text
                Toast.makeText(applicationContext,ans, Toast.LENGTH_SHORT).show()
            }
            if(radioid==-1)
                Toast.makeText(applicationContext,"Please select your gender", Toast.LENGTH_SHORT).show()
            else{
                radiobutton=findViewById(radioid)
                ans=radiobutton.text.toString()
                Toast.makeText(applicationContext,"Your Gender is $ans", Toast.LENGTH_SHORT).show()
            }

            if(name.text.isEmpty()==false&&email.text.isEmpty()==false&&pass.text.isEmpty()==false&&dob.text.isEmpty()==false) {
                Toast.makeText(
                    applicationContext,
                    "Please select your country ",
                    Toast.LENGTH_SHORT
                ).show()
            }

            var i=Intent(this,ca2Weather1::class.java)
            startActivity(i)
        }
        var con= arrayOf("India","Iran","America","South Africa")
        spinner=findViewById(R.id.s)
        if(spinner!=null){
            var ad= ArrayAdapter(this,android.R.layout.simple_list_item_1,con)
            spinner.setAdapter(ad)
            spinner.onItemSelectedListener=object : AdapterView.OnItemSelectedListener{
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    Toast.makeText(applicationContext,"Your country is "+con[position],
                        Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    Toast.makeText(applicationContext,"Please select your country ", Toast.LENGTH_SHORT).show()
                }
            }
        }
        reset.setOnClickListener{
            r1=findViewById(R.id.r1)
            r2=findViewById(R.id.r2)
            name.text=null
            email.text=null
            pass.text=null
            dob.text=null
            r1.setChecked(false)
            r2.setChecked(false)
        }
    }
}