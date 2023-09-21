package com.sec.doctorapp.ui.main.home.viewHolders

import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.databinding.CellHomeDoctorBinding
import com.sec.doctorapp.ui.main.home.items.HomeUiItem

class HomeDoctorViewHolder(val binding: CellHomeDoctorBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: HomeUiItem.HomeDoctorItem) {
        val doctorItem = item.item
        binding.doctorNameText.text = doctorItem.doctorName
        binding.doctorDescriptionText.text = doctorItem.doctorDescription
        binding.doctorImageView.setImageResource(doctorItem.doctorImg)
    }
}