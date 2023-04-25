package com.example.cse225

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText

class c22_f1 : Fragment() {
    lateinit var edtText: EditText
    lateinit var msg:String
    //lateinit var comm:onDataListener
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v=inflater.inflate(R.layout.fragment_c22_f1, container, false)
        edtText=v.findViewById(R.id.edtText)
        edtText.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun afterTextChanged(s: Editable) {
               // comm.communicate(edtText.text.toString())
            }
        })
        return v
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        //comm=context as onDataListener
    }
}