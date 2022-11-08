package com.playmarket.botomSheet


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.playmarket.R
import com.playmarket.databinding.BottomSheetRadioGroupBinding


class BottomSheetRadioGroup : BottomSheetDialogFragment(), View.OnClickListener {

    private lateinit var binding: BottomSheetRadioGroupBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        inflater.inflate(R.layout.bottom_sheet_radio_group, container, false)
        binding = BottomSheetRadioGroupBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.dialogButtonTopFree.setOnClickListener(this)
        binding.dialogButtonTopPaid.setOnClickListener(this)
        binding.dialogButtonTopGrossing.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        if (v is RadioButton) {

            val checked = v.isChecked

            when (v.getId()) {

                R.id.dialog_button_top_free -> {
                    if (checked) v.setBackgroundResource(R.drawable.shape_square_green)
                    binding.dialogButtonTopPaid.setBackgroundResource(R.drawable.shape_square_stroke_green)
                    binding.dialogButtonTopGrossing.setBackgroundResource(R.drawable.shape_square_stroke_green)

                }
                R.id.dialog_button_top_grossing ->{
                    if (checked) v.setBackgroundResource(R.drawable.shape_square_green)
                    binding.dialogButtonTopPaid.setBackgroundResource(R.drawable.shape_square_stroke_green)
                    binding.dialogButtonTopFree.setBackgroundResource(R.drawable.shape_square_stroke_green)

                }
                R.id.dialog_button_top_paid ->{
                    if (checked) v.setBackgroundResource(R.drawable.shape_square_green)
                    binding.dialogButtonTopFree.setBackgroundResource(R.drawable.shape_square_stroke_green)
                    binding.dialogButtonTopGrossing.setBackgroundResource(R.drawable.shape_square_stroke_green)
                }
            }
       }
    }

    companion object {
        const val TAG = "BottomSheet"
    }
}