package com.sec.doctorapp.ui.main.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf

import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController


import com.sec.doctorapp.R

import com.sec.doctorapp.databinding.FragmentHomeBinding
import com.sec.doctorapp.ui.main.home.categories.CategoriesAdapter
import com.sec.doctorapp.ui.main.home.homeViewPager.HomeViewPagerAdapter


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var homeViewModel: HomeViewModel

    private val viewPagerAdapter by lazy {
        HomeViewPagerAdapter(arrayListOf())
    }
    private val categoriesAdapter by lazy{
        CategoriesAdapter(arrayListOf())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        homeViewModel = ViewModelProvider(this)[HomeViewModel::class.java]

        callData()
        observeData()
        bindData()

        return binding.root

    }


    private fun doctorCardBinding() {
        val name = getString(R.string.dr_pawan)
        val details = getString(R.string.jorem_ipsum)
        val price="$120.00"
        val category="Denteeth"
        binding.doctorNameText.text = name
        binding.doctorDescriptionText.text = details
      binding.doctorImageView.setImageResource(R.drawable.doctor1)

        val bundle= bundleOf( "name" to name, "category" to category,"price" to price, "details" to details )
        binding.bookBtn.setOnClickListener() {
            findNavController().navigate(R.id.action_homeFragment_to_appointmentDetailsFragment, bundle)
        }

    }

    private fun bindData() {
        val viewpager = binding.viewPager
        val dotsIndicator = binding.wormDotsIndicator
        dotsIndicator.attachTo(viewpager)
        binding.allDoctorsSeeAll.setOnClickListener() {
            findNavController().navigate(R.id.action_homeFragment_to_appointmentFragment)
        }
        binding.btnNotification.setOnClickListener(){
            findNavController().navigate(R.id.action_homeFragment_to_notificationFragment)
        }

        doctorCardBinding()

    }

    private fun observeData() {
        binding.viewPager.adapter = viewPagerAdapter
        binding.categoriesRecyclerView.adapter=categoriesAdapter
        homeViewModel.sliderData.observe(viewLifecycleOwner) {
            viewPagerAdapter.items = it
            viewPagerAdapter.notifyDataSetChanged()

        }
        homeViewModel.categoryData.observe(viewLifecycleOwner){
            categoriesAdapter.items=it
            categoriesAdapter.notifyDataSetChanged()
        }
    }

    private fun callData() {
        homeViewModel.generateSliderDummyData()
        homeViewModel.generateDummyCategoriesData()
    }


}