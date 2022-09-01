package com.example.scholarshipapp_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {


    private var editTextEmail: EditText? = null
    private var editTextPassword: EditText? = null
    private var buttonSave: Button? = null

    private lateinit var dbRef: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextEmail = findViewById(R.id.mEdtEmail)
        editTextPassword = findViewById((R.id.mEdtPassword))
        buttonSave = findViewById(R.id.mBtnProceed)

        dbRef = FirebaseDatabase.getInstance().getReference("Students")

        val firebase: DatabaseReference = FirebaseDatabase.getInstance().getReference()

        buttonSave!!.setOnClickListener {
           saveStudentData()
        }

    }
    private fun saveStudentData(){
        val stdEmail = editTextEmail!!.text.toString()
        val stdPassword = editTextPassword!!.text.toString()


        if (stdEmail.isEmpty()) {
            editTextEmail!!.setError("Please enter your email address to proceed.")
        }else if (stdPassword.isEmpty()) {
            editTextPassword!!.setError("Please enter your password to proceed.")
        }else{
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }

            val stdId = dbRef.push().key!!
            val students = StudentModel(stdId, stdEmail, stdPassword)

            dbRef.child(stdId).setValue(students)
                .addOnCompleteListener{
                    Toast.makeText(this, "Data input successful!",Toast.LENGTH_LONG).show()
                }.addOnFailureListener{ error ->
                    Toast.makeText(this, "Error ${error.message}",Toast.LENGTH_LONG).show()
                }
    }
}


