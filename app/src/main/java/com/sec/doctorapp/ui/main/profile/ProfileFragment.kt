package com.sec.doctorapp.ui.main.profile

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.sec.doctorapp.R
import com.sec.doctorapp.databinding.FragmentProfileBinding
import com.sec.doctorapp.ui.auth.AuthActivity



class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(layoutInflater)
        setClickableListeners()

        return binding.root
    }

    private fun setClickableListeners() {
        binding.backVector.setOnClickListener {
            findNavController().popBackStack()
        }
        binding.logoutImg.setOnClickListener() {
            redirectToSignInScreen()
        }
        binding.helpForward.setOnClickListener() {
            findNavController().navigate(R.id.action_profileFragment_to_profileHelpFragment)
        }
        binding.settingsForward.setOnClickListener() {
            findNavController().navigate(R.id.action_profileFragment_to_profileSettingsFragment)
        }
        binding.historyForward.setOnClickListener() {
            findNavController().navigate(R.id.action_profileFragment_to_profileHistoryFragment)
        }
        binding.locationForward.setOnClickListener() {
            findNavController().navigate(R.id.action_profileFragment_to_profileHelpFragment)
        }
        binding.paymentMethodForward.setOnClickListener() {
            findNavController().navigate(R.id.action_profileFragment_to_profilePaymentMethodFragment)
        }
        binding.personalDetailsForward.setOnClickListener() {
            findNavController().navigate(R.id.action_profileFragment_to_profilePersonalDetailsFragment)
        }

    }

    private fun redirectToSignInScreen() {

        startActivity(Intent(requireActivity(), AuthActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        })
        requireActivity().finish()
    }


}