package com.example.scholarshipapp_1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class STEMActivity : AppCompatActivity() {
    var mBtnUonStem1: Button? = null
    var mBtnTukStem1: Button? = null
    var mBtnKuStem1: Button? = null
    var mBtnJkuatStem1: Button? = null
    var mBtnStrathStem1: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stemactivity)
        mBtnUonStem1 = findViewById(R.id.mBtnUonStem)
            mBtnUonStem1!!.setOnClickListener{
                val openURL = Intent(android.content.Intent.ACTION_VIEW)
                openURL.data = Uri.parse("https://www.uonbi.ac.ke/news/twenty-20-scholarships-academic-year-20222023-undergraduate-masters-and-doctorial-programs")
                startActivity(openURL)
            }
        mBtnTukStem1 = findViewById(R.id.mBtnTukStem)
            mBtnTukStem1!!.setOnClickListener{
                val openURL = Intent(android.content.Intent.ACTION_VIEW)
                openURL.data = Uri.parse("http://sports.tukenya.ac.ke/toyota")
                startActivity(openURL)
            }
        mBtnKuStem1 = findViewById(R.id.mBtnKuStem)
            mBtnKuStem1!!.setOnClickListener{
                val openURL = Intent(android.content.Intent.ACTION_VIEW)
                openURL.data = Uri.parse("  http://www.ku.ac.ke/index.php/ku/item/1739-eac-scholarship-programme")
                startActivity(openURL)
            }
        mBtnJkuatStem1 = findViewById(R.id.mBtnJkuatStem)
            mBtnJkuatStem1!!.setOnClickListener{
                val openURL = Intent(android.content.Intent.ACTION_VIEW)
                openURL.data = Uri.parse("http://www.jkuat.ac.ke/departments/hr/scholarship-support/")
                startActivity(openURL)
            }
        mBtnStrathStem1 = findViewById(R.id.mBtnStrathmoreStem)
            mBtnStrathStem1!!.setOnClickListener{
                val openURL = Intent(android.content.Intent.ACTION_VIEW)
                openURL.data = Uri.parse("https://su-sso.strathmore.edu/fa")
                startActivity(openURL)
            }
    }
}