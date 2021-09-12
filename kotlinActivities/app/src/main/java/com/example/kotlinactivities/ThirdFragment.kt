package com.example.kotlinactivities

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment

class ThirdFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private lateinit var ivTertiary: ImageView
    private lateinit var btnBack2: Button
    private lateinit var element: Element

    private fun initViews() {
        ivTertiary = requireView().findViewById<View>(R.id.imViewTerciario) as ImageView
        btnBack2 = requireView().findViewById<View>(R.id.btnAtras2) as Button

        setMainActivity2Listeners()
    }

    private fun setMainActivity2Listeners() {
        ivTertiary.setOnClickListener {
            //Hice un onClickListener por si acaso
        }
        btnBack2.setOnClickListener {
            //goBackFunction
        }
    }

}