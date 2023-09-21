package com.sec.doctorapp.ui.main.appointment.doctorCard


import androidx.recyclerview.widget.RecyclerView

import com.sec.doctorapp.R

import com.sec.doctorapp.databinding.DoctorCardItemBinding

import com.sec.doctorapp.ui.main.appointment.doctorCard.items.DoctorUiItem

class DoctorDataVH(var binding: DoctorCardItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: DoctorUiItem) {
        binding.doctorImageView.setImageResource(item.doctorImg)

        binding.doctorNameText.text = item.doctorName
        binding.doctorDescriptionText.text = item.doctorDescription
        binding.doctorRatingText.text = item.doctorRating

        var favoriteDoctorOrNot = if (item.isFavoriteDoctor
        ) {
            R.drawable.ic_love_checked
        } else {
            R.drawable.ic_love
        }
        binding.favoriteDoctorImage.setImageResource(favoriteDoctorOrNot)
    }
}