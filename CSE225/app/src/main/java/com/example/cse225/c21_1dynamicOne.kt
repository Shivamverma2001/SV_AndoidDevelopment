package com.example.cse225

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText


class c21_1dynamicOne : Fragment() {
    private lateinit var ly:View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val ed=ly.findViewById<EditText>(R.id.vname)
        ed.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                //(context as OnOrientationChangeListener).sendData(ed.text.toString())
            }
        })
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        ly=inflater.inflate(R.layout.fragment_c21_1dynamic_one, container, false)
        return ly
    }
    fun displayRecieveData(data:String){
        ly.findViewById<EditText>(R.id.vname).setText(data)
    }

}