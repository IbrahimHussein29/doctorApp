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
import com.sec.doctorapp.ui.main.home.items.HomeUiItem


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var homeViewModel: HomeViewModel


    private val homeAdapter by lazy {
        HomeAdapter(arrayListOf()) {
            handleItemClicked(it)
        }
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


    private fun bindData() {
        binding.recyclerView.adapter = homeAdapter
        binding.btnNotification.setOnClickListener() {
            findNavController().navigate(R.id.action_homeFragment_to_notificationFragment)
        }


    }

    private fun observeData() {
        homeViewModel.homeUiData.observe(viewLifecycleOwner) {
            homeAdapter.items = it
            homeAdapter.notifyDataSetChanged()
        }
    }

    private fun callData() {
        homeViewModel.generateHomeUiItems()
    }

    private fun handleItemClicked(item: HomeUiItem) {
        when (item) {
            is HomeUiItem.HomeTitleItem -> {
                handleSeeAllClick(item)
            }

            is HomeUiItem.HomeDoctorItem -> {
                openBookScreen(item)
            }
            else -> {}
        }
    }

    private fun openBookScreen(item: HomeUiItem.HomeDoctorItem) {
        findNavController().navigate(
            R.id.action_homeFragment_to_appointmentDetailsFragment,
            bundleOf("item" to item.item)
        )
    }

    private fun handleSeeAllClick(item: HomeUiItem.HomeTitleItem) {
        if (item.action == HomeUiItem.ACTION_DOCTORS) {
            findNavController().navigate(R.id.action_homeFragment_to_appointmentFragment)
        }
    }
}