package com.playmarket.fragment.fragmentGames

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.playmarket.R
import com.playmarket.adapter.RecyclerAdapterHorizontal
import com.playmarket.data.FakeDataSet
import com.playmarket.databinding.FragmentGamesKidsBinding

class FragmentKindsGame : Fragment() {


    private lateinit var binding: FragmentGamesKidsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        inflater.inflate(R.layout.fragment_games_top_charts, container, false)
        binding = FragmentGamesKidsBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerViewKinds.apply {

            layoutManager = LinearLayoutManager(activity)
            adapter = RecyclerAdapterHorizontal(FakeDataSet.getData(), context)
            onFinishTemporaryDetach()
        }
    }
}