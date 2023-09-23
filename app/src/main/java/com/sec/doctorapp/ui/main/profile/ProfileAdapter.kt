package com.sec.doctorapp.ui.main.profile

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.sec.doctorapp.databinding.CellProfileItemBinding

import com.sec.doctorapp.ui.main.profile.items.ProfileUiItem


class ProfileAdapter (var items: ArrayList<ProfileUiItem>,
var onItemClicked: (item: ProfileUiItem) -> Unit
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            ProfileUiItem.ItemUi::class.java.hashCode() -> {
                ProfileVH(
                    CellProfileItemBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }
            else->throw UnsupportedOperationException("no view holder for the specified item")
        }
    }

    override fun getItemCount(): Int {
       return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]
        when (holder) {
            is ProfileVH -> {
                holder.bind(item as ProfileUiItem.ItemUi)
                holder.binding.navigateImg.setOnClickListener {
                    onItemClicked(item)
                }
            }
            else->{}
        }

    }

    override fun getItemViewType(position: Int): Int {
        return items[position]::class.java.hashCode()
    }

}