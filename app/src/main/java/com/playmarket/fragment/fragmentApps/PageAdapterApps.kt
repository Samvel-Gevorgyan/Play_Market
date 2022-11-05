package com.playmarket.fragment.fragmentApps

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.playmarket.fragment.fragmentGames.FragmentKindsGame


class PageAdapterApps(fm:FragmentManager):  FragmentStatePagerAdapter(fm) {


    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                FragmentTopChartsApps()
            }
            1 -> {
                FragmentKindsGame()
            }
            2 -> {
                FragmentCategoriesApps()
            }
            else ->{
                FragmentTopChartsApps()
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