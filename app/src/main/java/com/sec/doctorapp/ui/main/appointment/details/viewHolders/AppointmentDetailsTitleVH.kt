package com.sec.doctorapp.ui.main.appointment.details.viewHolders

import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.databinding.CellAppointmentDateTimeBinding
import com.sec.doctorapp.databinding.CellHomeTitleBinding

import com.sec.doctorapp.ui.main.appointment.details.items.AppointmentDetailsUiItem
import com.sec.doctorapp.ui.main.appointment.details.time.TimeAdapter


class AppointmentDetailsTitleVH(val binding: CellHomeTitleBinding):
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: AppointmentDetailsUiItem.AppointmentTitleItem) {
        binding.textViewTitle.text=item.title
    }

}