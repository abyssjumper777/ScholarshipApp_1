package com.example.scholarshipapp_1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ArtsActivity : AppCompatActivity() {
    var mBtnUonArts1: Button? = null
    var mBtnKuArts1: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arts)

        mBtnKuArts1 = findViewById(R.id.mBtnKuArts)
            mBtnKuArts1!!.setOnClickListener{
                val openURL = Intent(Intent.ACTION_VIEW)
                openURL.data = Uri.parse("http://www.ku.ac.ke/index.php/ku/item/1739-eac-scholarship-programme")
                startActivity(openURL)
            }
        mBtnUonArts1 = findViewById(R.id.mBtnUonArts)
            mBtnUonArts1!!.setOnClickListener{
                val openURL = Intent(android.content.Intent.ACTION_VIEW)
                openURL.data = Uri.parse("https://www.uonbi.ac.ke/news/twenty-20-scholarships-academic-year-20222023-undergraduate-masters-and-doctorial-programs")
                startActivity(openURL)
            }
    }
}