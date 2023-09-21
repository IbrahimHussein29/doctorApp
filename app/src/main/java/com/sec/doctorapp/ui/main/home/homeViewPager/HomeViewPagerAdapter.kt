package com.sec.doctorapp.ui.main.home.homeViewPager


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.databinding.HomeSliderBinding
import com.sec.doctorapp.ui.main.home.homeViewPager.items.HomeSliderUiItem


class HomeViewPagerAdapter(var items: ArrayList<HomeSliderUiItem>):RecyclerView.Adapter<ViewPagerVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerVH {
       var binding=HomeSliderBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return ViewPagerVH(binding)
    }

    override fun onBindViewHolder(holder: ViewPagerVH, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
      return  items.size

    }
}



