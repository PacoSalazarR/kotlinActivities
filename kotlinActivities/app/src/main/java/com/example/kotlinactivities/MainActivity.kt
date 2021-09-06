package com.example.kotlinactivities

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CpuUsageInfo
import android.widget.*
import com.example.kotlinactivities.Element.Companion.elements
import java.nio.file.attribute.GroupPrincipal

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        initViews()
    }

    private lateinit var ivPrincipal: ImageView
    private lateinit var  ivBack: ImageView
    private lateinit var  ivNext: ImageView
    private lateinit var  btnmoreInfo: Button

    var counter: Int = 0

    private fun initViews(){
        ivPrincipal = findViewById(R.id.imViewPrincipal)
        ivBack = findViewById(R.id.imViewBack)
        ivNext = findViewById(R.id.imViewNext)
        btnmoreInfo = findViewById(R.id.btnMasInfo)

        setMainActivity1Listeners()

        setActualFood()

    }

    private fun setActualFood() {
        ivPrincipal.setImageResource(elements[counter].image!!.resource)
    }

    private fun setMainActivity1Listeners() {
        ivBack.setOnClickListener {
            previousImage()
        }
        ivNext.setOnClickListener {
            nextImage()
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
        makeToast()
    }

    private fun nextImage() {
        if(counter == 9)
            counter = 0
        else
            counter++
        setActualFood()
        makeToast()
    }

    private fun nextActivity() {
        val intent = Intent(this, MainActivity2::class.java).apply {
            putExtra("selectedFood", elements[counter])
        }
        startActivity(intent)
    }

    private fun makeToast() {
        Toast.makeText(this, elements[counter].name, Toast.LENGTH_SHORT).show()
    }
}