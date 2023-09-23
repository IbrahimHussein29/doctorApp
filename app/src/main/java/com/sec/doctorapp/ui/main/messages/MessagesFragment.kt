package com.sec.doctorapp.ui.main.messages

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf

import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.sec.doctorapp.R

import com.sec.doctorapp.databinding.FragmentMessagesBinding

import com.sec.doctorapp.ui.main.messages.items.MessagesUiItem


class MessagesFragment : Fragment() {

    private lateinit var binding: FragmentMessagesBinding
    private lateinit var messagesViewModel: MessagesViewModel

    private val messagesAdapter by lazy {
        MessagesAdapter(arrayListOf()) {
            openMessageDetailsScreen(it)
        }

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMessagesBinding.inflate(layoutInflater)
        messagesViewModel = ViewModelProvider(this)[MessagesViewModel::class.java]

        callData()
        observeData()
        bindData()

        return binding.root
    }

    private fun bindData() {
        binding.backVector.setOnClickListener() {
            findNavController().popBackStack()
        }
    }

    private fun observeData() {
        binding.recyclerView.adapter = messagesAdapter

        messagesViewModel.messagesData.observe(viewLifecycleOwner) {
            messagesAdapter.items = it
            messagesAdapter.notifyDataSetChanged()
        }
    }

    private fun callData() {

        messagesViewModel.generateMessagesData()


    }

    private fun openMessageDetailsScreen(item: MessagesUiItem) {
       when (item){
           is MessagesUiItem.DoctorMessages->{
               openBookScreen(item)
           }
           else -> {}
       }
    }

    private fun openBookScreen(item: MessagesUiItem.DoctorMessages) {
        findNavController().navigate(
            R.id.action_homeFragment_to_appointmentDetailsFragment,
            bundleOf("item" to item)
        )
    }


}