package com.sec.doctorapp.ui.main.home.categories

import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.databinding.CategoriesCardItemBinding
import com.sec.doctorapp.ui.main.home.categories.items.CategoriesUiItem

class CategoriesVH(val binding:CategoriesCardItemBinding):RecyclerView.ViewHolder(binding.root) {
    fun bind(item:CategoriesUiItem){
        binding.categoryTypeText.text=item.category
    }
}