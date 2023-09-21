package com.sec.doctorapp.ui.main.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sec.doctorapp.R
import com.sec.doctorapp.ui.main.home.categories.items.CategoriesUiItem
import com.sec.doctorapp.ui.main.home.homeViewPager.items.HomeSliderUiItem

class HomeViewModel : ViewModel() {
   private var _sliderData = MutableLiveData<ArrayList<HomeSliderUiItem>>()
    val sliderData: LiveData<ArrayList<HomeSliderUiItem>> = _sliderData

    private var _categoryData = MutableLiveData<ArrayList<CategoriesUiItem>>()
    val categoryData: LiveData<ArrayList<CategoriesUiItem>> = _categoryData

    fun generateSliderDummyData() {
        val items = arrayListOf<HomeSliderUiItem>(
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
        _sliderData.value=items


    }


    fun generateDummyCategoriesData(){
        val items= arrayListOf<CategoriesUiItem>(
            CategoriesUiItem(
                category = "Denteeth"
            ),
            CategoriesUiItem(
                category = "Therapist"
            ),
            CategoriesUiItem(
                category = "surgeon"
            ),
            CategoriesUiItem(
                category = "Dermatologist"
            ),
            CategoriesUiItem(
                category = "Pathologist"
            )

        )
        _categoryData.value=items

    }
}