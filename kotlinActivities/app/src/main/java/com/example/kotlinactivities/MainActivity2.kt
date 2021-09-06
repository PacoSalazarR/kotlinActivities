package com.example.kotlinactivities

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.squareup.moshi.Moshi
import java.lang.Exception

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        preferences = getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        food = getFavoriteFood()

        initViews()
        element = intent.getParcelableExtra<Element>("selectedFood")?: Element()
        if(food.name.isNotEmpty()){
            if(food.name.equals(element.name))
                ivStar.setImageResource(R.drawable.ic_full_star)
            else
                ivStar.setImageResource(R.drawable.ic_empty_star)
        }
        ivSecondary.setImageResource(element.image!!.resource)
        txtvSecondary.setText(element.texto!!.text)
    }

    private lateinit var food: Element

    private val PREFS = "MY_PREFERENCES"
    private val USER_PREFS = "FAV_FOOD"
    private lateinit var preferences: SharedPreferences

    private val moshi = Moshi.Builder().build()

    private lateinit var ivSecondary: ImageView
    private lateinit var btnBack: Button
    private lateinit var txtvSecondary: TextView
    private lateinit var element: Element
    private lateinit var ivStar: ImageView

    private fun initViews() {
        ivSecondary = findViewById(R.id.imViewSecundario)
        btnBack = findViewById(R.id.btnAtras1)
        txtvSecondary = findViewById(R.id.txtViewSecundario)
        ivStar = findViewById(R.id.imViewStar)

        setMainActivity2Listeners()
    }

    private fun setMainActivity2Listeners() {
        ivSecondary.setOnClickListener {
            nextActivity()
        }
        btnBack.setOnClickListener {
            goBack()
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
        preferences.edit().putString(USER_PREFS, moshi.adapter(Element::class.java).toJson(element)).apply()
        ivStar.setImageResource(R.drawable.ic_full_star)
    }

    private fun nextActivity() {
        val intent = Intent(this, MainActivity3::class.java).apply {
            putExtra("selectedFood", element)
        }
        startActivity(intent)
    }

    // En caso de que quiera hacer más cosas además de cerrar el activity
    private fun goBack() {
        finish()
    }
}