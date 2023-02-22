package com.example.cse225

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView

class c17_Footer : AppCompatActivity() {

    private lateinit var tv: TextView
    private lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c17_footer)

        tv = findViewById(R.id.tView)
        bottomNav = findViewById(R.id.bottomNav)
        title = "Home"

        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.menu_home -> {
                    setContent("Home")
                    true
                }
                R.id.menu_profile -> {
                    setContent("Profile")
                    true
                }
                R.id.menu_notification -> {
                    setContent("Notification")
                    true
                }
                R.id.menu_search -> {
                    setContent("Search")
                    true
                }
                else -> true

            }
        }
    }

    private fun setContent(content: String) {
        title = content
        tv.text = content
    }
}