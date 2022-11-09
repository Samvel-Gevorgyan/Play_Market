package com.playmarket.adapter.recyclerAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.playmarket.data.DataApps
import com.playmarket.databinding.RecylceViewAppsBinding


class RecyclerAdapterApps(private val items: MutableList<Any>, val context: Context) :
    RecyclerView.Adapter<RecyclerAdapterApps.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val binding =
            RecylceViewAppsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)

    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size


    inner class ViewHolder(private var binding: RecylceViewAppsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Any) {

            (item as DataApps).let {
                Glide.with(context)
                    .load(item.imageUrl)
                    .into(binding.appImage)
                binding.appTitle.text = item.name
                binding.appDescription.text = item.description
                binding.appRating.text = item.rating

            }
        }
    }
}