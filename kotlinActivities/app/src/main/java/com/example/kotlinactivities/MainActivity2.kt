package com.example.kotlinactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        initViews()
        element = intent.getParcelableExtra<Element>("selectedCrop")?: Element()
        Toast.makeText(this, "parameter " + getString(element.texto!!.text), Toast.LENGTH_SHORT).show()
    }


    private lateinit var ivSecondary: ImageView
    private lateinit var btnBack: Button
    private lateinit var element: Element

    private fun initViews() {
        ivSecondary = findViewById(R.id.imViewSecundario)
        btnBack = findViewById(R.id.btnAtras1)
        setMainActivity2Listeners()
    }

    private fun setMainActivity2Listeners() {
        ivSecondary.setOnClickListener {
            nextActivity()
        }
        btnBack.setOnClickListener {
            goBack()
        }
    }

    private fun nextActivity() {
        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)
    }

    // En caso de que quiera hacer más cosas además de cerrar el activity
    private fun goBack() {
        finish()
    }
}