package com.example.cse225

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class c22_f2 : Fragment() {
    lateinit var txtData:TextView
    var msg:String=""
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v=inflater.inflate(R.layout.fragment_c22_f2, container, false)
        txtData=v.findViewById(R.id.textView)
        txtData.setText(msg)
        return v
    }
    fun displayRexeiveData(message:String){
        msg=message
    }
}