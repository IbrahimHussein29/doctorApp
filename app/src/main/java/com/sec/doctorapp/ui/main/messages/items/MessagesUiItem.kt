package com.sec.doctorapp.ui.main.messages.items

import com.sec.doctorapp.ui.main.messages.doctorMessages.items.DoctorMessagesUiItem
import com.sec.doctorapp.ui.main.messages.onlineDoctors.items.OnlineDoctorsUiItem
import java.io.Serializable

sealed class MessagesUiItem :Serializable{
    data class OnlineDoctor(val onlineDoctors:ArrayList<OnlineDoctorsUiItem>):MessagesUiItem()
    data class MessagesTitle(val title: String):MessagesUiItem()
    data class DoctorMessages(val doctorMessages:ArrayList<DoctorMessagesUiItem>):MessagesUiItem()

}
