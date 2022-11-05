package com.playmarket.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.playmarket.data.DataApps

import com.playmarket.databinding.RecylerHorizondalBinding

class RecyclerAdapterHorizontal(private val items: MutableList<Any>, val context: Context) :
    RecyclerView.Adapter<RecyclerAdapterHorizontal.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding=
            RecylerHorizondalBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int =items.size


    inner class ViewHolder(private var binding: RecylerHorizondalBinding) :
        RecyclerView.ViewHolder(binding.root) {
    fun bind(item:Any){
        (item as DataApps).let{
            Glide.with(context)
                .load(item.appImage)
                .into(binding.appImage)
            binding.appTitle.text=item.appName

        }
    }
    }
}