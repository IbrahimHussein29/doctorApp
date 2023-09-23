package com.sec.doctorapp.ui.main.messages.chatting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.sec.doctorapp.R
import com.sec.doctorapp.databinding.FragmentMessageDetailsBinding
import com.sec.doctorapp.ui.main.appointment.doctorCard.items.DoctorUiItem


class MessageDetailsFragment : Fragment() {
private lateinit var binding:FragmentMessageDetailsBinding
private lateinit var messagesViewModel: MessagesViewModel
private val adapter by lazy {
    MessagesAdapter(arrayListOf())
}

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
      binding= FragmentMessageDetailsBinding.inflate(layoutInflater)
        messagesViewModel=ViewModelProvider(this)[MessagesViewModel::class.java]
        callData()
        observeData()
        bindData()
        setOnClickListeners()
        return binding.root
    }

    private fun setOnClickListeners() {
        binding.phoneCallImg.setOnClickListener(){
            findNavController().navigate(R.id.action_messageDetailsFragment_to_callingFragment)
        }
        binding.videoCallImg.setOnClickListener(){
            findNavController().navigate(R.id.action_messageDetailsFragment_to_videoCallFragment)
        }
    }

    private fun bindData() {
        binding.backVector.setOnClickListener() {
            findNavController().popBackStack()
        }
        binding.userMessageTextView.text=binding.messageInputText.text
        val doctorItem = requireArguments().getSerializable("item") as DoctorUiItem
        binding.drName.text=doctorItem.doctorName
        binding.sendMsgImg.setOnClickListener(){
            val inputText=binding.messageInputText.text
            binding.userMessageTextView.text=inputText
        }

    }

    private fun observeData() {
       binding.chattingRecyclerView.adapter=adapter
        messagesViewModel.messages.observe(viewLifecycleOwner){
            adapter.items=it
            adapter.notifyDataSetChanged()
        }
    }

    private fun callData() {
        messagesViewModel.generateDummyChattingData()
    }


}