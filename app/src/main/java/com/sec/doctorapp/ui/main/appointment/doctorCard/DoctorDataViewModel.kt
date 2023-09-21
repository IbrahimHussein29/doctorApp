package com.sec.doctorapp.ui.main.appointment.doctorCard

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sec.doctorapp.R
import com.sec.doctorapp.ui.main.appointment.doctorCard.items.DoctorUiItem

class DoctorDataViewModel:ViewModel() {
   private var _doctorData= MutableLiveData<ArrayList<DoctorUiItem>>()
    val doctorData:LiveData<ArrayList<DoctorUiItem>> = _doctorData

    fun generateDoctorDummyData(){
        val items= arrayListOf<DoctorUiItem>(
            DoctorUiItem(
                doctorImg = R.drawable.doctor1,
                doctorName = "Dr.Pawn",
                doctorDescription = "Jorem ipsum dolor, consectetur adipiscing elit. Nunc v libero et velit interdum, ac  mattis.",
                doctorDetailsDescription = "Worem ipsum dolor sit amet, consectetur adipiscing elit. Nunc vulputate libero et velit interdum, ac aliquet odio mattis. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Curabitur tempus urna at turpis condimentum lobortis. Ut commodo efficitur neque. Ut diam quam, semper iaculis condimentum ac, ves",
                doctorRating = "5.0",
                isFavoriteDoctor = false,
                doctorCategory = "Denteeth",
                appointmentPrice = "$120.00"


            ),
            DoctorUiItem(
                doctorImg = R.drawable.doctor1,
                doctorName = "Dr.Wanitha",
                doctorDescription = "Jorem ipsum dolor, consectetur adipiscing elit. Nunc v libero et velit interdum, ac  mattis.",
                doctorDetailsDescription = "Worem ipsum dolor sit amet, consectetur adipiscing elit. Nunc vulputate libero et velit interdum, ac aliquet odio mattis. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Curabitur tempus urna at turpis condimentum lobortis. Ut commodo efficitur neque. Ut diam quam, semper iaculis condimentum ac, ves",
                doctorRating = "5.0",
                isFavoriteDoctor = true,
                doctorCategory = "Denteeth",
                appointmentPrice = "$120.00"


            ),
            DoctorUiItem(
                doctorImg = R.drawable.doctor2,
                doctorName = "Dr.Upul",
                doctorDescription = "Jorem ipsum dolor, consectetur adipiscing elit. Nunc v libero et velit interdum, ac  mattis.",
             doctorDetailsDescription = "Worem ipsum dolor sit amet, consectetur adipiscing elit. Nunc vulputate libero et velit interdum, ac aliquet odio mattis. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Curabitur tempus urna at turpis condimentum lobortis. Ut commodo efficitur neque. Ut diam quam, semper iaculis condimentum ac, ves",
                doctorRating = "5.0",
                isFavoriteDoctor = false,
                doctorCategory = "Denteeth",
                appointmentPrice = "$120.00"


            ),
            DoctorUiItem(
                doctorImg = R.drawable.doctor1,
                doctorName = "Dr.Pawn",
                doctorDescription = "Jorem ipsum dolor, consectetur adipiscing elit. Nunc v libero et velit interdum, ac  mattis.",
                doctorDetailsDescription = "Worem ipsum dolor sit amet, consectetur adipiscing elit. Nunc vulputate libero et velit interdum, ac aliquet odio mattis. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Curabitur tempus urna at turpis condimentum lobortis. Ut commodo efficitur neque. Ut diam quam, semper iaculis condimentum ac, ves",
                doctorRating = "5.0",
                isFavoriteDoctor = false,
                doctorCategory = "Denteeth",
                appointmentPrice = "$120.00"


            )

        )
        _doctorData.value=items

    }
}