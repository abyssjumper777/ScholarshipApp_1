package com.example.scholarshipapp_1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HumanitiesActivity : AppCompatActivity() {
    var mBtnUonHumanities1: Button? = null
    var mBtnKuHumanities1: Button? = null
    var mBtnJkuatHumanities1: Button? = null
    var mBtnStrathHumanities1: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_humanities)
        mBtnUonHumanities1 = findViewById(R.id.mBtnUonHumanities)
            mBtnUonHumanities1!!.setOnClickListener{
                val openURL = Intent(Intent.ACTION_VIEW)
                openURL.data = Uri.parse("https://www.uonbi.ac.ke/news/twenty-20-scholarships-academic-year-20222023-undergraduate-masters-and-doctorial-programs")
                startActivity(openURL)
            }
        mBtnKuHumanities1 = findViewById(R.id.mBtnKuHumanities)
            mBtnKuHumanities1!!.setOnClickListener{
                val openURL = Intent(android.content.Intent.ACTION_VIEW)
                openURL.data = Uri.parse("http://www.ku.ac.ke/index.php/ku/item/1739-eac-scholarship-programme")
                startActivity(openURL)
            }
        mBtnJkuatHumanities1 = findViewById(R.id.mBtnJkuatHumanities)
            mBtnJkuatHumanities1!!.setOnClickListener{
                val openURL = Intent(android.content.Intent.ACTION_VIEW)
                openURL.data = Uri.parse("http://www.jkuat.ac.ke/departments/hr/scholarship-support/")
                startActivity(openURL)
            }
        mBtnStrathHumanities1 = findViewById(R.id.mBtnStrathmoreHumanities)
            mBtnStrathHumanities1!!.setOnClickListener{
                val openURL = Intent(android.content.Intent.ACTION_VIEW)
                openURL.data = Uri.parse("https://su-sso.strathmore.edu/fa")
                startActivity(openURL)
            }
    }
}