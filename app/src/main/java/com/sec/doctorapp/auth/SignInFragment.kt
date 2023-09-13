package com.sec.doctorapp.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

import com.sec.doctorapp.R
import com.sec.doctorapp.databinding.FragmentSignInBinding


class SignInFragment : Fragment() {

private lateinit var binding:FragmentSignInBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding=FragmentSignInBinding.inflate(layoutInflater)
        binding.textSignUp.setOnClickListener {
            it.findNavController().navigate(R.id.action_signInFragment_to_signUpFragment)
        }
        return binding.root

    }


}