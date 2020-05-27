package com.example.bindinghomework

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.bindinghomework.databinding.ListItemBinding

class Adapter(private val users: List<User>, private val context: Context) : RecyclerView.Adapter<Adapter.ViewHolder>() {
    override fun getItemCount() = users.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding:ListItemBinding=DataBindingUtil.inflate(LayoutInflater.from(parent.context),R.layout.list_item, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind()
    }

    inner class ViewHolder(private val binding:ListItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(){
            binding.user= users[adapterPosition]
        }
    }
}