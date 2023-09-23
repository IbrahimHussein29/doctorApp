package com.sec.doctorapp.ui.main.appointment.details.viewHolders

import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.databinding.CellAppointmentDateTimeBinding
import com.sec.doctorapp.ui.main.appointment.details.date.DateAdapter
import com.sec.doctorapp.ui.main.appointment.details.items.AppointmentDetailsUiItem
import com.sec.doctorapp.ui.main.appointment.details.time.TimeAdapter

import com.sec.doctorapp.ui.main.home.items.HomeUiItem

class AppointmentDateVH(val binding:CellAppointmentDateTimeBinding)  :
    RecyclerView.ViewHolder(binding.root) {

    private val dateAdapter by lazy {
       DateAdapter(arrayListOf())
    }

    fun bind(item: AppointmentDetailsUiItem.DateItem) {
        binding.appointmentRecyclerView.adapter = dateAdapter
        dateAdapter.items = item.date
        dateAdapter.notifyDataSetChanged()
    }
}