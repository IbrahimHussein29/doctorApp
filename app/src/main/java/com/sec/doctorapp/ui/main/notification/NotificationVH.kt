package com.sec.doctorapp.ui.main.notification

import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.databinding.NotificationCardItemBinding
import com.sec.doctorapp.ui.main.notification.items.NotificationUiItem

class NotificationVH(var binding:NotificationCardItemBinding):RecyclerView.ViewHolder(binding.root) {
    fun bind(item:NotificationUiItem){
        binding.notificationDateTextView.text=item.date
        binding.notificationTimeTextView.text=item.time
        binding.notificationDescriptionTextView.text=item.description
    }
}