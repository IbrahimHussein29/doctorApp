package com.sec.doctorapp.ui.main.appointment.details.date

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.databinding.AppointmentDateCardItemBinding
import com.sec.doctorapp.ui.main.appointment.details.date.items.DateUiItem

class DateAdapter(var items:ArrayList<DateUiItem>):RecyclerView.Adapter<DateVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DateVH {
        val binding=AppointmentDateCardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DateVH(binding)
    }

    override fun getItemCount(): Int {
        return  items.size
    }

    override fun onBindViewHolder(holder: DateVH, position: Int) {
        val item=items[position]
    holder.bind(item)
    }
}