package com.example.cse225

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class c18_2_fragmentStaticListExOne : Fragment() {
    // TODO: Rename and change types of parameters
    lateinit var v:View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        v=inflater.inflate(R.layout.fragment_c18_2_static_list_ex_one, container, false)
        init(container)
        return v
    }
    private  lateinit var buttonListener: c18_3_static
    override fun onAttach(context: Context){
        super.onAttach(context)
        buttonListener =
            try{
                activity as c18_3_static
            }
            catch(e: java.lang.ClassCastException) {
                throw ClassCastException("$context must implement onButtonPressed")
            }
    }
    private fun init(root:ViewGroup?){
        val but: Button =v.findViewById(R.id.b1)
        val clear:Button=v.findViewById(R.id.b2)
        Toast.makeText(context,"init",Toast.LENGTH_LONG).show()
        but.setOnClickListener{
            buttonListener.onButtonPressed("Button has been clicked")
        }
        clear.setOnClickListener{
            buttonListener.onButtonPressed("")
        }
    }

}