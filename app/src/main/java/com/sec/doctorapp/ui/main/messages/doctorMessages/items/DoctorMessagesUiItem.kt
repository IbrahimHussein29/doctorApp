package com.sec.doctorapp.ui.main.messages.doctorMessages.items

import java.io.Serializable

data class DoctorMessagesUiItem(
    val doctorImg:Int,
    val doctorName:String,
    val messageTime: String,

    val message: String,
    val messageNumber:String="0",
    val isUnreadableMessage:Boolean=false
):Serializable
