package com.example.kotlinactivities

import android.content.Context
import android.content.SharedPreferences
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.kotlinactivities.Element.Companion.elements
import com.squareup.moshi.Moshi
import java.lang.Exception

class MainFragment : Fragment(R.layout.fragment_main) {
    private val TEXT_KEY = "TEXT_KEY"
    private val KEY_PARSE_DATA = "SAVED_FOOD"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        preferences = activity?.getSharedPreferences(PREFS, Context.MODE_PRIVATE)!!
        soundElement = getFavoriteSound()
        initViews()
    }

    private var counter: Int = 0

    private val PREFS = "MY_PREFERENCES"
    private val SOUND_PREFS = "FAV_SOUND"
    private lateinit var preferences: SharedPreferences
    private val moshi = Moshi.Builder().build()

    private lateinit var ivPrincipal: ImageView
    private lateinit var  ivBack: ImageView
    private lateinit var  ivNext: ImageView
    private lateinit var  btnmoreInfo: Button
    private lateinit var actualElement: Element
    private lateinit var soundElement: Element

    private lateinit var  ivPlay: ImageView

    private fun initViews(){
        ivPrincipal = requireView().findViewById<View>(R.id.imViewPrincipalF) as ImageView
        ivBack = requireView().findViewById<View>(R.id.imViewBack) as ImageView
        ivNext = requireView().findViewById<View>(R.id.imViewNext) as ImageView
        btnmoreInfo = requireView().findViewById<View>(R.id.btnMasInfo) as Button
        ivPlay = requireView().findViewById<View>(R.id.imViewPlay) as ImageView

        setMainActivity1Listeners()

        setActualFood()
    }

    private fun getFavoriteSound() =
        preferences.getString(SOUND_PREFS, null)?.let {
            return@let try{
                moshi.adapter(Element::class.java).fromJson(it)
            } catch (e: Exception){
                Element()
            }
        } ?: Element()

    private fun setActualFood() {
        ivPrincipal.setImageResource(elements[counter].image!!.resource)
        actualElement = elements[counter]
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
        ivPlay.setOnClickListener {
            playSound(soundElement.sound)
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
        val newFragment: Fragment = SecondFragment().apply {
            arguments = Bundle().apply {
                putParcelable(KEY_PARSE_DATA, actualElement)
            }
        }
        val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()

        transaction.replace(R.id.container, newFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    private fun makeToast() {
        Toast.makeText(requireContext(), elements[counter].name, Toast.LENGTH_SHORT).show()
    }

    private fun playSound(sound: Int) = MediaPlayer.create(requireContext(), sound).start()

    override fun onSaveInstanceState(outState: Bundle) {
        outState.run {
            putString(TEXT_KEY, "La pantalla ha rotado")
        }
        super.onSaveInstanceState(outState)
    }

}