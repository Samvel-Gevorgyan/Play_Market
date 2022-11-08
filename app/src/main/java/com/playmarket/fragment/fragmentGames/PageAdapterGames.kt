package com.playmarket.fragment.fragmentGames

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.playmarket.Communicator
import com.playmarket.botomSheet.BottomSheet

class PageAdapterGames(fm: FragmentManager):  FragmentStatePagerAdapter(fm) {

    private lateinit var communicator: Communicator

    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {

        return when (position) {
            0 -> {
                FragmentTopChartsGame()
            }
            1 -> {
                FragmentKindsGame()
            }
            2 -> {
                FragmentPremiumGame()
            }
            else -> {
                FragmentTopChartsGame()

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