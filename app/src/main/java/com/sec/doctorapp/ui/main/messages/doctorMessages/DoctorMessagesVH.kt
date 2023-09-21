package com.sec.doctorapp.ui.main.messages.doctorMessages

import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.databinding.MessagesCardItemBinding
import com.sec.doctorapp.ui.main.messages.doctorMessages.items.DoctorMessagesUiItem

class DoctorMessagesVH(val binding:MessagesCardItemBinding):RecyclerView.ViewHolder(binding.root) {

    fun bind(item:DoctorMessagesUiItem){
        binding.messageCardDrImg.setImageResource(item.doctorImg)
        binding.messageDoctorNameText.text=item.doctorName
        binding.messageDoctorDescriptionText.text=item.message
        if(item.isUnreadableMessage){
            binding.numberOfNotificationsImg.text=item.messageNumber
        }else{
            return
        }
    }
}