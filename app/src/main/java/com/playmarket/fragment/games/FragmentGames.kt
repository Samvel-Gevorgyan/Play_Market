package com.playmarket.fragment.games

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.playmarket.R
import com.playmarket.data.FakeData
import com.playmarket.databinding.FragmentGamesBinding
import com.playmarket.adapter.viewPagerAdapter.PageAdapterApps


class FragmentGames : Fragment() {
    private lateinit var binding: FragmentGamesBinding
    private lateinit var pageAdapterGames: PageAdapterApps


    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        inflater.inflate(R.layout.fragment_games, container, false)
        binding = FragmentGamesBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        pageAdapterGames = PageAdapterApps(childFragmentManager, FakeData.getDataGames())
        binding.viewPager.adapter = pageAdapterGames

    }
}




    




