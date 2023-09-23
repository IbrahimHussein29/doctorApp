package com.sec.doctorapp.ui.main.messages.calling

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.sec.doctorapp.R
import com.sec.doctorapp.databinding.FragmentCallingBinding


class CallingFragment : Fragment() {
   private lateinit var binding:FragmentCallingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentCallingBinding.inflate(layoutInflater)
        setClickableListeners()
        return binding.root
    }

    private fun setClickableListeners() {
        binding.endCallBtn.setOnClickListener(){
            findNavController().navigate(R.id.action_callingFragment_to_messageDetailsFragment)
        }
        binding.videoCallBtn.setOnClickListener(){
            findNavController().navigate(R.id.action_callingFragment_to_videoCallFragment)
        }

    }


}