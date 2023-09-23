package com.sec.doctorapp.ui.main.profile

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.sec.doctorapp.R
import com.sec.doctorapp.databinding.FragmentProfileBinding
import com.sec.doctorapp.ui.auth.AuthActivity
import com.sec.doctorapp.ui.main.home.items.HomeUiItem
import com.sec.doctorapp.ui.main.profile.items.ProfileUiItem


class ProfileFragment : Fragment() {

    private lateinit var binding: FragmentProfileBinding
    private lateinit var profileViewModel: ProfileViewModel
    private val profileAdapter by lazy {
        ProfileAdapter(arrayListOf()){
            handleItemClicked(it)
        }
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(layoutInflater)
        profileViewModel=ViewModelProvider(this)[ProfileViewModel::class.java]

        callData()
        observeData()
        bindData()

        return binding.root
    }

    private fun bindData() {
        binding.notificationRecyclerView.adapter=profileAdapter
        binding.backVector.setOnClickListener {
            findNavController().popBackStack()
        }
    }


    private fun observeData() {

        profileViewModel.profileData.observe(viewLifecycleOwner){
                profileAdapter.items=it
            profileAdapter.notifyDataSetChanged()
        }
    }

    private fun callData() {
        profileViewModel.generateProfileData()
    }

    private fun handleItemClicked(item: ProfileUiItem) {
        when (item) {
            is ProfileUiItem.ItemUi -> {
                handleNavigateClick(item)
            }

        }
    }
    private fun handleNavigateClick(item: ProfileUiItem.ItemUi) {
        if (item.action == ProfileUiItem.ACTION_HISTORY) {
            findNavController().navigate(R.id.action_profileFragment_to_profileHistoryFragment)
        }

        if (item.action == ProfileUiItem.ACTION_PERSONAL_DETAILS) {
            findNavController().navigate(R.id.action_profileFragment_to_profilePersonalDetailsFragment)

        }
        if (item.action == ProfileUiItem.ACTION_LOCATION) {
            findNavController().navigate(R.id.action_profileFragment_to_profileLocationFragment)
        }
        if (item.action == ProfileUiItem.ACTION_PAYMENT_METHOD) {
            findNavController().navigate(R.id.action_profileFragment_to_profilePaymentMethodFragment)
        }
        if (item.action == ProfileUiItem.ACTION_SETTINGS) {
            findNavController().navigate(R.id.action_profileFragment_to_profileSettingsFragment)
        }
        if (item.action == ProfileUiItem.ACTION_HELP) {
            findNavController().navigate(R.id.action_profileFragment_to_profileHelpFragment)

        }
        if (item.action == ProfileUiItem.ACTION_lOG_OUT) {
            startActivity(Intent(requireActivity(), AuthActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            })
            requireActivity().finish()

        }
    }





}

