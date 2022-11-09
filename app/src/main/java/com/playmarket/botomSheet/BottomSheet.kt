package com.playmarket.botomSheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.playmarket.R
import com.playmarket.adapter.recyclerAdapter.RecyclerAdapterCategories
import com.playmarket.databinding.BottomSheetCategoriesDialogBinding

class BottomSheet: BottomSheetDialogFragment() {

    private lateinit var binding: BottomSheetCategoriesDialogBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        inflater.inflate(R.layout.bottom_sheet_categories_dialog,container,false)
        binding=BottomSheetCategoriesDialogBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.recyclerViewBottomSheet.apply {
            layoutManager=LinearLayoutManager(activity)
            adapter= RecyclerAdapterCategories(context)
        }
    }

    companion object {
        const val TAG = "BottomSheet"
    }
}