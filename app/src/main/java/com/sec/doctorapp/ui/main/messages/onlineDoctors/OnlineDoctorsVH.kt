package com.sec.doctorapp.ui.main.messages.onlineDoctors

import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.R
import com.sec.doctorapp.databinding.MessageActiveDrSliderBinding
import com.sec.doctorapp.ui.main.messages.onlineDoctors.items.OnlineDoctorsUiItem


class OnlineDoctorsVH(val binding:MessageActiveDrSliderBinding):RecyclerView.ViewHolder(binding.root) {
    fun bind(item:OnlineDoctorsUiItem){
        binding.onlineDrImg.setImageResource(item.doctorImg)
        val onlineDr=if(item.isOnline){
            binding.onlineStatusImg.setImageResource(R.drawable.ic_online)
        }else{
            return
        }
    }
}