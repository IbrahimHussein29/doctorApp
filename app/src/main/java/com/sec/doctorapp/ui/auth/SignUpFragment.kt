package com.sec.doctorapp.ui.auth

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import androidx.navigation.fragment.findNavController

import com.sec.doctorapp.R

import com.sec.doctorapp.databinding.FragmentSignUpBinding
import com.sec.doctorapp.ui.main.MainActivity


class SignUpFragment : Fragment() {

    private lateinit var binding: FragmentSignUpBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSignUpBinding.inflate(layoutInflater)
        setClickableListeners()
        return binding.root

    }

    private fun setClickableListeners() {
        binding.textSignIn.setOnClickListener {
            findNavController().navigate(R.id.action_signUpFragment_to_signInFragment)
        }
        binding.btnSignUp.setOnClickListener {
            redirectToMainScreen()
        }


    }

    private fun redirectToMainScreen() {
        startActivity(Intent(requireActivity(), MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        })
        requireActivity().finish()
    }

}
