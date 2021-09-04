package com.example.kotlinactivities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CpuUsageInfo
import android.widget.*
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

    private fun initViews(){
        ivPrincipal = findViewById(R.id.imViewPrincipal)
        ivBack = findViewById(R.id.imViewBack)
        ivNext = findViewById(R.id.imViewNext)
        btnmoreInfo = findViewById(R.id.btnMasInfo)
        setMainActivity1Listeners()
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
        Toast.makeText(this, "previous", Toast.LENGTH_SHORT).show()
    }

    private fun nextImage() {
        Toast.makeText(this, "next", Toast.LENGTH_SHORT).show()
    }

    private fun nextActivity() {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }
}