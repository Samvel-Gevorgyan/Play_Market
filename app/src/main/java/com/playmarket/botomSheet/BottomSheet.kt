package com.playmarket.botomSheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.playmarket.R
import com.playmarket.adapter.RecyclerAdapterCategories
import com.playmarket.databinding.BottomSheetBinding

class BottomSheet: BottomSheetDialogFragment() {
    private lateinit var binding: BottomSheetBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        inflater.inflate(R.layout.bottom_sheet,container,false)
        binding=BottomSheetBinding.inflate(inflater)
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
        const val TAG = "ModalBottomSheet"
    }
}