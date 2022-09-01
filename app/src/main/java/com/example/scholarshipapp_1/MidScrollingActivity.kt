package com.example.scholarshipapp_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MidScrollingActivity : AppCompatActivity() {
    var editButtonStem2: Button? = null
    var editButtonHum2: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mid_scrolling)

        editButtonStem2 = findViewById(R.id.mBtnStem2)
        editButtonStem2!!.setOnClickListener{
            val intent = Intent(this,STEMActivity::class.java)
            startActivity(intent)
        }
        editButtonHum2 = findViewById(R.id.mBtnHumanities2)
        editButtonHum2!!.setOnClickListener{
            val intent = Intent(this,HumanitiesActivity::class.java)
            startActivity(intent)}

    }
}