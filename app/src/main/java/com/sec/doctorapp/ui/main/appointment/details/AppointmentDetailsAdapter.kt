package com.sec.doctorapp.ui.main.appointment.details

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sec.doctorapp.databinding.CellAppointmentDateTimeBinding
import com.sec.doctorapp.databinding.CellAppointmentDetailsCardBinding

import com.sec.doctorapp.databinding.CellHomeTitleBinding
import com.sec.doctorapp.ui.main.appointment.details.items.AppointmentDetailsUiItem
import com.sec.doctorapp.ui.main.appointment.details.viewHolders.AppointmentDateVH
import com.sec.doctorapp.ui.main.appointment.details.viewHolders.AppointmentDetailsCardVH
import com.sec.doctorapp.ui.main.appointment.details.viewHolders.AppointmentTimeVH
import com.sec.doctorapp.ui.main.appointment.details.viewHolders.AppointmentDetailsTitleVH

class AppointmentDetailsAdapter(
    var items: ArrayList<AppointmentDetailsUiItem>,
    var onItemClicked: (item: AppointmentDetailsUiItem) -> Unit
): RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            AppointmentDetailsUiItem.DoctorDetails::class.java.hashCode()->{
                AppointmentDetailsCardVH(
                    CellAppointmentDetailsCardBinding.inflate( LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )
            }

                AppointmentDetailsUiItem.AppointmentTitleItem::class.java.hashCode()->{
                   AppointmentDetailsTitleVH(
                       CellHomeTitleBinding.inflate(
                           LayoutInflater.from(parent.context),
                           parent,
                           false
                       )
                   )

                }
            AppointmentDetailsUiItem.TimeItem::class.java.hashCode()->{
                AppointmentTimeVH(
                    CellAppointmentDateTimeBinding.inflate( LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )

            }
            AppointmentDetailsUiItem.DateItem::class.java.hashCode()->{
                AppointmentDateVH(
                    CellAppointmentDateTimeBinding.inflate( LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                )

            }
            else -> throw UnsupportedOperationException("no view holder for the specified item")
            }
        }




    override fun getItemCount(): Int {
   return items.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]
        when (holder) {
            is AppointmentDetailsCardVH->{
                holder.bind(item as AppointmentDetailsUiItem.DoctorDetails)
                holder.binding.doctorMessage.setOnClickListener(){
                    onItemClicked(item)
                }
                holder.binding.doctorPhone.setOnClickListener(){
                    onItemClicked(item)
                }
                holder.binding.doctorVideo.setOnClickListener(){
                    onItemClicked(item)
                }
            }

            is AppointmentDetailsTitleVH -> {
                holder.bind(item as AppointmentDetailsUiItem.AppointmentTitleItem)
                holder.binding.textViewAction.setOnClickListener {
                    onItemClicked(item)
                }
            }
            is AppointmentTimeVH -> {
                holder.bind(item as AppointmentDetailsUiItem.TimeItem)

            }
            is AppointmentDateVH -> {
                holder.bind(item as AppointmentDetailsUiItem.DateItem)
            }
        }

    }

    override fun getItemViewType(position: Int): Int {
        return items[position]::class.java.hashCode()
    }
}