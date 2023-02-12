package com.example.basic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class ca2BookMyShow2 : AppCompatActivity() {
    lateinit var name: EditText
    lateinit var email: EditText
    lateinit var contact: EditText
    lateinit var spinner:Spinner
    lateinit var male:RadioButton
    lateinit var dob:EditText
    lateinit var female:RadioButton
    lateinit var sign:Button
    lateinit var clear:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ca2_book_my_show2)
        name=findViewById(R.id.name)
        email=findViewById(R.id.email)
        dob=findViewById(R.id.dob)
        contact=findViewById(R.id.contact)
        male=findViewById(R.id.r1)
        female=findViewById(R.id.r2)
        sign=findViewById(R.id.b1)
        clear=findViewById(R.id.b2)
        sign.setOnClickListener {
            var ans: String = "Hi "
            if (name.text.isEmpty() || email.text.isEmpty() || contact.text.isEmpty() || dob.text.isEmpty())
                Toast.makeText(
                    applicationContext,
                    "Please fill all the details",
                    Toast.LENGTH_SHORT
                ).show()
            else {
                ans = ans + name.text
                Toast.makeText(applicationContext, ans, Toast.LENGTH_SHORT).show()
            }
            if (!male.isChecked() && !female.isChecked())
                Toast.makeText(applicationContext, "Please select your gender", Toast.LENGTH_SHORT)
                    .show()
            var i= Intent(this,ca1BookMyShow3::class.java)
            startActivity(i)
        }
        var country = arrayOf(
            "India",
            "USA",
            "England",
            "Australia",
            "China",
            "Scotland",
            "France",
            "Other"
        )
        spinner = findViewById(R.id.s)
        if (spinner != null) {
            var ad = ArrayAdapter(this, android.R.layout.simple_list_item_1, country)
            spinner.setAdapter(ad)
            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    Toast.makeText(
                        applicationContext,
                        "Your country is " + country[position],
                        Toast.LENGTH_SHORT
                    ).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    Toast.makeText(
                        applicationContext,
                        "Please select your payment mode ",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
        clear.setOnClickListener{
            name.text=null
            email.text=null
            contact.text=null
            dob.text=null
            male.setChecked(false)
            female.setChecked(false)
        }
    }
}