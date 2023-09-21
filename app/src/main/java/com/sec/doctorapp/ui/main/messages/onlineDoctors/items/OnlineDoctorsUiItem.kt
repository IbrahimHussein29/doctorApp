package com.sec.doctorapp.ui.main.messages.onlineDoctors.items

import java.io.Serializable

data class OnlineDoctorsUiItem(
    val doctorImg:Int,
    val isOnline:Boolean=true

):Serializable
