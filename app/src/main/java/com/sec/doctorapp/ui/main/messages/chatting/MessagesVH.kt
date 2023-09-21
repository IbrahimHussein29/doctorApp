package com.sec.doctorapp.ui.main.messages.chatting

import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.databinding.ChattingCardItemBinding

import com.sec.doctorapp.ui.main.messages.chatting.items.MessagesUiItem

class MessagesVH(val binding:ChattingCardItemBinding):RecyclerView.ViewHolder(binding.root) {
    fun bind(item: MessagesUiItem){
        binding.drMessageText.text=item.drMessage
        binding.userMessageText.text=item.userMessage
    }

}