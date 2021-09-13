package com.example.kotlinactivities

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.squareup.moshi.Moshi
import java.lang.Exception

class SecondFragment : Fragment(R.layout.fragment_second) {

    private val KEY_PARSE_DATA = "SAVED_FOOD"
    private var bundle: Bundle? = null
    private var element: Element? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        preferences = activity?.getSharedPreferences(PREFS, Context.MODE_PRIVATE)!!
        food = getFavoriteFood()
        favSound = getFavoriteSound()
        initViews()

        if(favSound.name.isNotEmpty()){
            if(favSound.name.equals(element?.name)) {
                ivHeart.setImageResource(R.drawable.ic_full_heart)
                flagSound = true
            }
            else {
                ivHeart.setImageResource(R.drawable.ic_empty_heart)
                flagSound = false
            }
        }

        if(food.name.isNotEmpty()){
            if(food.name.equals(element?.name)) {
                ivStar.setImageResource(R.drawable.ic_full_star)
                flag = true
            }
            else {
                ivStar.setImageResource(R.drawable.ic_empty_star)
                flag = false
            }
        }
        ivSecondary.setImageResource(element?.image!!.resource)
        txtvSecondary.setText(element?.texto!!.text)
    }

    private lateinit var food: Element
    private lateinit var favSound: Element

    private val PREFS = "MY_PREFERENCES"
    private val USER_PREFS = "FAV_FOOD"
    private val SOUND_PREFS = "FAV_SOUND"
    private lateinit var preferences: SharedPreferences
    var flag: Boolean = false
    var flagSound: Boolean = false

    private val moshi = Moshi.Builder().build()

    private lateinit var ivSecondary: ImageView
    private lateinit var txtvSecondary: TextView

    private lateinit var ivHeart: ImageView
    private lateinit var ivStar: ImageView

    private fun initViews() {
        ivSecondary = requireView().findViewById<View>(R.id.imViewSecundario)as ImageView
        txtvSecondary = requireView().findViewById<View>(R.id.txtViewSecundario) as TextView
        ivStar = requireView().findViewById<View>(R.id.imViewStar)  as ImageView
        ivHeart = requireView().findViewById<View>(R.id.imViewHeart)  as ImageView

        bundle = this.arguments;
        element = bundle?.getParcelable<Element>(KEY_PARSE_DATA)
        ivSecondary.setImageResource(element?.image!!.resource)//R.drawable.ic_full_star
        playSound(element?.sound!!)

        setMainActivity2Listeners()
    }

    var counter: Int = 0

    private fun setMainActivity2Listeners() {
        ivSecondary.setOnClickListener {
            nextActivity()
        }

        ivStar.setOnClickListener {
            saveFavoriteFood(element)
        }

        ivHeart.setOnClickListener {
            saveFavoriteSound(element)
        }
    }

    private fun getFavoriteFood() =
        preferences.getString(USER_PREFS, null)?.let {
            return@let try{
                moshi.adapter(Element::class.java).fromJson(it)
            } catch (e: Exception){
                Element()
            }
        } ?: Element()

    private fun getFavoriteSound() =
        preferences.getString(SOUND_PREFS, null)?.let {
            return@let try{
                moshi.adapter(Element::class.java).fromJson(it)
            } catch (e: Exception){
                Element()
            }
        } ?: Element()

    private fun saveFavoriteSound(element: Element?){
        if(!flagSound){
            preferences.edit().putString(SOUND_PREFS, moshi.adapter(Element::class.java).toJson(element)).apply()
            ivHeart.setImageResource(R.drawable.ic_full_heart)
            flagSound = true
        }
        else{
            var vacio = Element("",AssignedImage.IMAGE_1,AssignedText.TEXT_9,R.raw.svfishbite)
            preferences.edit().putString(SOUND_PREFS, moshi.adapter(Element::class.java).toJson(vacio)).apply()
            ivHeart.setImageResource(R.drawable.ic_empty_heart)
            flagSound = false
        }
    }



    private fun saveFavoriteFood(element: Element?) {
        if(!flag){
            preferences.edit().putString(USER_PREFS, moshi.adapter(Element::class.java).toJson(element)).apply()
            ivStar.setImageResource(R.drawable.ic_full_star)
            flag = true
        }
        else{
            var vacio = Element("",AssignedImage.IMAGE_1,AssignedText.TEXT_9,R.raw.sound1)
            preferences.edit().putString(USER_PREFS, moshi.adapter(Element::class.java).toJson(vacio)).apply()
            ivStar.setImageResource(R.drawable.ic_empty_star)
            flag = false
        }

    }

    private fun playSound(sound: Int) = MediaPlayer.create(requireContext(), sound).start()

    private fun nextActivity() {
        val newFragment: Fragment = ThirdFragment().apply {
            arguments = Bundle().apply {
                putParcelable(KEY_PARSE_DATA, element)
            }
        }
        val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
        transaction.replace(R.id.container, newFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}