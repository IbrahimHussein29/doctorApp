package com.sec.doctorapp.ui.main.messages

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.databinding.CellDoctorMessagesBinding
import com.sec.doctorapp.databinding.CellMessagesTitleBinding
import com.sec.doctorapp.databinding.CellOnlineDoctorsBinding
import com.sec.doctorapp.ui.main.home.items.HomeUiItem
import com.sec.doctorapp.ui.main.home.viewHolders.HomeBannerViewHolder
import com.sec.doctorapp.ui.main.messages.items.MessagesUiItem
import com.sec.doctorapp.ui.main.messages.vewHolders.DoctorMessagesVH
import com.sec.doctorapp.ui.main.messages.vewHolders.MessagesTitleVH
import com.sec.doctorapp.ui.main.messages.vewHolders.OnlineVH

class MessagesAdapter( var items: ArrayList<MessagesUiItem>,
var onItemClicked: (item: MessagesUiItem) -> Unit
) : RecyclerView.Adapter<RecyclerView.ViewHolder>()  {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            MessagesUiItem.MessagesTitle::class.java.hashCode() -> {
                MessagesTitleVH(
                    CellMessagesTitleBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }

            MessagesUiItem.OnlineDoctor::class.java.hashCode() -> {
                OnlineVH(
                    CellOnlineDoctorsBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }

            MessagesUiItem.DoctorMessages::class.java.hashCode() -> {
                DoctorMessagesVH(
                    CellDoctorMessagesBinding.inflate(
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
            is MessagesTitleVH -> {
                holder.bind(item as MessagesUiItem.MessagesTitle)
            }

            is OnlineVH ->{
                holder.bind(item as MessagesUiItem.OnlineDoctor)
            }
            is DoctorMessagesVH ->{
                holder.bind(item as MessagesUiItem.DoctorMessages)
                holder.binding.messagesRecyclerView.setOnClickListener(){
                    onItemClicked(item)
                }
            }
        }

    }

    override fun getItemViewType(position: Int): Int {
    return items[position]::class.java.hashCode()
    }
}