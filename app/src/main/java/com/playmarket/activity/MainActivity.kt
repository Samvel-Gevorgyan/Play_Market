package com.playmarket.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.playmarket.Communicator
import com.playmarket.R
import com.playmarket.botomSheet.BottomSheet
import com.playmarket.botomSheet.BottomSheetRadioGroup
import com.playmarket.databinding.ActivityMainBinding
import com.playmarket.fragment.fragmentApps.FragmentApps
import com.playmarket.fragment.fragmentGames.FragmentGames


class MainActivity : AppCompatActivity(), Communicator {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        supportFragmentManager.beginTransaction().replace(R.id.container, FragmentGames()).commit()

        binding.bottomNav.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.button_game -> {
                    loadFragment(FragmentGames())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.button_apps -> {
                    loadFragment(FragmentApps())
                    return@setOnNavigationItemReselectedListener
                }
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    override fun showBottomSheet() {
        val modalBottomSheet = BottomSheet()
        modalBottomSheet.show(supportFragmentManager, BottomSheet.TAG)
    }

    override fun showBottomSheet2() {
        val dialog=BottomSheetRadioGroup()
        dialog.show(supportFragmentManager,BottomSheetRadioGroup.TAG)

    }
}