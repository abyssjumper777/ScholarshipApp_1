package com.example.scholarshipapp_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Activity1 : AppCompatActivity() {

    var registerButton: Button? = null
    var loginButton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        registerButton = findViewById(R.id.mBtnRegister)
        loginButton = findViewById(R.id.mBtnLogin)


        registerButton!!.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}