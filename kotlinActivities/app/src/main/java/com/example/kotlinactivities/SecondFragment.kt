package com.example.kotlinactivities

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /* this = your fragment
        //val prefs = MainFragment!!.getSharedPreferences("pref", Context.MODE_PRIVATE)
        //food = getFavoriteFood()

        //initViews()
        //element = intent.getParcelableExtra<Element>("selectedFood")?: Element()
        if(food.name.isNotEmpty()){
            if(food.name.equals(element.name)) {
                ivStar.setImageResource(R.drawable.ic_full_star)
                flag = true
            }
            else {
                ivStar.setImageResource(R.drawable.ic_empty_star)
                flag = false
            }
        }
        ivSecondary.setImageResource(element.image!!.resource)
        txtvSecondary.setText(element.texto!!.text)*/
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private lateinit var food: Element

    private val PREFS = "MY_PREFERENCES"
    private val USER_PREFS = "FAV_FOOD"
    private lateinit var preferences: SharedPreferences
    var flag: Boolean = false

    private val moshi = Moshi.Builder().build()

    private lateinit var ivSecondary: ImageView
    private lateinit var btnBack: Button
    private lateinit var txtvSecondary: TextView
    private lateinit var element: Element
    private lateinit var ivStar: ImageView

    private fun initViews() {
        ivSecondary = requireView().findViewById<View>(R.id.imViewSecundario)as ImageView
        btnBack = requireView().findViewById<View>(R.id.btnAtras1) as Button
        txtvSecondary = requireView().findViewById<View>(R.id.txtViewSecundario) as TextView
        ivStar = requireView().findViewById<View>(R.id.imViewStar)  as ImageView

        setMainActivity2Listeners()
    }

    private fun setMainActivity2Listeners() {
        ivSecondary.setOnClickListener {
            nextActivity()
        }
        btnBack.setOnClickListener {
            //goBack()
        }
        ivStar.setOnClickListener {
            saveFavoriteFood(element)
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


    private fun saveFavoriteFood(element: Element) {
        if(!flag){
            preferences.edit().putString(USER_PREFS, moshi.adapter(Element::class.java).toJson(element)).apply()
            ivStar.setImageResource(R.drawable.ic_full_star)
            flag = true
        }
        else{
            var vacio: Element
            vacio = Element("",AssignedImage.IMAGE_1,AssignedText.TEXT_9)
            preferences.edit().putString(USER_PREFS, moshi.adapter(Element::class.java).toJson(vacio)).apply()
            ivStar.setImageResource(R.drawable.ic_empty_star)
            flag = false
        }

    }

    private fun nextActivity() {
        /*val intent = Intent(this, MainActivity3::class.java).apply {
            putExtra("selectedFood", element)
        }
        startActivity(intent)*/
        val newFragment: Fragment = ThirdFragment()
        val transaction: FragmentTransaction = requireFragmentManager().beginTransaction()
        transaction.replace(R.id.container, newFragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}