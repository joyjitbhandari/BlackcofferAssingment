package com.example.blackcofferassingment.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.blackcofferassingment.dataModel.ListDataModel
import com.example.blackcofferassingment.databinding.DataListItemBinding

class ListDataAdapter (private val dataSet: List<ListDataModel>, private val fragmentId: Int) : RecyclerView.Adapter<ListDataAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataListItemBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataSet[position]
        holder.bind(item)
        when(fragmentId){
            0->{
                holder.binding.btnLayout.visibility = View.GONE
            }
            1->{
                holder.binding.btn3.visibility = View.GONE
            }
            2->{
                holder.binding.txtInvite.visibility = View.GONE
                holder.binding.categories.visibility = View.GONE
            }
        }
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

    fun getItem(position: Int): ListDataModel {
        return dataSet[position]
    }

    class ViewHolder(val binding: DataListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item:ListDataModel ) {
            binding.ProfileAvatar.text = item.avatar
            binding.txtName.text = item.name
            binding.txtLocation.text = item.location
            binding.txtWithIn.text = item.withIn
            binding.categories.text = item.category
            binding.desc.text = item.desc
        }
    }

}
