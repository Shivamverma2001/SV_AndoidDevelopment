package com.example.basic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class c12regformcheckradiospinner : AppCompatActivity() {
    lateinit var name: EditText
    lateinit var email:EditText
    lateinit var pass:EditText
    lateinit var dob:EditText
    lateinit var pizza:CheckBox
    lateinit var burger:CheckBox
    lateinit var noodles:CheckBox
    lateinit var momos:CheckBox
    lateinit var spinner:Spinner
    lateinit var submit:Button
    lateinit var reset:Button
    lateinit var radiobutton:RadioButton
    lateinit var r1:RadioButton
    lateinit var r2:RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_c12regformcheckradiospinner)
        name=findViewById(R.id.name)
        email=findViewById(R.id.email)
        pass=findViewById(R.id.password)
        dob=findViewById(R.id.dob)
        pizza=findViewById(R.id.c1)
        burger=findViewById(R.id.c2)
        noodles=findViewById(R.id.c3)
        momos=findViewById(R.id.c4)
        val rg=findViewById<RadioGroup>(R.id.rg1)
        submit=findViewById(R.id.b1)
        reset=findViewById(R.id.b2)
        submit.setOnClickListener{
            var radioid=rg.checkedRadioButtonId
            var ans:String="Hi "
            var price:Double=0.0
            if(name.text.isEmpty()||email.text.isEmpty()||pass.text.isEmpty()||dob.text.isEmpty())
                Toast.makeText(applicationContext,"Please fill all the details",Toast.LENGTH_SHORT).show()
            else {
                ans = ans + name.text
                Toast.makeText(applicationContext,ans,Toast.LENGTH_SHORT).show()
                ans="Your details "+email.text + " " + dob.text
                Toast.makeText(applicationContext,ans,Toast.LENGTH_SHORT).show()
            }
            if(radioid==-1)
                Toast.makeText(applicationContext,"Please select your gender",Toast.LENGTH_SHORT).show()
            else{
                radiobutton=findViewById(radioid)
                ans=radiobutton.text.toString()
                Toast.makeText(applicationContext,"Your Gender is $ans",Toast.LENGTH_SHORT).show()
            }
            if(pizza.isChecked()){
                ans=pizza.text.toString()
                price+=100
            }
            if(burger.isChecked()){
                ans=burger.text.toString()
                price+=50
            }
            if(noodles.isChecked()){
                ans=noodles.text.toString()
                price+=100
            }
            if(momos.isChecked()){
                ans=momos.text.toString()
                price+=60
            }
            if(pizza.isChecked()==false&&noodles.isChecked()==false&&burger.isChecked()==false&&momos.isChecked()==false)
                Toast.makeText(applicationContext,"Please select any item from this list",Toast.LENGTH_SHORT).show()
            else{
                Toast.makeText(applicationContext,"You select $ans and bill is $price",Toast.LENGTH_SHORT).show()
            }
            if((name.text.isEmpty()==false&&email.text.isEmpty()==false&&pass.text.isEmpty()==false&&dob.text.isEmpty()==false)&&(pizza.isChecked()||noodles.isChecked()||burger.isChecked()||momos.isChecked())) {
                Toast.makeText(
                    applicationContext,
                    "Please select your payment mode ",
                    Toast.LENGTH_SHORT
                ).show()
            }
            var paymentmode= arrayOf("Paytm","Credit Card","UPI","Cash")
            spinner=findViewById(R.id.s)
            if(spinner!=null){
                var ad=ArrayAdapter(this,android.R.layout.simple_list_item_1,paymentmode)
                spinner.setAdapter(ad)
                spinner.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
                    override fun onItemSelected(parent: AdapterView<*>?,view: View?,position: Int,id: Long) {
                        Toast.makeText(applicationContext,"Your payment mode is "+paymentmode[position],Toast.LENGTH_SHORT).show()
                        Toast.makeText(applicationContext,"ThankYou for Shopping ",Toast.LENGTH_SHORT).show()
                    }

                    override fun onNothingSelected(parent: AdapterView<*>?) {
                        Toast.makeText(applicationContext,"Please select your payment mode ",Toast.LENGTH_SHORT).show()
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
                pizza.setChecked(false)
                noodles.setChecked(false)
                burger.setChecked(false)
                momos.setChecked(false)
                r1.setChecked(false)
                r2.setChecked(false)
            }

        }
        var next=findViewById<Button>(R.id.next)
        var previous=findViewById<Button>(R.id.previous)
        next.setOnClickListener{
            var i= Intent(this,c13spinner::class.java)
            startActivity(i)
        }
        previous.setOnClickListener{
            var i= Intent(this,c11calc::class.java)
            startActivity(i)
        }
    }
}