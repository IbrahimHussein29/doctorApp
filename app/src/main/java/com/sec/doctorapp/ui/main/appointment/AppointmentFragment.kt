package com.sec.doctorapp.ui.main.appointment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.sec.doctorapp.R
import com.sec.doctorapp.databinding.FragmentAppointmentBinding
import com.sec.doctorapp.ui.main.appointment.doctorCard.DoctorDataAdapter
import com.sec.doctorapp.ui.main.appointment.doctorCard.DoctorDataViewModel
import com.sec.doctorapp.ui.main.appointment.doctorCard.items.DoctorUiItem


class AppointmentFragment : Fragment() {
    private lateinit var binding:FragmentAppointmentBinding
    private lateinit var doctorViewModel: DoctorDataViewModel
    private val adapter by lazy {
        DoctorDataAdapter(arrayListOf()){
            openDoctorDetailsScreen(it)
        }
    }




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
      binding=FragmentAppointmentBinding.inflate(layoutInflater)

        doctorViewModel= ViewModelProvider(this)[DoctorDataViewModel::class.java]
        callData()
        observeData()
        setClickableListeners()
        return binding.root
    }

    private fun setClickableListeners() {
        binding.backVector.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun observeData() {
        binding.recyclerView.adapter=adapter
        doctorViewModel.doctorData.observe(viewLifecycleOwner){
            adapter.items=it
            adapter.notifyDataSetChanged()
        }

    }

    private fun callData() {
        doctorViewModel.generateDoctorDummyData()
    }
    private fun openDoctorDetailsScreen(it: DoctorUiItem) {
        val bundle=bundleOf("item" to it )

        findNavController().navigate(R.id.action_appointmentFragment_to_appointmentDetailsFragment,bundle)
    }


}