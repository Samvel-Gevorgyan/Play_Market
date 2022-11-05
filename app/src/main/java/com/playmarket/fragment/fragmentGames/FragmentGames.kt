package com.playmarket.fragment.fragmentGames

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.playmarket.R
import com.playmarket.databinding.FragmentGamesBinding



class FragmentGames : Fragment() {
    private lateinit var binding: FragmentGamesBinding
    private lateinit var pageAdapterGames: PageAdapterGames


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
        pageAdapterGames = PageAdapterGames(childFragmentManager)
        binding.viewPager.adapter = pageAdapterGames

    }
}




    




