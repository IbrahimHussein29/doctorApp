package com.sec.doctorapp.ui.main.home.viewHolders

import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.databinding.CellHomeBannerBinding
import com.sec.doctorapp.databinding.CellHomeCategoryBinding
import com.sec.doctorapp.ui.main.home.categories.CategoriesAdapter
import com.sec.doctorapp.ui.main.home.homeViewPager.HomeViewPagerAdapter
import com.sec.doctorapp.ui.main.home.items.HomeUiItem

class HomeCategoryViewHolder(val binding: CellHomeCategoryBinding) :
    RecyclerView.ViewHolder(binding.root) {

    private val categoriesAdapter by lazy {
        CategoriesAdapter(arrayListOf())
    }

    fun bind(item: HomeUiItem.HomeCategoryItem) {
        binding.categoriesRecyclerView.adapter = categoriesAdapter
        categoriesAdapter.items = item.categoryList
        categoriesAdapter.notifyDataSetChanged()
    }
}