package com.sec.doctorapp.ui.main.home.categories

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.databinding.CategoriesCardItemBinding
import com.sec.doctorapp.ui.main.home.categories.items.CategoriesUiItem

class CategoriesAdapter(var items: ArrayList<String>):RecyclerView.Adapter<CategoriesVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesVH {
      val binding= CategoriesCardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CategoriesVH(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: CategoriesVH, position: Int) {
        val item=items[position]
        holder.bind(item)
    }

}