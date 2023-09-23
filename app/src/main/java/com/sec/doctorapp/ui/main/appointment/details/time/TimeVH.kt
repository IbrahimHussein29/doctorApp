package com.sec.doctorapp.ui.main.appointment.details.time

import android.annotation.SuppressLint
import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.R

import com.sec.doctorapp.databinding.AppointmentTimeCardItemBinding


class TimeVH(val binding: AppointmentTimeCardItemBinding):RecyclerView.ViewHolder(binding.root) {
    @SuppressLint("ResourceAsColor")
    fun bind(item:String){

        binding.timeBtn.text=item

        var flag =true
        binding.timeBtn.setOnClickListener(){
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