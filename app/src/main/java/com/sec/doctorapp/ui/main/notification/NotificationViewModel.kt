package com.sec.doctorapp.ui.main.notification

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sec.doctorapp.ui.main.home.homeViewPager.items.HomeSliderUiItem
import com.sec.doctorapp.ui.main.notification.items.NotificationUiItem

class NotificationViewModel:ViewModel() {
    private var _notificationData = MutableLiveData<ArrayList<NotificationUiItem>>()
    val notifcationData: LiveData<ArrayList<NotificationUiItem>> = _notificationData


    fun generateDummyNotificationsData(){
        val items= arrayListOf<NotificationUiItem>(
            NotificationUiItem(
                date = "APRIL 2023",
                time = "15 MIN",
                description = "Corem ipsum dolor sit amet,adipiscing elit."
            ),
            NotificationUiItem(
                date = "APRIL 2023",
                time = "17 MIN",
                description = "Corem ipsum dolor sit amet,adipiscing elit."
            ),
            NotificationUiItem(
                date = "APRIL 2023",
                time = "19 MIN",
                description = "Corem ipsum dolor sit amet,adipiscing elit."
            ),
            NotificationUiItem(
                date = "APRIL 2023",
                time = "20 MIN",
                description = "Corem ipsum dolor sit amet,adipiscing elit."
            ),
            NotificationUiItem(
                date = "APRIL 2023",
                time = "22 MIN",
                description = "Corem ipsum dolor sit amet,adipiscing elit."
            ), NotificationUiItem(
                date = "APRIL 2023",
                time = "25 MIN",
                description = "Corem ipsum dolor sit amet,adipiscing elit."
            ), NotificationUiItem(
                date = "APRIL 2023",
                time = "37 MIN",
                description = "Corem ipsum dolor sit amet,adipiscing elit."
            ), NotificationUiItem(
                date = "APRIL 2023",
                time = "48 MIN",
                description = "Corem ipsum dolor sit amet,adipiscing elit."
            ), NotificationUiItem(
                date = "APRIL 2023",
                time = "51 MIN",
                description = "Corem ipsum dolor sit amet,adipiscing elit."
            ), NotificationUiItem(
                date = "APRIL 2023",
                time = "53 MIN",
                description = "Corem ipsum dolor sit amet,adipiscing elit."
            ), NotificationUiItem(
                date = "APRIL 2023",
                time = "55 MIN",
                description = "Corem ipsum dolor sit amet,adipiscing elit."
            ), NotificationUiItem(
                date = "APRIL 2023",
                time = "58 MIN",
                description = "Corem ipsum dolor sit amet,adipiscing elit."
            )


        )
        _notificationData.value=items

    }
}