package com.sec.doctorapp.ui.main.messages.chatting

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.databinding.ChattingCardItemBinding
import com.sec.doctorapp.ui.main.messages.chatting.items.MessagesUiItem

class MessagesAdapter(var items:ArrayList<MessagesUiItem>):RecyclerView.Adapter<MessagesVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessagesVH {
        val binding=ChattingCardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MessagesVH(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MessagesVH, position: Int) {
        val item=items[position]
       holder.bind(item)
    }
}