package com.playmarket

import androidx.fragment.app.Fragment


interface Communicator {

   fun loadFragment(fragment: Fragment)
   fun showBottomSheetCategories()
   fun showBottomSheet()

}