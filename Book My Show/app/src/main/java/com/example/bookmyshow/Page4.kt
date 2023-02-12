package com.example.bookmyshow

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.*
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.bookmyshow.databinding.ActivityPage4Binding

class Page4 : AppCompatActivity() {
    lateinit var i1: ImageButton
    lateinit var i2: ImageButton
    lateinit var i3: ImageButton
    lateinit var i4: ImageButton
    lateinit var i5: ImageButton
    lateinit var i6: ImageButton
    lateinit var i7: ImageButton
    lateinit var i8: ImageButton
    lateinit var i9: ImageButton
    lateinit var i10: ImageButton
    lateinit var i11: ImageButton
    lateinit var i12: ImageButton
    lateinit var i13: ImageButton
    lateinit var i14: ImageButton
    lateinit var i15: ImageButton
    lateinit var i16: ImageButton
    lateinit var e1: EditText
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c12_book_my_show4)
        val lv=findViewById<ListView>(R.id.lv1)
        val ll=findViewById<LinearLayout>(R.id.ll)
        val a= arrayOf(Color.RED, Color.BLUE, Color.YELLOW, Color.WHITE)
        val b= arrayOf("RED","BLUE","YELLOW","WHITE")
        val ab= ArrayAdapter(this,android.R.layout.simple_list_item_1,b)
        lv.setAdapter(ab)
        lv.setOnItemClickListener{adapterView,view,position,id->ll.setBackgroundColor(a[position])}
        i1=findViewById(R.id.i1)
        i2=findViewById(R.id.i2)
        i3=findViewById(R.id.i3)
        i4=findViewById(R.id.i4)
        i5=findViewById(R.id.i5)
        i6=findViewById(R.id.i6)
        i7=findViewById(R.id.i7)
        i8=findViewById(R.id.i8)
        i9=findViewById(R.id.i9)
        i10=findViewById(R.id.i10)
        i11=findViewById(R.id.i11)
        i12=findViewById(R.id.i12)
        i13=findViewById(R.id.i13)
        i14=findViewById(R.id.i14)
        i15=findViewById(R.id.i15)
        i16=findViewById(R.id.i16)
        e1=findViewById(R.id.e1)
        var seat:Int=0

        var price:Int=0
        i1.setOnClickListener{
            if(e1.text.isEmpty()){
                Toast.makeText(applicationContext,"Please type number of seats", Toast.LENGTH_SHORT).show()
            }
            else{
                seat=e1.text.toString().toInt()
            }
            var b=Bundle()
            var i= Intent(this,c2BookMyShow5::class.java)
            price=100*seat
            b.putInt("First",price)
            i.putExtra("info",b)
            startActivity(i)
        }
        i2.setOnClickListener{
            if(e1.text.isEmpty()){
                Toast.makeText(applicationContext,"Please type number of seats", Toast.LENGTH_SHORT).show()
            }
            else{
                seat=e1.text.toString().toInt()
            }
            var b = Bundle()
            var i= Intent(this,c2BookMyShow5::class.java)
            price=120*seat
            b.putInt("First", price)
            i.putExtra("info", b)
            startActivity(i)
        }
        i3.setOnClickListener{
            if(e1.text.isEmpty()){
                Toast.makeText(applicationContext,"Please type number of seats", Toast.LENGTH_SHORT).show()
            }
            else{
                seat=e1.text.toString().toInt()
            }
            var b = Bundle()
            var i= Intent(this,c2BookMyShow5::class.java)
            price=110*seat
            b.putInt("First", price)
            i.putExtra("info", b)
            startActivity(i)
        }
        i4.setOnClickListener{
            if(e1.text.isEmpty()){
                Toast.makeText(applicationContext,"Please type number of seats", Toast.LENGTH_SHORT).show()
            }
            else{
                seat=e1.text.toString().toInt()
            }
            var b = Bundle()
            var i= Intent(this,c2BookMyShow5::class.java)
            price=140*seat
            b.putInt("First", price)
            i.putExtra("info", b)
            startActivity(i)
        }
        i5.setOnClickListener{
            if(e1.text.isEmpty()){
                Toast.makeText(applicationContext,"Please type number of seats", Toast.LENGTH_SHORT).show()
            }
            else{
                seat=e1.text.toString().toInt()
            }
            var b = Bundle()
            var i= Intent(this,c2BookMyShow5::class.java)
            price=200*seat
            b.putInt("First", price)
            i.putExtra("info", b)
            startActivity(i)
        }
        i6.setOnClickListener{
            if(e1.text.isEmpty()){
                Toast.makeText(applicationContext,"Please type number of seats", Toast.LENGTH_SHORT).show()
            }
            else{
                seat=e1.text.toString().toInt()
            }
            var b = Bundle()
            var i= Intent(this,c2BookMyShow5::class.java)
            price=150*seat
            b.putInt("First", price)
            i.putExtra("info", b)
            startActivity(i)
        }
        i7.setOnClickListener{
            if(e1.text.isEmpty()){
                Toast.makeText(applicationContext,"Please type number of seats", Toast.LENGTH_SHORT).show()
            }
            else{
                seat=e1.text.toString().toInt()
            }
            var b = Bundle()
            var i= Intent(this,c2BookMyShow5::class.java)
            price=160*seat
            b.putInt("First", price)
            i.putExtra("info", b)
            startActivity(i)
        }
        i8.setOnClickListener{
            if(e1.text.isEmpty()){
                Toast.makeText(applicationContext,"Please type number of seats", Toast.LENGTH_SHORT).show()
            }
            else{
                seat=e1.text.toString().toInt()
            }
            var b = Bundle()
            var i= Intent(this,c2BookMyShow5::class.java)
            price=190*seat
            b.putInt("First", price)
            i.putExtra("info", b)
            startActivity(i)
        }
        i9.setOnClickListener{
            if(e1.text.isEmpty()){
                Toast.makeText(applicationContext,"Please type number of seats", Toast.LENGTH_SHORT).show()
            }
            else{
                seat=e1.text.toString().toInt()
            }
            var b = Bundle()
            var i= Intent(this,c2BookMyShow5::class.java)
            price=180*seat
            b.putInt("First", price)
            i.putExtra("info", b)
            startActivity(i)
        }
        i10.setOnClickListener{
            if(e1.text.isEmpty()){
                Toast.makeText(applicationContext,"Please type number of seats", Toast.LENGTH_SHORT).show()
            }
            else{
                seat=e1.text.toString().toInt()
            }
            var b = Bundle()
            var i= Intent(this,c2BookMyShow5::class.java)
            price=190*seat
            b.putInt("First", price)
            i.putExtra("info", b)
            startActivity(i)
        }
        i11.setOnClickListener{
            if(e1.text.isEmpty()){
                Toast.makeText(applicationContext,"Please type number of seats", Toast.LENGTH_SHORT).show()
            }
            else{
                seat=e1.text.toString().toInt()
            }
            var b = Bundle()
            var i= Intent(this,c2BookMyShow5::class.java)
            price=100*seat
            b.putInt("First", price)
            i.putExtra("info", b)
            startActivity(i)
        }
        i12.setOnClickListener{
            if(e1.text.isEmpty()){
                Toast.makeText(applicationContext,"Please type number of seats", Toast.LENGTH_SHORT).show()
            }
            else{
                seat=e1.text.toString().toInt()
            }
            var b = Bundle()
            var i= Intent(this,c2BookMyShow5::class.java)
            price=170*seat
            b.putInt("First", price)
            i.putExtra("info", b)
            startActivity(i)
        }
        i13.setOnClickListener{
            if(e1.text.isEmpty()){
                Toast.makeText(applicationContext,"Please type number of seats", Toast.LENGTH_SHORT).show()
            }
            else{
                seat=e1.text.toString().toInt()
            }
            var b = Bundle()
            var i= Intent(this,c2BookMyShow5::class.java)
            price=190*seat
            b.putInt("First", price)
            i.putExtra("info", b)
            startActivity(i)
        }
        i14.setOnClickListener{
            if(e1.text.isEmpty()){
                Toast.makeText(applicationContext,"Please type number of seats", Toast.LENGTH_SHORT).show()
            }
            else{
                seat=e1.text.toString().toInt()
            }
            var i= Intent(this,c2BookMyShow5::class.java)
            var b = Bundle()
            price=200*seat
            b.putInt("First", price)
            i.putExtra("info", b)
            startActivity(i)
        }
        i15.setOnClickListener{
            if(e1.text.isEmpty()){
                Toast.makeText(applicationContext,"Please type number of seats", Toast.LENGTH_SHORT).show()
            }
            else{
                seat=e1.text.toString().toInt()
            }
            var b = Bundle()
            var i= Intent(this,c2BookMyShow5::class.java)
            price=190*seat
            b.putInt("First", price)
            i.putExtra("info", b)
            startActivity(i)
        }
        i16.setOnClickListener{
            if(e1.text.isEmpty()){
                Toast.makeText(applicationContext,"Please type number of seats", Toast.LENGTH_SHORT).show()
            }
            else{
                seat=e1.text.toString().toInt()
            }
            var b = Bundle()
            var i= Intent(this,c2BookMyShow5::class.java)
            price=150*seat
            b.putInt("First", price)
            i.putExtra("info", b)
            startActivity(i)
        }
    }
}