package com.example.furnitureapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.furnitureapp.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {

    var _binding : FragmentProfileBinding? = null
    val binding get() = _binding!!
    internal lateinit var sharedPref: SharedPref

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        val view = binding.root

        sharedPref = SharedPref((activity as MainActivity).applicationContext)
        binding.toggleModeSwitch.apply {
            isChecked = sharedPref.getNightModeState()!!
            setOnCheckedChangeListener { buttonView, isChecked ->

                sharedPref.setNightModeState(isChecked)
                restartApp()
            }
        }

        return view
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun restartApp() {
        val activity = activity as MainActivity
        val intent =Intent((activity).applicationContext, MainActivity::class.java)
        (activity).finish()
        startActivity(intent)
    }

}