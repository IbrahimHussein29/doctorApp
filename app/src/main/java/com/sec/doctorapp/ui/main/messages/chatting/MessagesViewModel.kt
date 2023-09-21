package com.sec.doctorapp.ui.main.messages.chatting

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sec.doctorapp.ui.main.messages.chatting.items.MessagesUiItem
import com.sec.doctorapp.ui.main.messages.onlineDoctors.items.OnlineDoctorsUiItem

class MessagesViewModel:ViewModel() {
    private var _messages = MutableLiveData<ArrayList<MessagesUiItem>>()
    val messages: LiveData<ArrayList<MessagesUiItem>> = _messages
    fun generateDummyChattingData(){
        val items= arrayListOf<MessagesUiItem>(
            MessagesUiItem( drMessage = "Rorem ipsum dolor sit  adipiscing elit.",
                userMessage = "Rorem ipsum dolor sit  adipiscing elit."
            ),
            MessagesUiItem( drMessage = "Rorem ipsum dolor sit  adipiscing elit.",
                userMessage = "Rorem ipsum dolor sit  adipiscing elit."
            ),
            MessagesUiItem(
                userMessage = "Rorem ipsum dolor sit  adipiscing elit."
            ),
            MessagesUiItem( drMessage = "Rorem ipsum dolor sit  adipiscing elit.",
                userMessage = "Rorem ipsum dolor sit  adipiscing elit."
            ),
            MessagesUiItem( drMessage = "Rorem ipsum dolor sit  adipiscing elit.",
            )

        )
        _messages.value=items
    }
}