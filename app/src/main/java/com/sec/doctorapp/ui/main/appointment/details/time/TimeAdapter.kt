package com.sec.doctorapp.ui.main.appointment.details.time

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.databinding.AppointmentTimeCardItemBinding
import com.sec.doctorapp.ui.main.appointment.details.time.items.TimeUiItem

class TimeAdapter(var items:ArrayList<TimeUiItem>):RecyclerView.Adapter<TimeVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TimeVH {
        val binding=AppointmentTimeCardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TimeVH(binding)
    }

    override fun getItemCount(): Int {
       return items.size
    }

    override fun onBindViewHolder(holder: TimeVH, position: Int) {
        val item=items[position]
        holder.bind(item)
    }
}