package com.playmarket.fragment.apps

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.playmarket.R
import com.playmarket.databinding.FragmentAppsKidsBinding

class FragmentKindsApps:Fragment() {
    private lateinit var binding: FragmentAppsKidsBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        inflater.inflate(R.layout.fragment_apps_kids,container,false)
        binding=FragmentAppsKidsBinding.inflate(inflater)
        return binding.root

    }
}