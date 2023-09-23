package com.sec.doctorapp.ui.main.appointment.details.viewHolders

import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.databinding.CellAppointmentDetailsCardBinding
import com.sec.doctorapp.ui.main.appointment.details.items.AppointmentDetailsUiItem

class AppointmentDetailsCardVH(val binding: CellAppointmentDetailsCardBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: AppointmentDetailsUiItem.DoctorDetails) {
        val doctorItem = item.item
        binding.doctorName.text = doctorItem.doctorName
        binding.doctorAppointmentPrice.text = doctorItem.appointmentPrice
        binding.doctorCategory.text=doctorItem.doctorCategory
        binding.doctorDescription.text=doctorItem.doctorDetailsDescription
        binding.doctorImg.setImageResource(doctorItem.doctorImg)
    }
}