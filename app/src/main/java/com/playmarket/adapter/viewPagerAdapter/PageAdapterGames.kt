package com.playmarket.adapter.viewPagerAdapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.playmarket.data.FakeData
import com.playmarket.fragment.games.FragmentKindsGame
import com.playmarket.fragment.games.FragmentPremiumGame
import com.playmarket.fragment.games.FragmentTopChartsGame

class PageAdapterGames(fm: FragmentManager):  FragmentStatePagerAdapter(fm) {



    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {

        return when (position) {
            0 -> {
                FragmentTopChartsGame(FakeData.getDataGames())
            }
            1 -> {
                FragmentKindsGame()
            }
            2 -> {
                FragmentPremiumGame()
            }
            else -> {
                FragmentTopChartsGame(FakeData.getDataGames())

            }
        }

    }


    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> {
                return "Top Charts"
            }
            1 -> {
                return "Kinds"
            }
            2 -> {
                return "Premium"
            }
        }
        return super.getPageTitle(position)
    }
    fun showD(){

    }
}