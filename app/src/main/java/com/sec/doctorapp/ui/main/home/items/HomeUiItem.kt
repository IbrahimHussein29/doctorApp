package com.sec.doctorapp.ui.main.home.items

import com.sec.doctorapp.ui.main.appointment.doctorCard.items.DoctorUiItem
import com.sec.doctorapp.ui.main.home.homeViewPager.items.HomeSliderUiItem
import java.io.Serializable

sealed class HomeUiItem : Serializable {

    // Banner
    data class HomeBannerItem(
        val bannerList: ArrayList<HomeSliderUiItem>
    ) : HomeUiItem()

    data class HomeTitleItem(val title: String, val action: String = ACTION_CATEGORIES) :
        HomeUiItem()

    data class HomeCategoryItem(val categoryList: ArrayList<String>) : HomeUiItem()

    data class HomeDoctorItem(val item: DoctorUiItem) : HomeUiItem()
    companion object {
        const val ACTION_CATEGORIES = "action_categories"
        const val ACTION_DOCTORS = "action_doctors"
    }
}
