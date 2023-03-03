package com.example.cse225

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import java.net.URI

class c18_2_fragmentStaticListExTwo : Fragment() {
    lateinit var textView:TextView
    lateinit var v1: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v1=inflater.inflate(R.layout.fragment_c18_2_static_list_ex_two, container, false)
        return v1
    }
    fun onFragmentInteraction(uri: String){
        Log.d("sudha",uri)
        textView =v1.findViewById(R.id.text)
        textView.setText(uri)
    }
}