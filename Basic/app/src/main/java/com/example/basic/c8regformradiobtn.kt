package com.example.basic

import android.content.Intent
import android.os.Bundle
import android.widget.*
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.basic.databinding.ActivityC8regformradiobtnBinding

class c8regformradiobtn : AppCompatActivity() {
    lateinit var radioButton: RadioButton
    lateinit var name: EditText
    lateinit var email: EditText
    lateinit var contact: EditText
    lateinit var submit: Button
    lateinit var reset: Button
    lateinit var ans: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c8regformradiobtn)
        name = findViewById(R.id.e1)
        email = findViewById(R.id.e2)
        contact = findViewById(R.id.e3)
        submit = findViewById(R.id.b1)
        reset = findViewById(R.id.b2)
        ans = findViewById(R.id.t1)
        val rg = findViewById<RadioGroup>(R.id.rg1)
        submit.setOnClickListener {
            val selectId: Int = rg.checkedRadioButtonId
            if (selectId != -1) {
                radioButton = findViewById(selectId)
                if (name.text.isEmpty())
                    Toast.makeText(applicationContext, "Please fill the name", Toast.LENGTH_SHORT)
                        .show()
                if (email.text.isEmpty())
                    Toast.makeText(applicationContext, "Please fill the email", Toast.LENGTH_SHORT)
                        .show()
                if (contact.text.isEmpty())
                    Toast.makeText(
                        applicationContext,
                        "Please fill the contact",
                        Toast.LENGTH_SHORT
                    )
                        .show()

                if (name.text.isEmpty() && email.text.isEmpty() && contact.text.isEmpty()) {
                    Toast.makeText(applicationContext, "Please do it carefully", Toast.LENGTH_SHORT)
                        .show()
                    ans.text = "Please fill all parameters"
                } else {
                    ans.text =
                        "${name.text}, ${email.text}, ${contact.text}, ${radioButton.text.toString()}"
                }
            } else {
                if (name.text.isEmpty())
                    Toast.makeText(applicationContext, "Please fill the name", Toast.LENGTH_SHORT)
                        .show()
                if (email.text.isEmpty())
                    Toast.makeText(applicationContext, "Please fill the email", Toast.LENGTH_SHORT)
                        .show()
                if (contact.text.isEmpty()) {
                    Toast.makeText(
                        applicationContext,
                        "Please fill the contact",
                        Toast.LENGTH_SHORT
                    )
                        .show()
                }
                Toast.makeText(
                    applicationContext,
                    "Please select the radio button",
                    Toast.LENGTH_SHORT
                )
                    .show()
            }
        }
        reset.setOnClickListener {
            Toast.makeText(applicationContext, "You reset the form", Toast.LENGTH_SHORT).show()
            name.text = null
            email.text = null
            contact.text = null
            ans.text = ""
            val selectId: Int = rg.checkedRadioButtonId
            radioButton = findViewById(selectId)
            radioButton.setChecked(false)
        }
        var next=findViewById<Button>(R.id.next)
        var previous=findViewById<Button>(R.id.previous)
        next.setOnClickListener{
            var i= Intent(this,c9checkBox::class.java)
            startActivity(i)
        }
        previous.setOnClickListener{
            var i= Intent(this,c7ImageButton::class.java)
            startActivity(i)
        }
    }
}