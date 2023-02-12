package com.example.bookmyshow

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.bookmyshow.databinding.ActivityPage3Binding

class Page3 : AppCompatActivity() {
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
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page3)
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
        Toast.makeText(applicationContext,"Please select your location", Toast.LENGTH_SHORT).show()
        i1.setOnClickListener{
            Toast.makeText(applicationContext,"Your city is Mumbai", Toast.LENGTH_SHORT).show()
            var i= Intent(this,Page4::class.java)
            startActivity(i)
        }
        i2.setOnClickListener{
            Toast.makeText(applicationContext,"Your city is Delhi-NCR", Toast.LENGTH_SHORT).show()
            var i= Intent(this,Page4::class.java)
            startActivity(i)
        }
        i3.setOnClickListener{
            Toast.makeText(applicationContext,"Your city is Bengaluru", Toast.LENGTH_SHORT).show()
        }
        i4.setOnClickListener{
            Toast.makeText(applicationContext,"Your city is Chandigarh", Toast.LENGTH_SHORT).show()
            var i= Intent(this,Page4::class.java)
            startActivity(i)
        }
        i5.setOnClickListener{
            Toast.makeText(applicationContext,"Your city is Ahmedabad", Toast.LENGTH_SHORT).show()
            var i= Intent(this,Page4::class.java)
            startActivity(i)
        }
        i6.setOnClickListener{
            Toast.makeText(applicationContext,"Your city is Pune", Toast.LENGTH_SHORT).show()
            var i= Intent(this,Page4::class.java)
            startActivity(i)
        }
        i7.setOnClickListener{
            Toast.makeText(applicationContext,"Your city is Kolkata", Toast.LENGTH_SHORT).show()
            var i= Intent(this,Page4::class.java)
            startActivity(i)
        }
        i8.setOnClickListener{
            Toast.makeText(applicationContext,"Your city is Kochi", Toast.LENGTH_SHORT).show()
            var i= Intent(this,Page4::class.java)
            startActivity(i)
        }
        i9.setOnClickListener{
            Toast.makeText(applicationContext,"Your city is Chandigarh", Toast.LENGTH_SHORT).show()
            var i= Intent(this,Page4::class.java)
            startActivity(i)
        }
        i10.setOnClickListener{
            Toast.makeText(applicationContext,"Your city is Pune", Toast.LENGTH_SHORT).show()
            var i= Intent(this,Page4::class.java)
            startActivity(i)
        }
        i11.setOnClickListener{
            Toast.makeText(applicationContext,"Your city is Lucknow", Toast.LENGTH_SHORT).show()
            var i= Intent(this,Page4::class.java)
            startActivity(i)
        }
        i12.setOnClickListener{
            Toast.makeText(applicationContext,"Your city is Meghalya", Toast.LENGTH_SHORT).show()
            var i= Intent(this,Page4::class.java)
            startActivity(i)
        }

    }
}