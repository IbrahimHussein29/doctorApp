package com.sec.doctorapp.ui.auth

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

import com.sec.doctorapp.R
import com.sec.doctorapp.databinding.FragmentSignInBinding
import com.sec.doctorapp.ui.main.MainActivity


class SignInFragment : Fragment() {

    private lateinit var binding: FragmentSignInBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentSignInBinding.inflate(layoutInflater)
        setClickableListeners()

        return binding.root

    }

    private fun setClickableListeners() {
        binding.textSignUp.setOnClickListener {
            findNavController().navigate(R.id.action_signInFragment_to_signUpFragment)
        }
        binding.btnSingIn.setOnClickListener {
            redirectToMainScreen()
        }
//
//        binding.passwordEdittextSignIn.
    }

    private fun redirectToMainScreen() {
        startActivity(Intent(requireActivity(), MainActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        })
        requireActivity().finish()
    }


}