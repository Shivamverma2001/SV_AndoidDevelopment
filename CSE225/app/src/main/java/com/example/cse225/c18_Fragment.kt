package com.example.cse225

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class c18_Fragment : AppCompatActivity(),c18_3_static {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c18_fragment)
    }

    override fun onButtonPressed(msg: String) {
        var obj=supportFragmentManager.findFragmentById(R.id.frag2) as c18_2_fragmentStaticListExTwo
        obj.onFragmentInteraction(msg)
    }
}