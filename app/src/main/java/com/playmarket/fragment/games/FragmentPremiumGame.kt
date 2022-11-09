package com.playmarket.fragment.games

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.playmarket.R
import com.playmarket.databinding.FragmentGamesPremiumBinding

class FragmentPremiumGame: Fragment() {

    private lateinit var binding: FragmentGamesPremiumBinding

    override fun onCreateView(

        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View {

        inflater.inflate(R.layout.fragment_games_top_charts, container, false)
        binding = FragmentGamesPremiumBinding.inflate(inflater)
        return binding.root

    }
}