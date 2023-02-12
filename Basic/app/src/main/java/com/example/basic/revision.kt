package com.example.basic

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CallLog
import android.provider.ContactsContract
import android.provider.MediaStore
import android.provider.MediaStore.Audio.Radio
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.PopupMenu
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.basic.R.*
import com.google.android.material.snackbar.Snackbar

class revision : AppCompatActivity() {
    lateinit var e1:EditText
    lateinit var e2:EditText
    lateinit var e3:EditText
    lateinit var r:RadioButton
    lateinit var tshirt:CheckBox
    lateinit var shirt:CheckBox
    lateinit var jeans:CheckBox
    lateinit var ll:LinearLayout
    lateinit var lv:ListView
    lateinit var submit:Button
    lateinit var reset:Button
    lateinit var nav:Button
    lateinit var img:Button
    lateinit var contact:Button
    lateinit var dial:Button
    lateinit var cam:Button
    lateinit var popup:Button
    lateinit var call:Button
    lateinit var spinner:Spinner
    lateinit var dynamic:Button
    lateinit var alert:Button
    lateinit var snack:Button
    lateinit var app:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_revision)
       var rg=findViewById<RadioGroup>(R.id.rg)
        e1=findViewById(R.id.e1)
        e2=findViewById(R.id.e2)
        e3=findViewById(R.id.e3)
        tshirt=findViewById(R.id.cb1)
        shirt=findViewById(R.id.cb2)
        jeans=findViewById(R.id.cb3)
        ll=findViewById(R.id.ll)
        lv=findViewById(R.id.lv)
        submit=findViewById(R.id.b1)
        reset=findViewById(R.id.b2)
        nav=findViewById(R.id.nav)
        img=findViewById(R.id.img)
        call=findViewById(R.id.call)
        contact=findViewById(R.id.contact)
        dial=findViewById(R.id.dial)
        cam=findViewById(R.id.cam)
        popup=findViewById(R.id.popup)
        dynamic=findViewById(R.id.dv)
        alert=findViewById(R.id.alert)
        snack=findViewById(R.id.snack)
        app=findViewById(R.id.appchooser)
        var a= arrayOf(Color.RED,Color.YELLOW,Color.GREEN)
        var b=arrayOf("Red","Yellow","Green")
        var ab=ArrayAdapter(this,android.R.layout.simple_list_item_1,b)
        lv.setAdapter(ab)
        lv.setOnItemClickListener{AdapterView,view,position,id->ll.setBackgroundColor(a[position])}
        submit.setOnClickListener {
            if(e1.text.isEmpty()||e2.text.isEmpty())
                Toast.makeText(applicationContext,"Plz fill all details",Toast.LENGTH_SHORT).show()
            else {
                var selectId = rg.checkedRadioButtonId
                r = findViewById(selectId)
                val gender = r.text.toString()
                Toast.makeText(
                    applicationContext,
                    "Hi $e1 your age is $e2 geder $gender",
                    Toast.LENGTH_SHORT
                ).show()
                var p = 0
                if (tshirt.isChecked)
                    p += 1000
                if (shirt.isChecked)
                    p += 700
                if (jeans.isChecked)
                    p += 1200
                var b=Bundle()
                var i=Intent(this,revision2::class.java)
                b.putInt("first",p)
                i.putExtra("info",b)
                startActivity(i)
            }
        }
        reset.setOnClickListener {
            e1.text=null
            e2.text=null
            tshirt.setChecked(false)
            shirt.setChecked(false)
            jeans.setChecked(false)
            rg.clearCheck()
        }
        dynamic.setOnClickListener {
            var b2=Button(this)
            b2.text="new button"
            b2.layoutParams=LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT)
            ll.addView(b2)
        }
        var c= arrayOf("haryana","delhi","Punjab")
        if(spinner!=null){
            var ab=ArrayAdapter(this,android.R.layout.simple_list_item_1,c)
            spinner.setAdapter(ab)
            spinner.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    Toast.makeText(applicationContext,"You select"+c[position],Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    Toast.makeText(applicationContext,"Plz fill all details",Toast.LENGTH_SHORT).show()
                }
            }
        }
        nav.setOnClickListener {
            var url=e1.text.toString()
            var i=Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(i)
        }
        img.setOnClickListener {
            var i=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(i)
        }
        contact.setOnClickListener {
            var i=Intent(Intent.ACTION_PICK,ContactsContract.Contacts.CONTENT_URI)
            startActivity(i)
        }
        dial.setOnClickListener {
            var i=Intent(Intent.ACTION_DIAL)
            i.setData(Uri.parse("7895020951"))
            startActivity(i)
        }
        cam.setOnClickListener {
            var i=Intent()
            i.action=Intent.ACTION_VIEW
            i.type="image/@"
            startActivity(i)
        }
        call.setOnClickListener {
            var i=Intent(Intent.ACTION_VIEW)
            i.setType(CallLog.Calls.CONTENT_TYPE)
            startActivity(i)
        }
        var pop=PopupMenu(this,popup)
        pop.menuInflater.inflate(R.menu.popupmenu,pop.menu)
        pop.setOnMenuItemClickListener {
            Toast.makeText(applicationContext, "You click " + it.title, Toast.LENGTH_SHORT)
                .show()
            true
        }
        alert.setOnClickListener {
            var builder=AlertDialog.Builder(this)
            builder.setTitle("alert boc")
                .setMessage("are u sure to continue")
                .setCancelable(true)
                .setIcon(android.R.drawable.ic_dialog_alert)
            builder.setPositiveButton("Yes"){dialogInterface,which->
                Toast.makeText(applicationContext, "true", Toast.LENGTH_SHORT).show()
            }
            builder.setNegativeButton("Yes"){dialogInterface,which->
                Toast.makeText(applicationContext, "false", Toast.LENGTH_SHORT).show()
            }
        }
        snack.setOnClickListener {
            var s=Snackbar.make(ll,"u want to continue",Snackbar.LENGTH_LONG)
                .setAction("Undo"){
                    var s=Snackbar.make(ll,"continue",Snackbar.LENGTH_LONG)
                    s.show()
                }
            s.show()
        }
        app.setOnClickListener {
            var url="https://www.google.com"
            var i =Intent(Intent.ACTION_VIEW, )
            i.setDataAndType(Uri.parse(url),"text/plain")
            var choose=Intent.createChooser(intent,"Share Url")
            startActivity(choose)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.optionmenu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var id=item.itemId
        return when(id){
            R.id.Settings->{
                Toast.makeText(applicationContext, "setting", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.Play->{
                Toast.makeText(applicationContext, "play", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.Pause->{
                Toast.makeText(applicationContext, "pause", Toast.LENGTH_SHORT).show()
                true
            }
            else->return super.onOptionsItemSelected(item)
        }

    }


}