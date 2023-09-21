package com.sec.doctorapp.ui.main.appointment.doctorCard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.sec.doctorapp.databinding.DoctorCardItemBinding
import com.sec.doctorapp.ui.main.appointment.doctorCard.items.DoctorUiItem

class DoctorDataAdapter(
    var items: ArrayList<DoctorUiItem>,
    var onItemClicked: (item: DoctorUiItem) -> Unit
) : RecyclerView.Adapter<DoctorDataVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoctorDataVH {
        val binding = DoctorCardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return DoctorDataVH(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: DoctorDataVH, position: Int) {
        val item = items[position]
        holder.bind(item)
        holder.binding.bookBtn.setOnClickListener() {
        onItemClicked(item)

        }


    }
}