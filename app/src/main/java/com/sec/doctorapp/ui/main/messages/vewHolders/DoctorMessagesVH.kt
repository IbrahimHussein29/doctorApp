package com.sec.doctorapp.ui.main.messages.vewHolders

import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.databinding.CellDoctorMessagesBinding
import com.sec.doctorapp.databinding.CellHomeBannerBinding
import com.sec.doctorapp.databinding.CellOnlineDoctorsBinding
import com.sec.doctorapp.databinding.MessageActiveDrSliderBinding
import com.sec.doctorapp.ui.main.home.homeViewPager.HomeViewPagerAdapter
import com.sec.doctorapp.ui.main.home.items.HomeUiItem
import com.sec.doctorapp.ui.main.messages.doctorMessages.DoctorMessagesAdapter
import com.sec.doctorapp.ui.main.messages.items.MessagesUiItem
import com.sec.doctorapp.ui.main.messages.onlineDoctors.OnlineDoctorsAdapter

class DoctorMessagesVH(val binding: CellDoctorMessagesBinding) :
    RecyclerView.ViewHolder(binding.root) {

    private val messagesAdapter by lazy {
      DoctorMessagesAdapter(arrayListOf())
    }

    fun bind(item: MessagesUiItem.DoctorMessages) {
      messagesAdapter.items = item.doctorMessages
        binding.messagesRecyclerView.adapter=messagesAdapter

    }
}