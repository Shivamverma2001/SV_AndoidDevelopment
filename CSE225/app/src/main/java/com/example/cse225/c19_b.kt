package com.example.cse225

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView


class c19_b : Fragment() {
    lateinit var linearLayout:LinearLayout
    lateinit var v1: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v1= inflater.inflate(R.layout.fragment_c19_b, container, false)
        return v1
    }
    fun onFragmentInteraction(uri: Int){
//        Log.d("sudha",uri)
        linearLayout =v1.findViewById(R.id.ll)
        linearLayout.setBackgroundColor(uri)
    }

}