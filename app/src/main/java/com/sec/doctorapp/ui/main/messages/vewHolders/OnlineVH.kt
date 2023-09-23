package com.sec.doctorapp.ui.main.messages.vewHolders

import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.databinding.CellHomeBannerBinding
import com.sec.doctorapp.databinding.CellOnlineDoctorsBinding
import com.sec.doctorapp.databinding.MessageActiveDrSliderBinding
import com.sec.doctorapp.ui.main.home.homeViewPager.HomeViewPagerAdapter
import com.sec.doctorapp.ui.main.home.items.HomeUiItem
import com.sec.doctorapp.ui.main.messages.items.MessagesUiItem
import com.sec.doctorapp.ui.main.messages.onlineDoctors.OnlineDoctorsAdapter

class OnlineVH(val binding: CellOnlineDoctorsBinding) :
    RecyclerView.ViewHolder(binding.root) {

    private val onlineAdapter by lazy {
       OnlineDoctorsAdapter(arrayListOf())
    }

    fun bind(item: MessagesUiItem.OnlineDoctor) {
        onlineAdapter.items = item.onlineDoctors
        binding.onlineDrRecyclerView.adapter=onlineAdapter

    }
}