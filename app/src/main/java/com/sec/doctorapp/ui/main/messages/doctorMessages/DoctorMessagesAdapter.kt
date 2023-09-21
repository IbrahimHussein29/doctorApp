package com.sec.doctorapp.ui.main.messages.doctorMessages

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.databinding.MessagesCardItemBinding
import com.sec.doctorapp.ui.main.appointment.doctorCard.items.DoctorUiItem
import com.sec.doctorapp.ui.main.messages.doctorMessages.items.DoctorMessagesUiItem

class DoctorMessagesAdapter(
    var items:ArrayList<DoctorMessagesUiItem>,
    var onItemClicked: (item: DoctorMessagesUiItem) -> Unit
):RecyclerView.Adapter<DoctorMessagesVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoctorMessagesVH {
        val binding=MessagesCardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DoctorMessagesVH(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: DoctorMessagesVH, position: Int) {
        val item=items[position]
       holder.bind(item)
        holder.binding.messageCard.setOnClickListener() {
            onItemClicked(item)
        }
    }
}