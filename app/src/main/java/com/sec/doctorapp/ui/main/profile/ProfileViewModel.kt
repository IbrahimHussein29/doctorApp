package com.sec.doctorapp.ui.main.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sec.doctorapp.R
import com.sec.doctorapp.ui.main.home.items.HomeUiItem
import com.sec.doctorapp.ui.main.profile.items.ProfileUiItem

class ProfileViewModel(): ViewModel() {
    private var _profileData = MutableLiveData<ArrayList<ProfileUiItem>>()
    val profileData: LiveData<ArrayList<ProfileUiItem>> = _profileData




    fun generateProfileData(){
        val items= arrayListOf<ProfileUiItem>()
        items.add(ProfileUiItem.ItemUi(
            itemImg = R.drawable.ic_history,
            item = "History",
            action = ProfileUiItem.ACTION_HISTORY
        ))

        items.add(ProfileUiItem.ItemUi(
            itemImg = R.drawable.ic_profile_details,
            item = "Personal Details",
            action = ProfileUiItem.ACTION_PERSONAL_DETAILS
        ))

        items.add(ProfileUiItem.ItemUi(
            itemImg = R.drawable.ic_location,
            item = "Location",
            action = ProfileUiItem.ACTION_LOCATION
        ))
        items.add(ProfileUiItem.ItemUi(
            itemImg = R.drawable.ic_payment_method,
            item = "Payment Method",
            action = ProfileUiItem.ACTION_PAYMENT_METHOD
        ))
        items.add(ProfileUiItem.ItemUi(
            itemImg = R.drawable.ic_settings,
            item = "Settings",
            action = ProfileUiItem.ACTION_SETTINGS
        ))
        items.add(ProfileUiItem.ItemUi(
            itemImg = R.drawable.ic_help,
            item = "Help",
            action = ProfileUiItem.ACTION_HELP
        ))

        items.add(ProfileUiItem.ItemUi(
            itemImg = R.drawable.ic_log_out,
            item = "Logout",
            action = ProfileUiItem.ACTION_lOG_OUT,
            navigateImg = R.drawable.empty
        ))

_profileData.value=items

    }




}