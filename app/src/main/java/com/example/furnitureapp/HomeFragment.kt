package com.example.furnitureapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.furnitureapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {


    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflator : LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?) : View? {

        _binding = FragmentHomeBinding.inflate(inflator, container, false)
        val view = binding.root

        binding.button.setOnClickListener{ view ->

            val action = R.id.action_homeFragment_to_itemFragment
            this.view?.findNavController()?.navigate(action)

        }

        return view
    }

    override fun onDestroy(){
        super.onDestroy()
        _binding = null
    }
}