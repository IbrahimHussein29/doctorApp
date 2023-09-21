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
import com.sec.doctorapp.ui.main.appointment.details.time.TimeAdapter
import com.sec.doctorapp.ui.main.appointment.doctorCard.items.DoctorUiItem

class AppointmentDetailsFragment : Fragment() {
    private lateinit var binding: FragmentAppointmentDetailsBinding
    private lateinit var appointmentDetailsViewModel: AppointmentDetailsViewModel
    private val timeAdapter by lazy {
        TimeAdapter(arrayListOf())
    }

    private val dateAdapter by lazy {
        DateAdapter(arrayListOf())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentAppointmentDetailsBinding.inflate(layoutInflater)
        appointmentDetailsViewModel =
            ViewModelProvider(this)[AppointmentDetailsViewModel::class.java]
        setClickableListeners()
        bindData()
        callData()
        observeData()
        return binding.root

    }

    private fun observeData() {
        binding.appointmentTimeRecyclerView.adapter = timeAdapter
        binding.appointmentDateRecyclerView.adapter = dateAdapter
        appointmentDetailsViewModel.dateData.observe(viewLifecycleOwner) {
            dateAdapter.items = it
        }
        appointmentDetailsViewModel.timeData.observe(viewLifecycleOwner) {
            timeAdapter.items = it
        }
    }

    private fun callData() {
        appointmentDetailsViewModel.generateDummyDateData()
        appointmentDetailsViewModel.generateDummyTimeData()
    }

    private fun bindData() {
        val name = requireArguments().getString("name")

        val category = requireArguments().getString("category")
        val price = requireArguments().getString("price")
        val details = requireArguments().getString("details")
        val doctorItem = requireArguments().getSerializable("item") as DoctorUiItem
        binding.detailsDoctorName.text = doctorItem.doctorName

        binding.detailsDoctorCategory.text = category
        binding.detailsDoctorAppointmentPrice.text = price
        binding.detailsDoctorDescription.text = details

    }

    private fun setClickableListeners() {
        binding.backVector.setOnClickListener {
            findNavController().popBackStack()
        }
        binding.btnBookAppointment.setOnClickListener {
            val price = requireArguments().getString("price")
            val bundle = bundleOf("price" to price)
            findNavController().navigate(
                R.id.action_appointmentDetailsFragment_to_appointmentPaymentFragment,
                bundle
            )
        }
        binding.detailsDoctorMessage.setOnClickListener() {
            val name = requireArguments().getString("name")
            val bundle = bundleOf("name" to name)
            findNavController().navigate(
                R.id.action_appointmentDetailsFragment_to_messageDetailsFragment,
                bundle
            )
        }

        binding.detailsDoctorPhone.setOnClickListener() {
            val name = requireArguments().getString("name")
            val bundle = bundleOf("name" to name)
            findNavController().navigate(
                R.id.action_appointmentDetailsFragment_to_callingFragment,
                bundle
            )
        }
        binding.detailsDoctorVideo.setOnClickListener() {
            val name = requireArguments().getString("name")
            val bundle = bundleOf("name" to name)
            findNavController().navigate(
                R.id.action_appointmentDetailsFragment_to_videoCallFragment,
                bundle
            )
        }
    }


}