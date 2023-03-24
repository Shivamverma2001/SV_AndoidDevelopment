package com.example.cse225

import android.os.Build.VERSION_CODES.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class c3_ActionBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.cse225.R.layout.activity_c3_action_bar)
        val actionBar = supportActionBar
        actionBar!!.title = "  GfG | Action Bar"
        actionBar.subtitle = "   Design a custom Action Bar"
        actionBar.setIcon(com.example.cse225.R.drawable.setting)
        actionBar.setDisplayUseLogoEnabled(true)
        actionBar.setDisplayShowHomeEnabled(true)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(com.example.cse225.R.menu.actionbar, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            com.example.cse225.R.id.search -> Toast.makeText(this, "Search Clicked", Toast.LENGTH_SHORT).show()
            com.example.cse225.R.id.refresh -> Toast.makeText(this, "Refresh Clicked", Toast.LENGTH_SHORT).show()
            com.example.cse225.R.id.copy -> Toast.makeText(this, "Copy Clicked", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}