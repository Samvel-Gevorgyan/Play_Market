package com.playmarket.fragment.fragmentApps

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.playmarket.R
import com.playmarket.adapter.RecyclerAdapterCategories
import com.playmarket.databinding.FragmentAppsCategoriesBinding


class FragmentCategoriesApps:Fragment() {
    private lateinit var  binding: FragmentAppsCategoriesBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        inflater.inflate(R.layout.fragment_apps_categories,container,false)
        binding=FragmentAppsCategoriesBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerViewCategories.apply {
            layoutManager=LinearLayoutManager(activity)

            adapter= RecyclerAdapterCategories(context)
        }
    }
}