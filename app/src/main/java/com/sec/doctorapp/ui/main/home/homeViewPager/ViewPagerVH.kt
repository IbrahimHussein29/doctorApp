package com.sec.doctorapp.ui.main.home.homeViewPager

import androidx.recyclerview.widget.RecyclerView

import com.sec.doctorapp.databinding.HomeSliderBinding

import com.sec.doctorapp.ui.main.home.homeViewPager.items.HomeSliderUiItem

class ViewPagerVH(var binding: HomeSliderBinding):RecyclerView.ViewHolder(binding.root) {
    fun bind(item: HomeSliderUiItem) {

        binding.drImg.setImageResource(item.drImg)
        binding.cardDescriptionText.text=item.drDescription

    }

}