package com.sec.doctorapp.ui.main.appointment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.sec.doctorapp.R
import com.sec.doctorapp.databinding.FragmentPaymentSuccessfullyBinding


class PaymentSuccessfullyFragment : Fragment() {
private lateinit var binding:FragmentPaymentSuccessfullyBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding=FragmentPaymentSuccessfullyBinding.inflate(layoutInflater)
        binding.btnBack.setOnClickListener (){
            findNavController().navigate(R.id.action_paymentSuccessfullyFragment_to_homeFragment)
        }
        return binding.root
    }


}