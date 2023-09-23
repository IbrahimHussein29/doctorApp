package com.sec.doctorapp.ui.main.appointment.details.viewHolders

import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.databinding.CellAppointmentDateTimeBinding
import com.sec.doctorapp.ui.main.appointment.details.items.AppointmentDetailsUiItem
import com.sec.doctorapp.ui.main.appointment.details.time.TimeAdapter

import com.sec.doctorapp.ui.main.home.items.HomeUiItem

class AppointmentTimeVH(val binding:CellAppointmentDateTimeBinding)  :
    RecyclerView.ViewHolder(binding.root) {

    private val timeAdapter by lazy {
        TimeAdapter(arrayListOf())
    }

    fun bind(item: AppointmentDetailsUiItem.TimeItem) {
        binding.appointmentRecyclerView.adapter = timeAdapter
        timeAdapter.items = item.time
        timeAdapter.notifyDataSetChanged()
    }
}