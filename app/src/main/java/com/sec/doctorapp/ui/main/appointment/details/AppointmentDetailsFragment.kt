package com.sec.doctorapp.ui.main.appointment.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController

import com.sec.doctorapp.R
import com.sec.doctorapp.databinding.FragmentAppointmentDetailsBinding
import com.sec.doctorapp.ui.main.appointment.details.date.DateAdapter
import com.sec.doctorapp.ui.main.appointment.details.items.AppointmentDetailsUiItem
import com.sec.doctorapp.ui.main.appointment.details.time.TimeAdapter
import com.sec.doctorapp.ui.main.appointment.doctorCard.items.DoctorUiItem
import com.sec.doctorapp.ui.main.home.HomeAdapter
import com.sec.doctorapp.ui.main.home.items.HomeUiItem

class AppointmentDetailsFragment : Fragment() {
    private lateinit var binding: FragmentAppointmentDetailsBinding
 private lateinit var appointmentDetailsViewModel:AppointmentDetailsViewModel

    private val appointmentDetailsAdapter by lazy {
     AppointmentDetailsAdapter(arrayListOf()){
         handleItemClicked(it)
        }
    }




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentAppointmentDetailsBinding.inflate(layoutInflater)
        appointmentDetailsViewModel =
            ViewModelProvider(this)[AppointmentDetailsViewModel::class.java]

        bindData()
        callData()
        observeData()
        return binding.root

    }
    private fun bindData() {
        binding.recyclerView.adapter=appointmentDetailsAdapter
        binding.backVector.setOnClickListener() {
            findNavController().popBackStack()
        }
        binding.btnBookAppointment.setOnClickListener {

            findNavController().navigate(
                R.id.action_appointmentDetailsFragment_to_appointmentPaymentFragment,
                bundleOf("item" to it)
            )
        }

    }

    private fun observeData() {

      appointmentDetailsViewModel.appointmentDetailsData.observe(viewLifecycleOwner){
          appointmentDetailsAdapter.items=it
          appointmentDetailsAdapter.notifyDataSetChanged()
      }
    }

    private fun callData() {
        appointmentDetailsViewModel.generateAppointmentDetailsData()

    }



    private fun handleItemClicked(it: AppointmentDetailsUiItem) {
        when (it) {
            is AppointmentDetailsUiItem.AppointmentTitleItem -> {
                handleSeeAllClick(it)
            }
            is AppointmentDetailsUiItem.DoctorDetails ->{
                openNextScreen(it)
            }

            else -> {}
        }
    }

    private fun openNextScreen(it: AppointmentDetailsUiItem.DoctorDetails) {
        findNavController().navigate(
            R.id.action_appointmentDetailsFragment_to_messageDetailsFragment,
            bundleOf("item" to it.item)
        )

    }


    private fun handleSeeAllClick(it: AppointmentDetailsUiItem.AppointmentTitleItem) {

    }


}