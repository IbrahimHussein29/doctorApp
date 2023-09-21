package com.sec.doctorapp.ui.main.messages

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sec.doctorapp.R
import com.sec.doctorapp.ui.main.messages.doctorMessages.items.DoctorMessagesUiItem
import com.sec.doctorapp.ui.main.messages.onlineDoctors.items.OnlineDoctorsUiItem

class MessagesViewModel:ViewModel() {
    private var _doctorMessagesData = MutableLiveData<ArrayList<DoctorMessagesUiItem>>()
    val doctorMessagesData: LiveData<ArrayList<DoctorMessagesUiItem>> = _doctorMessagesData

    private var _onlineDoctorData = MutableLiveData<ArrayList<OnlineDoctorsUiItem>>()
    val onlineDoctorData: LiveData<ArrayList<OnlineDoctorsUiItem>> = _onlineDoctorData

    fun generateDummyDoctorMessagesData(){
        val items= arrayListOf<DoctorMessagesUiItem>(
            DoctorMessagesUiItem(
                doctorImg = R.drawable.online_dr_1,
                doctorName = "Dr.Upul",
                messageTime = "12.50",
                message = "Worem consectetur adipiscing elit.",
                isUnreadableMessage = true,
                messageNumber = "2"
            ),
            DoctorMessagesUiItem(
                doctorImg = R.drawable.online_dr_2,
                doctorName = "Dr.Sliva",
                messageTime = "12.50",
                message = "Worem consectetur adipiscing elit.",
                isUnreadableMessage = true,
                messageNumber = "2"
            ),
            DoctorMessagesUiItem(
                doctorImg = R.drawable.online_dr_3,
                doctorName = "Dr.Pawani",
                messageTime = "12.50",
                message = "Worem consectetur adipiscing elit.",

            ),
            DoctorMessagesUiItem(
                doctorImg = R.drawable.online_dr_4,
                doctorName = "Dr.Rayan",
                messageTime = "12.50",
                message = "Worem consectetur adipiscing elit.",

            ),
            DoctorMessagesUiItem(
                doctorImg = R.drawable.online_dr_5,
                doctorName = "Dr.Upul",
                messageTime = "12.50",
                message = "Worem consectetur adipiscing elit.",

            ),
            DoctorMessagesUiItem(
                doctorImg = R.drawable.online_dr_1,
                doctorName = "Dr.Rayan",
                messageTime = "12.50",
                message = "Worem consectetur adipiscing elit.",



        )
        )
        _doctorMessagesData.value=items
    }



    fun generateDummyOnlineDoctorsData(){
        val items= arrayListOf<OnlineDoctorsUiItem>(
            OnlineDoctorsUiItem(
                doctorImg = R.drawable.online_dr_1

            ),
            OnlineDoctorsUiItem(
                doctorImg = R.drawable.online_dr_2

            ),
            OnlineDoctorsUiItem(
                doctorImg = R.drawable.online_dr_3

            ),
            OnlineDoctorsUiItem(
                doctorImg = R.drawable.online_dr_4,
                isOnline = false

            ),
            OnlineDoctorsUiItem(
                doctorImg = R.drawable.online_dr_5,
                isOnline = false
            )

        )
        _onlineDoctorData.value=items
    }
}