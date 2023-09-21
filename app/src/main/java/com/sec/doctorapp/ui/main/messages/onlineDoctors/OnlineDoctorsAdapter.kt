package com.sec.doctorapp.ui.main.messages.onlineDoctors

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.databinding.MessageActiveDrSliderBinding
import com.sec.doctorapp.ui.main.messages.onlineDoctors.items.OnlineDoctorsUiItem

class OnlineDoctorsAdapter(var items:ArrayList<OnlineDoctorsUiItem>):RecyclerView.Adapter<OnlineDoctorsVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OnlineDoctorsVH {
      val binding=MessageActiveDrSliderBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return OnlineDoctorsVH(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: OnlineDoctorsVH, position: Int) {
        val item=items[position]
        holder.bind(item)
    }
}