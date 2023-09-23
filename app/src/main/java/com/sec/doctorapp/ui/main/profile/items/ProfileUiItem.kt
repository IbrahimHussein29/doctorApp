package com.sec.doctorapp.ui.main.profile.items

import com.sec.doctorapp.R
import java.io.Serializable

sealed class ProfileUiItem : Serializable{
    data class ItemUi(
        val itemImg:Int,
        val item:String,
        val navigateImg:Int= R.drawable.ic_forward,
        val action:String
    ):ProfileUiItem()

    companion object {
        const val ACTION_HISTORY = "action_history"
        const val ACTION_PERSONAL_DETAILS = "action_personal_details"
        const val ACTION_LOCATION = "action_location"
        const val ACTION_PAYMENT_METHOD = "action_payment_method"
        const val ACTION_SETTINGS = "action_settings"
        const val ACTION_HELP= "action_help"
        const val ACTION_lOG_OUT = "action_logout"

    }
}
