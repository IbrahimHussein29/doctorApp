package com.sec.doctorapp.ui.main.appointment.details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sec.doctorapp.ui.main.appointment.details.date.items.DateUiItem
import com.sec.doctorapp.ui.main.appointment.details.time.items.TimeUiItem

class AppointmentDetailsViewModel:ViewModel() {
    private var _dateData= MutableLiveData<ArrayList<DateUiItem>>()
    val dateData: LiveData<ArrayList<DateUiItem>> = _dateData
    private var _timeData= MutableLiveData<ArrayList<TimeUiItem>>()
    val timeData: LiveData<ArrayList<TimeUiItem>> = _timeData

    fun generateDummyDateData(){
        val items= arrayListOf<DateUiItem>(
            DateUiItem(date = "Sun 4"
            ),
            DateUiItem(date = "Mon 5"
            ),
            DateUiItem(date = "Tus 6"
            ),
            DateUiItem(date = "Wed 7"
            ),
            DateUiItem(date = "Thur 8"
            )

        )
        _dateData.value=items
    }

    fun generateDummyTimeData(){
        val items= arrayListOf<TimeUiItem>(
            TimeUiItem(time = "10.00 AM"),
            TimeUiItem(time = "11.00 AM"),
            TimeUiItem(time = "12.00 PM"),
            TimeUiItem(time = "13.00 PM"),
            TimeUiItem(time = "14.00 PM"),

        )
        _timeData.value=items
    }
}

