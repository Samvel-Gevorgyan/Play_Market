package com.playmarket.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.playmarket.data.EnumCategories
import com.playmarket.databinding.RecylceViewCategoriesBinding

class RecyclerAdapterCategories(val context: Context) :
    RecyclerView.Adapter<RecyclerAdapterCategories.ViewHolder>() {


    private val items = EnumCategories.values()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val binding=RecylceViewCategoriesBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    inner class ViewHolder(private val binding: RecylceViewCategoriesBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(items: EnumCategories) {
            Glide.with(context)
                .load(items.image)
                .into(binding.appImage)

            binding.appTitle.text = items.categoriesName
        }
        init {
            binding.appTitle.setOnClickListener{
                Toast.makeText(context, items[absoluteAdapterPosition].categoriesName, Toast.LENGTH_SHORT).show()
            }
        }

    }


    companion object{

    }


}