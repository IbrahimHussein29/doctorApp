package com.sec.doctorapp.ui.main.notification

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.sec.doctorapp.databinding.FragmentNotificationBinding


class NotificationFragment : Fragment() {
    private lateinit var binding: FragmentNotificationBinding
    private lateinit var notificationViewModel: NotificationViewModel
    private val adapter by lazy {
        NotificationAdapter(arrayListOf())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNotificationBinding.inflate(layoutInflater)
        notificationViewModel=ViewModelProvider(this)[NotificationViewModel::class.java]

        callData()
        observeData()
        setClickableListeners()

        return binding.root
    }

    private fun setClickableListeners() {
        binding.backVector.setOnClickListener {
            findNavController().popBackStack()
        }
    }


    private fun observeData() {
        binding.notificationRecyclerView.adapter=adapter
        notificationViewModel.notifcationData.observe(viewLifecycleOwner){
            adapter.items=it
            adapter.notifyDataSetChanged()

        }
    }

    private fun callData() {
       notificationViewModel.generateDummyNotificationsData()
    }

}