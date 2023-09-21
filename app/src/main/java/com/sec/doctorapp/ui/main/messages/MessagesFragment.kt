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
import com.sec.doctorapp.ui.main.messages.doctorMessages.DoctorMessagesAdapter
import com.sec.doctorapp.ui.main.messages.doctorMessages.items.DoctorMessagesUiItem
import com.sec.doctorapp.ui.main.messages.onlineDoctors.OnlineDoctorsAdapter
import com.sec.doctorapp.ui.main.messages.onlineDoctors.OnlineDoctorsViewModel


class MessagesFragment : Fragment() {

private lateinit var binding:FragmentMessagesBinding
private lateinit var messagesViewModel: MessagesViewModel

private val onlineAdapter by lazy {
    OnlineDoctorsAdapter(arrayListOf())

}
    private val doctorMessagesAdapter by lazy {
        DoctorMessagesAdapter(arrayListOf()){
            openMessageDetailsScreen(it)
        }

    }


    private fun openMessageDetailsScreen(it: DoctorMessagesUiItem) {
        val bundle= bundleOf("name" to it.doctorName, "msg" to it.message)
        findNavController().navigate(R.id.action_messagesFragment_to_messageDetailsFragment, bundle)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding= FragmentMessagesBinding.inflate(layoutInflater)
        messagesViewModel=ViewModelProvider(this)[MessagesViewModel::class.java]

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
        binding.onlineDrRecyclerView.adapter=onlineAdapter
        binding.messagesRecyclerView.adapter=doctorMessagesAdapter

        messagesViewModel.onlineDoctorData.observe(viewLifecycleOwner){
            onlineAdapter.items=it
           onlineAdapter.notifyDataSetChanged()
        }
       messagesViewModel.doctorMessagesData.observe(viewLifecycleOwner){
            doctorMessagesAdapter.items=it
            doctorMessagesAdapter.notifyDataSetChanged()
        }
    }

    private fun callData() {

      messagesViewModel.generateDummyDoctorMessagesData()
        messagesViewModel.generateDummyOnlineDoctorsData()

    }


}