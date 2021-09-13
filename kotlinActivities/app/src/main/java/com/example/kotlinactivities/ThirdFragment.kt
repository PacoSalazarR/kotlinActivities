package com.example.kotlinactivities

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment

class ThirdFragment : Fragment(R.layout.fragment_third) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }
    private val KEY_PARSE_DATA = "SAVED_FOOD"
    private var bundle: Bundle? = null

    private lateinit var ivTertiary: ImageView
    private var element: Element? = null

    private fun initViews() {
        ivTertiary = requireView().findViewById<View>(R.id.imViewTerciario) as ImageView

        bundle = this.arguments;
        element = bundle?.getParcelable<Element>(KEY_PARSE_DATA)
        ivTertiary.setImageResource(element?.image!!.resource)

        setMainActivity2Listeners()
    }

    private fun setMainActivity2Listeners() {
        ivTertiary.setOnClickListener {
            //Hice un onClickListener por si acaso
        }
    }

}