package com.example.cse225

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

class c19_a : Fragment() {
    lateinit var v:View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        v= inflater.inflate(R.layout.fragment_c19_a, container, false)
        init(container)
        return v
    }
    private  lateinit var buttonListener: c19_staticInterface
    override fun onAttach(context: Context){
        super.onAttach(context)
        buttonListener =
            try{
                activity as c19_staticInterface
            }
            catch(e: java.lang.ClassCastException) {
                throw ClassCastException("$context must implement onButtonPressed")
            }
    }
    private fun init(root:ViewGroup?){
        val blue: Button =v.findViewById(R.id.blue)
        val red: Button =v.findViewById(R.id.red)
        val green: Button =v.findViewById(R.id.green)
        val yellow: Button =v.findViewById(R.id.cyan)
        Toast.makeText(context,"init",Toast.LENGTH_LONG).show()
        blue.setOnClickListener{
            buttonListener.onButtonPressed(Color.BLUE)
        }
        red.setOnClickListener{
            buttonListener.onButtonPressed(Color.RED)
        }
        green.setOnClickListener{
            buttonListener.onButtonPressed(Color.GREEN)
        }
        yellow.setOnClickListener{
            buttonListener.onButtonPressed(Color.CYAN)
        }
    }
}