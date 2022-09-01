package com.example.scholarshipapp_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class Activity2 : AppCompatActivity() {
    var editTextGrade: EditText? = null
    var editButtonProcess: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)
        editTextGrade = findViewById(R.id.mEdtGpa)
        editButtonProcess = findViewById(R.id.mBtnContinue)

        editButtonProcess!!.setOnClickListener{
            var studentGrade = editTextGrade!!.text.toString().trim()
            if(studentGrade == "A") {
                val intent = Intent(this,HighScrollingActivity::class.java)
                startActivity(intent)
            }
            if (studentGrade == "A+") {
                val intent = Intent(this, HighScrollingActivity::class.java)
                startActivity(intent)
            }
            if (studentGrade == "A-") {
                val intent = Intent(this, HighScrollingActivity::class.java)
                startActivity(intent)
            }
            if (studentGrade == "B+") {
                val intent = Intent(this, MidScrollingActivity::class.java)
                startActivity(intent)
            }
            if (studentGrade == "B") {
                val intent = Intent(this, MidScrollingActivity::class.java)
                startActivity(intent)
            }
            if (studentGrade == "B-") {
                val intent = Intent(this, MidScrollingActivity::class.java)
                startActivity(intent)
            }
            if (studentGrade == "C+") {
                val intent = Intent(this, LowScrollingActivity::class.java)
                startActivity(intent)
            }
            if (studentGrade == "C") {
                val intent = Intent(this, LowScrollingActivity::class.java)
                startActivity(intent)
            }
            if (studentGrade == "C-") {
                val intent = Intent(this, ErrorActivity::class.java)
                startActivity(intent)
            }
            if (studentGrade == "D+") {
                val intent = Intent(this, ErrorActivity::class.java)
                startActivity(intent)
            }
            if (studentGrade == "D") {
                val intent = Intent(this, ErrorActivity::class.java)
                startActivity(intent)
            }
            if (studentGrade == "D-") {
                val intent = Intent(this, ErrorActivity::class.java)
                startActivity(intent)
            }
            if (studentGrade == "E") {
                val intent = Intent(this, ErrorActivity::class.java)
                startActivity(intent)
            }
            if (studentGrade !== "A") {
                editTextGrade!!.setError("Please enter a credible grade to proceed (A, A-, etc).")
            }
            if (studentGrade !== "A+") {
                editTextGrade!!.setError("Please enter a credible grade to proceed (A, A-, etc).")
            }
            if (studentGrade !== "A-") {
                editTextGrade!!.setError("Please enter a credible grade to proceed (A, A-, etc).")
            }
            if (studentGrade !== "B+") {
                editTextGrade!!.setError("Please enter a credible grade to proceed (A, A-, etc).")
            }
            if (studentGrade !== "B") {
                editTextGrade!!.setError("Please enter a credible grade to proceed (A, A-, etc).")
            }
            if (studentGrade !== "B-") {
                editTextGrade!!.setError("Please enter a credible grade to proceed (A, A-, etc).")
            }
            if (studentGrade !== "C+") {
                editTextGrade!!.setError("Please enter a credible grade to proceed (A, A-, etc).")
            }
            if (studentGrade !== "C") {
                editTextGrade!!.setError("Please enter a credible grade to proceed (A, A-, etc).")
            }
            if (studentGrade !== "C-") {
                editTextGrade!!.setError("Please enter a credible grade to proceed (A, A-, etc).")
            }
            if (studentGrade !== "D+") {
                editTextGrade!!.setError("Please enter a credible grade to proceed (A, A-, etc).")
            }
            if (studentGrade !== "D-") {
                editTextGrade!!.setError("Please enter a credible grade to proceed (A, A-, etc).")
            }
            if (studentGrade !== "E") {
                editTextGrade!!.setError("Please enter a credible grade to proceed (A, A-, etc).")
            }
        }

    }
}


