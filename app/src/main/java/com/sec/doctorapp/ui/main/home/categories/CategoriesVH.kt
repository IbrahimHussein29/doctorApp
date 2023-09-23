package com.sec.doctorapp.ui.main.home.categories

import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.databinding.CategoriesCardItemBinding


class CategoriesVH(val binding: CategoriesCardItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: String) {
        binding.categoryTypeText.text = item
    }
}