package com.example.cse225

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.cse225.databinding.ActivityC19FragmentStaticPracBinding

class c19_FragmentStaticPrac : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c19_fragment_static_prac)
    }
    override fun onButtonPressed(msg: Int) {
        var obj=supportFragmentManager.findFragmentById(R.id.f2) as c19_b
        obj.onFragmentInteraction(msg)
    }

}