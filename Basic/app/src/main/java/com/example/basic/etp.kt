package com.example.basic

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.LinearLayout
import android.widget.PopupMenu
import android.widget.Toast

class etp : AppCompatActivity() {
    lateinit var ll:LinearLayout
    lateinit var submit:Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_etp)
        ll=findViewById(R.id.ll)
        submit=findViewById(R.id.b1)
        submit.setOnClickListener {
            var pop = PopupMenu(this, submit)
            pop.menuInflater.inflate(R.menu.popupmenu, pop.menu)
            pop.setOnMenuItemClickListener {
                Toast.makeText(applicationContext, "You click " + it.title, Toast.LENGTH_SHORT)
                    .show()
                true
            }
            pop.show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.context_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var id=item.itemId
        return when(id){
            R.id.call->{
                Toast.makeText(applicationContext,"Call",Toast.LENGTH_SHORT).show()
                true
            }
            R.id.sms->{
                Toast.makeText(applicationContext,"SMS",Toast.LENGTH_SHORT).show()
                true
            }
//            R.id.Pause->{
//                Toast.makeText(applicationContext,"Pause",Toast.LENGTH_SHORT).show()
//                true
//            }
//            R.id.exit->{
//                finish()
//                true
//            }
            else->return super.onOptionsItemSelected(item)
        }

    }
}