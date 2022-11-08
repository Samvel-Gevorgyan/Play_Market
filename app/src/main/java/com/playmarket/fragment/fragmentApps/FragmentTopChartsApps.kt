package com.playmarket.fragment.fragmentApps

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.playmarket.R
import com.playmarket.adapter.RecyclerAdapterApps
import com.playmarket.data.FakeDataSet
import com.playmarket.databinding.FragmentAppsTopChartsBinding

class FragmentTopChartsApps:Fragment() {

    private lateinit var binding: FragmentAppsTopChartsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

      inflater.inflate(R.layout.fragment_apps_top_charts,container,false)
        binding=FragmentAppsTopChartsBinding.inflate(inflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.recyclerViewTopChart.apply {
            layoutManager=LinearLayoutManager(activity)
            adapter= RecyclerAdapterApps(FakeDataSet.getData(),context)



        }
    }


}