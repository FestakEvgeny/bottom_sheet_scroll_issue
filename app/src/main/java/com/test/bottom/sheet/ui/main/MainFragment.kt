package com.test.bottom.sheet.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.test.bottom.sheet.R

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       val button = view.findViewById<Button>(R.id.display_sheet)

        val bottomSheet = view.findViewById<ViewGroup>(R.id.bottom_sheet)
        val behavior = BottomSheetBehavior.from(bottomSheet)
        behavior.isFitToContents = false
        behavior.isDraggable = false

        button.setOnClickListener {
            bottomSheet.visibility = View.VISIBLE
            behavior.state = BottomSheetBehavior.STATE_HALF_EXPANDED
        }


    }



}