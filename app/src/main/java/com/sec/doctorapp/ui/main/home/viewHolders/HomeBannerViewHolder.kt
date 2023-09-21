package com.sec.doctorapp.ui.main.home.viewHolders

import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.databinding.CellHomeBannerBinding
import com.sec.doctorapp.ui.main.home.homeViewPager.HomeViewPagerAdapter
import com.sec.doctorapp.ui.main.home.items.HomeUiItem

class HomeBannerViewHolder(val binding: CellHomeBannerBinding) :
    RecyclerView.ViewHolder(binding.root) {

    private val viewPagerAdapter by lazy {
        HomeViewPagerAdapter(arrayListOf())
    }

    fun bind(item: HomeUiItem.HomeBannerItem) {
        viewPagerAdapter.items = item.bannerList
        val viewpager = binding.viewPager
        binding.viewPager.adapter = viewPagerAdapter
        val dotsIndicator = binding.wormDotsIndicator
        dotsIndicator.attachTo(viewpager)
    }
}