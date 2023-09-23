package com.sec.doctorapp.ui.main.home.viewHolders

import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.databinding.CellHomeTitleBinding
import com.sec.doctorapp.ui.main.home.homeViewPager.HomeViewPagerAdapter
import com.sec.doctorapp.ui.main.home.items.HomeUiItem

class HomeTitleViewHolder(val binding: CellHomeTitleBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(item: HomeUiItem.HomeTitleItem) {
        binding.textViewTitle.text = item.title
    }
}