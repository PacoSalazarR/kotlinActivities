package com.example.kotlinactivities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.kotlinactivities.Element.Companion.elements

class MainFragment : Fragment(R.layout.fragment_main) {
    private val TEXT_KEY = "TEXT_KEY"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Toast.makeText(
            context,
            savedInstanceState?.getString(TEXT_KEY, "") ?: "",
            Toast.LENGTH_LONG
        ).show()


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    var counter: Int = 0
    private lateinit var ivPrincipal: ImageView
    private lateinit var  ivBack: ImageView
    private lateinit var  ivNext: ImageView
    private lateinit var  btnmoreInfo: Button


    private fun initViews(){
        ivPrincipal = requireView().findViewById<View>(R.id.imViewPrincipalF) as ImageView
        ivBack = requireView().findViewById<View>(R.id.imViewBack) as ImageView
        ivNext = requireView().findViewById<View>(R.id.imViewNext) as ImageView
        btnmoreInfo = requireView().findViewById<View>(R.id.btnMasInfo) as Button

        setMainActivity1Listeners()

        setActualFood()
    }

    private fun setActualFood() {
        ivPrincipal.setImageResource(elements[counter].image!!.resource)
    }

    private fun setMainActivity1Listeners() {
        ivBack.setOnClickListener {
            previousImage()
            makeToast()
        }
        ivNext.setOnClickListener {
            nextImage()
            makeToast()
        }
        btnmoreInfo.setOnClickListener {
            nextActivity()
        }

    }

    private fun previousImage() {
        if(counter == 0)
            counter = 9
        else
            counter--
        setActualFood()
    }

    private fun nextImage() {
        if(counter == 9)
            counter = 0
        else
            counter++
        setActualFood()
    }

    private fun nextActivity() {
        /*val intent = Intent(requireContext(), SecondFragment::class.java).apply {
            putExtra("selectedFood", Element.elements[counter])
        }
        startActivity(intent)*/
        val newFragment: Fragment = SecondFragment()
        val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
        transaction.replace(R.id.container, newFragment)
        /*val intent = Intent(requireContext(), SecondFragment::class.java).apply {
            putExtra("selectedFood", Element.elements[counter])
        }
        transaction.apply {
            intent
        }*/
        transaction.addToBackStack(null)
        transaction.commit()
    }

    private fun makeToast() {
        Toast.makeText(requireContext(), elements[counter].name, Toast.LENGTH_SHORT).show()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.run {
            putString(TEXT_KEY, "La pantalla ha rotado")
        }
        super.onSaveInstanceState(outState)
    }

}