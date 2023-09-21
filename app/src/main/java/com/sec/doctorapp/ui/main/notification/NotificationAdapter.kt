package com.sec.doctorapp.ui.main.notification

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.databinding.NotificationCardItemBinding
import com.sec.doctorapp.ui.main.notification.items.NotificationUiItem

class NotificationAdapter(var items: ArrayList<NotificationUiItem>) :RecyclerView.Adapter<NotificationVH>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NotificationVH {
       val binding=NotificationCardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return NotificationVH(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: NotificationVH, position: Int) {
        val item=items[position]
        holder.bind(item)
    }
}