package com.playmarket.fragment.games

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.playmarket.Communicator
import com.playmarket.R
import com.playmarket.adapter.recyclerAdapter.RecyclerAdapterApps
import com.playmarket.databinding.FragmentGamesTopChartsBinding

class FragmentTopChartsGame (private val items: MutableList<Any>): Fragment() {

    private lateinit var binding: FragmentGamesTopChartsBinding
    private lateinit var communicator: Communicator


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        inflater.inflate(R.layout.fragment_games_top_charts, container, false)
        binding = FragmentGamesTopChartsBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        communicator = activity as Communicator
        communicator.showBottomSheet()

        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = RecyclerAdapterApps(items, context)

        }
        binding.categoriesButton.setOnClickListener {
            communicator.showBottomSheetCategories()
        }


    }
}

