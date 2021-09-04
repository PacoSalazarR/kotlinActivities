package com.example.kotlinactivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        initViews()
    }

    private lateinit var ivTertiary: ImageView
    private lateinit var btnBack2: Button

    private fun initViews() {
        ivTertiary = findViewById(R.id.imViewTerciario)
        btnBack2 = findViewById(R.id.btnAtras2)

        setMainActivity2Listeners()
    }

    private fun setMainActivity2Listeners() {
        ivTertiary.setOnClickListener {
            //Hice un onClickListener por si acaso
        }
        btnBack2.setOnClickListener {
            goBack()
        }
    }

    // En caso de que quiera hacer más cosas además de cerrar el activity
    private fun goBack() {
        finish()
    }
}