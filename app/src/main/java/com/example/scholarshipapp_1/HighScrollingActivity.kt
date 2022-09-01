package com.example.scholarshipapp_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HighScrollingActivity : AppCompatActivity() {
    var editButtonStem: Button? = null
    var editButtonMed: Button? = null
    var editButtonHum: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_high_scrolling)

        editButtonStem = findViewById(R.id.mBtnStem)
            editButtonStem!!.setOnClickListener{
                val intent = Intent(this,STEMActivity::class.java)
                startActivity(intent)
            }
        editButtonMed = findViewById(R.id.mBtnMed)
            editButtonMed!!.setOnClickListener{
                val intent = Intent(this,MedActivity::class.java)
                startActivity(intent)}
        editButtonHum = findViewById(R.id.mBtnHumanities1)
            editButtonHum!!.setOnClickListener{
                val intent = Intent(this,HumanitiesActivity::class.java)
                startActivity(intent)}

    }
}