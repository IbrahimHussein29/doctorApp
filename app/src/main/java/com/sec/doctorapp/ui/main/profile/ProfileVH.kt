package com.sec.doctorapp.ui.main.profile

import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.databinding.CellProfileItemBinding
import com.sec.doctorapp.ui.main.profile.items.ProfileUiItem

class ProfileVH (val binding: CellProfileItemBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: ProfileUiItem.ItemUi) {
        binding.profileItemImg.setImageResource(item.itemImg)
        binding.profileItem.text=item.item
        binding.navigateImg.setImageResource(item.navigateImg)

    }
}