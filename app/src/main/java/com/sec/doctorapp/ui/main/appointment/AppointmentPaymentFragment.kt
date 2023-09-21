package com.sec.doctorapp.ui.main.appointment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.sec.doctorapp.R
import com.sec.doctorapp.databinding.FragmentAppointmentPaymentBinding


class AppointmentPaymentFragment : Fragment() {
    private lateinit var binding: FragmentAppointmentPaymentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAppointmentPaymentBinding.inflate(layoutInflater)
        setClickableListeners()
        bindData()
        return binding.root
    }

    private fun bindData() {
        val price = requireArguments().getString("price")
        binding.priceText.text = price
    }

    private fun setClickableListeners() {
        binding.backVector.setOnClickListener {
            findNavController().popBackStack()
        }
        binding.btnPayNow.setOnClickListener() {
            findNavController().navigate(R.id.action_appointmentPaymentFragment_to_paymentSuccessfullyFragment)
        }
    }


}