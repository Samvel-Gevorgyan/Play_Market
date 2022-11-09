package com.playmarket.adapter.viewPagerAdapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.playmarket.fragment.apps.FragmentCategoriesApps
import com.playmarket.fragment.games.FragmentKindsGame
import com.playmarket.fragment.games.FragmentTopChartsGame


class PageAdapterApps(fm:FragmentManager,private val items: MutableList<Any> ):  FragmentStatePagerAdapter(fm) {


    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                FragmentTopChartsGame(items)
            }
            1 -> {
                FragmentKindsGame()
            }
            2 -> {
                FragmentCategoriesApps()
            }
            else ->{
                FragmentTopChartsGame(items)
            }
        }

        }


    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0-> {
                return "Top Charts"
            }
            1 -> {
                return "Kinds"
            }
            2 -> {
                return "Categories"
            }
        }
        return super.getPageTitle(position)
    }


}