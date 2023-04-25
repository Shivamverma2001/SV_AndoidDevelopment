package com.example.cse225

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.cse225.databinding.ActivityC21DynamicFragmentBinding

class c21_DynamicFragment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c21_dynamic_fragment)
        val fm:FragmentManager=supportFragmentManager
        val fragmentTransaction:FragmentTransaction=fm.beginTransaction()
        val displaymode=resources.configuration.orientation
        if(displaymode==1){//portrait mode
            val f1=c21_1dynamicOne()
            fragmentTransaction.replace(android.R.id.content,f1)
        }else{//landscape mode
            val f2=c21_1dynamicTwo()
            fragmentTransaction.replace(android.R.id.content,f2)
        }
        fragmentTransaction.commit()
    }
//    override fun sendData(data: String) {
//
//    }
}