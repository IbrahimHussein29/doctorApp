package com.sec.doctorapp.ui.main.appointment.details.items

import com.sec.doctorapp.ui.main.appointment.doctorCard.items.DoctorUiItem
import com.sec.doctorapp.ui.main.home.items.HomeUiItem
import java.io.Serializable

sealed class AppointmentDetailsUiItem: Serializable {
    data class DoctorDetails(val item: DoctorUiItem): AppointmentDetailsUiItem()
    data class AppointmentTitleItem(val title: String, val action: String = ACTION_WORKING_HOURS) : AppointmentDetailsUiItem()

    data class TimeItem(val time:ArrayList<String>): AppointmentDetailsUiItem()
    data class DateItem(val date:ArrayList<String>): AppointmentDetailsUiItem()

    companion object {
        const val ACTION_WORKING_HOURS = "action_working_hours"
        const val ACTION_Date = "action_date"
    }
}
