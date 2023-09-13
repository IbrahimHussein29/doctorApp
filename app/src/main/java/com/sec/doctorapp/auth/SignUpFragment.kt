package com.sec.doctorapp.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

import com.sec.doctorapp.R
import com.sec.doctorapp.databinding.FragmentSignInBinding
import com.sec.doctorapp.databinding.FragmentSignUpBinding


class SignUpFragment : Fragment() {

private lateinit var binding:FragmentSignUpBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentSignUpBinding.inflate(layoutInflater)
        binding.textSignIn.setOnClickListener {
            it.findNavController().navigate(R.id.action_signUpFragment_to_signInFragment)
        }
        return binding.root

    }


}