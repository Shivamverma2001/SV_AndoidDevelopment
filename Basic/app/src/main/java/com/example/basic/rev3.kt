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
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import java.net.URLClassLoader

class rev3 : AppCompatActivity() {
    lateinit var ll: LinearLayout
    lateinit var e1: EditText
    lateinit var e2: EditText
    lateinit var e3: EditText
    lateinit var radio: RadioButton
    lateinit var tshirt: CheckBox
    lateinit var shirt: CheckBox
    lateinit var jeans: CheckBox
    lateinit var lv: ListView
    lateinit var spinner: Spinner
    lateinit var submit: Button
    lateinit var reset: Button
    lateinit var dynamic: Button
    lateinit var nav: Button
    lateinit var img: Button
    lateinit var contact: Button
    lateinit var dial: Button
    lateinit var cam: Button
    lateinit var call: Button
    lateinit var popup: Button
    lateinit var alert: Button
    lateinit var snackbar: Button
    lateinit var appchooser: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rev3)
        ll = findViewById(R.id.ll)
        e1 = findViewById(R.id.e1)
        e2 = findViewById(R.id.e2)
        e3 = findViewById(R.id.e3)
        var rg = findViewById<RadioGroup>(R.id.rg)
        tshirt = findViewById(R.id.cb1)
        shirt = findViewById(R.id.cb2)
        jeans = findViewById(R.id.cb3)
        lv = findViewById(R.id.lv)
        spinner = findViewById(R.id.spinner)
        submit = findViewById(R.id.b1)
        reset = findViewById(R.id.b2)
        dynamic = findViewById(R.id.dv)
        nav = findViewById(R.id.nav)
        img = findViewById(R.id.img)
        contact = findViewById(R.id.contact)
        dial = findViewById(R.id.dial)
        cam = findViewById(R.id.cam)
        call = findViewById(R.id.call)
        popup = findViewById(R.id.popup)
        alert = findViewById(R.id.alert)
        snackbar = findViewById(R.id.snack)
        appchooser = findViewById(R.id.appchooser)
        var a = arrayOf(Color.RED, Color.GREEN, Color.YELLOW)
        var b = arrayOf("RED", "GREEN", "YELLOW")
        var ab = ArrayAdapter(this, android.R.layout.simple_list_item_1, b)
        lv.setAdapter(ab)
        lv.setOnItemClickListener { AdapterView, view, position, id -> ll.setBackgroundColor(a[position]) }
        submit.setOnClickListener {
            if (e1.text.isEmpty() && e2.text.isEmpty())
                Toast.makeText(applicationContext, "Plz fill all the details", Toast.LENGTH_SHORT)
                    .show()
            else {
                Toast.makeText(applicationContext, "$e1 $e2", Toast.LENGTH_SHORT).show()
                var selectId = rg.checkedRadioButtonId
                radio = findViewById(selectId)
                var ans = radio.text.toString()
                Toast.makeText(applicationContext, "$ans", Toast.LENGTH_SHORT).show()
                var p = 0
                if (tshirt.isChecked)
                    p += 800
                if (shirt.isChecked)
                    p += 700
                if (jeans.isChecked)
                    p += 1000
                var b = Bundle()
                var i = Intent(this, revision2::class.java)
                b.putInt("first", p)
                i.putExtra("info", b)
                startActivity(i)
            }
            reset.setOnClickListener {
                e1.text = null
                e2.text = null
                rg.clearCheck()
                tshirt.setChecked(false)
                shirt.setChecked(false)
                jeans.setChecked(false)
            }
            nav.setOnClickListener {
                var url = e1.text.toString()
                var i = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                startActivity(i)
            }
            img.setOnClickListener {
                var i = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivity(i)
            }
            contact.setOnClickListener {
                var i = Intent(Intent.ACTION_PICK, ContactsContract.Contacts.CONTENT_URI)
                startActivity(i)
            }
            dial.setOnClickListener {
                var i = Intent(Intent.ACTION_DIAL)
                i.setData(Uri.parse("7895020951"))
                startActivity(i)
            }
            cam.setOnClickListener {
                var i = Intent()
                i.action = Intent.ACTION_VIEW
                i.type = "images/@"
                startActivity(i)
            }
            call.setOnClickListener {
                var i = Intent(Intent.ACTION_PICK)
                i.setType(CallLog.Calls.CONTENT_TYPE)
                startActivity(i)
            }
            var pop = PopupMenu(this, popup)
            pop.menuInflater.inflate(R.menu.popupmenu, pop.menu)
            pop.setOnMenuItemClickListener {
                Toast.makeText(applicationContext, "You click " + it.title, Toast.LENGTH_SHORT)
                    .show()
                true
            }
            var c = arrayOf("Haryana", "Delhi", "Punjab")
            if (spinner != null) {
                var ad = ArrayAdapter(this, android.R.layout.simple_list_item_1, c)
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
                            "You click " + c[position],
                            Toast.LENGTH_SHORT
                        ).show()
                    }

                    override fun onNothingSelected(parent: AdapterView<*>?) {
                        Toast.makeText(applicationContext, "Plz select", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            dynamic.setOnClickListener {
                var b2 = Button(this)
                b2.text = "New button"
                b2.layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )
                var pf = TextView(this)
                pf.text = "New text view"
                pf.layoutParams = LinearLayout.LayoutParams(
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.WRAP_CONTENT
                )
                b2.setOnClickListener {
                    Toast.makeText(applicationContext, "New button", Toast.LENGTH_SHORT).show()
                }
                ll.addView(b2)
                ll.addView(pf)
            }
            alert.setOnClickListener {
                var builder = AlertDialog.Builder(this)
                builder.setTitle("Alert button")
                    .setMessage("Are you sure want to continue")
                    .setCancelable(true)
                    .setIcon(android.R.drawable.ic_dialog_alert)
                builder.setPositiveButton("Yes") { dialogInterface, which ->
                    Toast.makeText(applicationContext, "true", Toast.LENGTH_SHORT).show()
                }
                builder.setNegativeButton("Yes") { dialogInterface, which ->
                    Toast.makeText(applicationContext, "fale", Toast.LENGTH_SHORT).show()
                }
            }
            snackbar.setOnClickListener {
                var snack = Snackbar.make(ll, "Plz undo", Snackbar.LENGTH_LONG)
                    .setAction("Undo") {
                        var snack = Snackbar.make(ll, "Plz undo", Snackbar.LENGTH_LONG)
                        snack.show()
                    }
                snack.show()
            }
            appchooser.setOnClickListener {
                var url = "https://www.google.com"
                var i = Intent(Intent.ACTION_VIEW)
                i.setDataAndType(Uri.parse(url), "text/plain")
                var choose = Intent.createChooser(i, "Sahre Url")
                startActivity(choose)
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.optionmenu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id=item.itemId
        return when(id){
            R.id.Settings->{
                Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.Play->{
                Toast.makeText(applicationContext, "Play", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.Pause->{
                Toast.makeText(applicationContext, "pause", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.Exit->{
                finish()
                true
            }
            else-> return super.onOptionsItemSelected(item)
        }

    }
}