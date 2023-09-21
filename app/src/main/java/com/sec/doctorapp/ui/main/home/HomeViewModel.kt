package com.sec.doctorapp.ui.main.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sec.doctorapp.R
import com.sec.doctorapp.ui.main.appointment.doctorCard.items.DoctorUiItem
import com.sec.doctorapp.ui.main.home.homeViewPager.items.HomeSliderUiItem
import com.sec.doctorapp.ui.main.home.items.HomeUiItem

class HomeViewModel : ViewModel() {
    private var _homeUiData = MutableLiveData<ArrayList<HomeUiItem>>()
    val homeUiData: LiveData<ArrayList<HomeUiItem>> = _homeUiData


    fun generateHomeUiItems() {
        val items = arrayListOf<HomeUiItem>()
        // banners
        items.add(
            HomeUiItem.HomeBannerItem(generateSliderDummyData())
        )
        // category title
        items.add(
            HomeUiItem.HomeTitleItem(
                title = "Categories",
                action = HomeUiItem.ACTION_CATEGORIES
            )
        )

        // categories

        items.add(
            HomeUiItem.HomeCategoryItem(generateDummyCategoriesData())
        )
        // doctor title
        items.add(
            HomeUiItem.HomeTitleItem(
                title = "Doctors",
                action = HomeUiItem.ACTION_DOCTORS
            )
        )
        // doctor item
        items.add(
            HomeUiItem.HomeDoctorItem(
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

        _homeUiData.value = items
    }

    private fun generateSliderDummyData(): ArrayList<HomeSliderUiItem> {
        return arrayListOf(
            HomeSliderUiItem(
                drImg = R.drawable.home_card_img,
                drDescription = "Yorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc vulputate libero et velit interdum, ac aliquet odio mattis"
            ),
            HomeSliderUiItem(
                drImg = R.drawable.doctor1,
                drDescription = " Sit fusce ligula diam Neque vel volutpat.Vel. Facilisi aenean."
            ),
            HomeSliderUiItem(
                drImg = R.drawable.doctor2,
                drDescription = "Cum diam dignissim tortorFringilla pretium nunc.Suscipit id tortor"
            ),
            HomeSliderUiItem(
                drImg = R.drawable.home_card_img,
                drDescription = "Cum diam dignissim tortorFringilla pretium nunc.Suscipit id tortor"
            )
        )
    }

    private fun generateDummyCategoriesData(): ArrayList<String> {
        return arrayListOf(
            "Denteeth",
            "Therapist",
            "surgeon",
            "Dermatologist",
            "Pathologist"
        )
    }
}