package com.sec.doctorapp.ui.main.appointment.doctorCard.items

import java.io.Serializable

data class DoctorUiItem(
    val doctorImg:Int,
    val doctorName:String,
    val doctorCategory:String,
    val appointmentPrice:String,
    val doctorDescription:String,
    val doctorDetailsDescription:String,
    val isFavoriteDoctor:Boolean=false,
    val doctorRating:String

):Serializable
