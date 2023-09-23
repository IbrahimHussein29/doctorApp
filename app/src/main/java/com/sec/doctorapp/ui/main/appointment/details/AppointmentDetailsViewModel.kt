package com.sec.doctorapp.ui.main.appointment.details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sec.doctorapp.R
import com.sec.doctorapp.ui.main.appointment.details.items.AppointmentDetailsUiItem
import com.sec.doctorapp.ui.main.appointment.doctorCard.items.DoctorUiItem


class AppointmentDetailsViewModel:ViewModel() {
    private var _appointmentDetailsData= MutableLiveData<ArrayList<AppointmentDetailsUiItem>>()
    val appointmentDetailsData: LiveData<ArrayList<AppointmentDetailsUiItem>> = _appointmentDetailsData


    fun generateAppointmentDetailsData(){
        val items= arrayListOf<AppointmentDetailsUiItem>()

        items.add(
            AppointmentDetailsUiItem.DoctorDetails(
                DoctorUiItem(
                    doctorName = "Huzayfa",
                    doctorCategory = "Therapist",
                    doctorDescription = "Sit fusce ligula diam Neque vel volutpat.Vel. Facilisi aenean.",
                    appointmentPrice = "$120.00",
                    doctorImg = R.drawable.doctor1,
                    doctorDetailsDescription = "Worem ipsum dolor sit amet, consectetur adipiscing elit. Nunc vulputate libero et velit interdum, ac aliquet odio mattis. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Curabitur tempus urna at turpis condimentum lobortis. Ut commodo efficitur neque. Ut diam quam, semper iaculis condimentum ac, ves",
                    doctorRating = "5.0",
                    isFavoriteDoctor = true
                )
            )
        )
        items.add(
            AppointmentDetailsUiItem.AppointmentTitleItem(
                title = "Working Hours",
                action = AppointmentDetailsUiItem.ACTION_WORKING_HOURS
            )

        )
        items.add(
            AppointmentDetailsUiItem.TimeItem(generateTimeData())
        )
        items.add(
            AppointmentDetailsUiItem.AppointmentTitleItem(
                title = "Date",
                action = AppointmentDetailsUiItem.ACTION_Date
            )
        )
        items.add(
            AppointmentDetailsUiItem.DateItem(generateDateData())
        )
        _appointmentDetailsData.value=items

    }
   private fun generateDateData(): ArrayList<String>{
      return   arrayListOf<String>(
       "Sun 4", "Mon 5", "Tus 6","Wed 7", "Thu 8")

    }

    private fun generateTimeData() : ArrayList<String>{
     return arrayListOf<String>(
           "10.00 AM", "11.00 AM", "12.00 PM", "13.00 PM", "14.00 PM")
    }
}

