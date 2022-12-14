package com.playmarket.fragment.apps


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.playmarket.R
import com.playmarket.data.FakeData
import com.playmarket.databinding.FragmentAppsBinding
import com.playmarket.adapter.viewPagerAdapter.PageAdapterApps


class FragmentApps : Fragment() {

    private lateinit var binding: FragmentAppsBinding
    private lateinit var pageAdapterApps: PageAdapterApps

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        inflater.inflate(R.layout.fragment_apps, container, false)
        binding = FragmentAppsBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pageAdapterApps = PageAdapterApps(childFragmentManager,FakeData.getDataApps())
        binding.viewPager.adapter = pageAdapterApps

    }
}