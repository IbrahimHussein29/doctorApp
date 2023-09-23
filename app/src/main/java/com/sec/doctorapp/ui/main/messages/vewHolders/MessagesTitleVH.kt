package com.sec.doctorapp.ui.main.messages.vewHolders

import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.databinding.CellMessagesTitleBinding
import com.sec.doctorapp.ui.main.messages.items.MessagesUiItem

class MessagesTitleVH(val binding: CellMessagesTitleBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item:MessagesUiItem.MessagesTitle) {
        binding.textViewTitle.text = item.title
    }
}