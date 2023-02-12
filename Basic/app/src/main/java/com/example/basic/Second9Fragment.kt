package com.example.basic

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.basic.databinding.FragmentSecond9Binding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class Second9Fragment : Fragment() {

private var _binding: FragmentSecond9Binding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

      _binding = FragmentSecond9Binding.inflate(inflater, container, false)
      return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_Second9Fragment_to_First9Fragment)
        }
    }
override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}