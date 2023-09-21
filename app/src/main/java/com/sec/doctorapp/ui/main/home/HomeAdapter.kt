package com.sec.doctorapp.ui.main.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.databinding.CellHomeBannerBinding
import com.sec.doctorapp.databinding.CellHomeCategoryBinding
import com.sec.doctorapp.databinding.CellHomeDoctorBinding
import com.sec.doctorapp.databinding.CellHomeTitleBinding
import com.sec.doctorapp.ui.main.home.items.HomeUiItem
import com.sec.doctorapp.ui.main.home.viewHolders.HomeBannerViewHolder
import com.sec.doctorapp.ui.main.home.viewHolders.HomeCategoryViewHolder
import com.sec.doctorapp.ui.main.home.viewHolders.HomeDoctorViewHolder
import com.sec.doctorapp.ui.main.home.viewHolders.HomeTitleViewHolder

class HomeAdapter(
    var items: ArrayList<HomeUiItem>,
    var onItemClicked: (item: HomeUiItem) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            HomeUiItem.HomeBannerItem::class.java.hashCode() -> {
                HomeBannerViewHolder(
                    CellHomeBannerBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }

            HomeUiItem.HomeTitleItem::class.java.hashCode() -> {
                HomeTitleViewHolder(
                    CellHomeTitleBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }

            HomeUiItem.HomeCategoryItem::class.java.hashCode() -> {
                HomeCategoryViewHolder(
                    CellHomeCategoryBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }

            HomeUiItem.HomeDoctorItem::class.java.hashCode() -> {
                HomeDoctorViewHolder(
                    CellHomeDoctorBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }

            else -> throw UnsupportedOperationException("no view holder for the specified item")
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]
        when (holder) {
            is HomeBannerViewHolder -> {
                holder.bind(item as HomeUiItem.HomeBannerItem)
            }

            is HomeTitleViewHolder -> {
                holder.bind(item as HomeUiItem.HomeTitleItem)
                holder.binding.textViewAction.setOnClickListener {
                    onItemClicked(item)
                }
            }

            is HomeCategoryViewHolder -> {
                holder.bind(item as HomeUiItem.HomeCategoryItem)
            }

            is HomeDoctorViewHolder -> {
                holder.bind(item as HomeUiItem.HomeDoctorItem)
                holder.binding.bookBtn.setOnClickListener {
                    onItemClicked(item)
                }
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return items[position]::class.java.hashCode()
    }

}