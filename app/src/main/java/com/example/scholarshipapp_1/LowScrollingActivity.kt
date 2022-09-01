package com.example.scholarshipapp_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LowScrollingActivity : AppCompatActivity() {
    var editButtonArts: Button? = null
    var editButtonShort: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_low_scrolling)

        editButtonArts = findViewById(R.id.mBtnArts)
        editButtonArts!!.setOnClickListener{
            val intent = Intent(this,ArtsActivity::class.java)
            startActivity(intent)
        }
        editButtonShort = findViewById(R.id.mBtnShort)
        editButtonShort!!.setOnClickListener{
            val intent = Intent(this,ShortCourseActivity::class.java)
            startActivity(intent)}
    }
}