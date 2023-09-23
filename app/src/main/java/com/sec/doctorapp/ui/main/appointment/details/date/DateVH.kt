package com.sec.doctorapp.ui.main.appointment.details.date

import android.annotation.SuppressLint

import androidx.recyclerview.widget.RecyclerView

import com.sec.doctorapp.R
import com.sec.doctorapp.databinding.AppointmentDateCardItemBinding


class DateVH(val binding:AppointmentDateCardItemBinding):RecyclerView.ViewHolder(binding.root) {


    @SuppressLint("ResourceAsColor")
    fun bind(item:String){
        binding.dateBtn.text=item
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