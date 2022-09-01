package com.example.scholarshipapp_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ErrorActivity : AppCompatActivity() {
    var goBackOnError: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_error)

        goBackOnError = findViewById(R.id.mBtnGoBack)
        goBackOnError!!.setOnClickListener{
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }
    }
}