package com.example.scholarshipapp_1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ShortCourseActivity : AppCompatActivity() {
    var mBtnEmob : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_short_course)
        mBtnEmob = findViewById(R.id.mBtnEmobilisSC)
            mBtnEmob!!.setOnClickListener{
                val openURL = Intent(android.content.Intent.ACTION_VIEW)
                openURL.data = Uri.parse("https://www.emobilis.ac.ke/web-development")
                startActivity(openURL)
            }
    }
}