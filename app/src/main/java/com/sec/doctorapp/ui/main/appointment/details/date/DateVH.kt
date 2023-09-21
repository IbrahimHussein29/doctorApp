package com.sec.doctorapp.ui.main.appointment.details.date

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.color.ColorResourcesOverride
import com.sec.doctorapp.R
import com.sec.doctorapp.databinding.AppointmentDateCardItemBinding
import com.sec.doctorapp.ui.main.appointment.details.date.items.DateUiItem

class DateVH(val binding:AppointmentDateCardItemBinding):RecyclerView.ViewHolder(binding.root) {


    @SuppressLint("ResourceAsColor")
    fun bind(item:DateUiItem){
        binding.dateBtn.text=item.date
        var flag=true
        binding.dateBtn.setOnClickListener {

            flag = if(flag){
                it.setBackgroundColor(R.color.color_primary)

                false
            }else {
                it.setBackgroundColor(R.color.input_bg)
                true
            }
        }


    }
}