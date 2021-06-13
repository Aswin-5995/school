package com.example.school


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.school.MainActivity
import com.example.school.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class login : AppCompatActivity() {
    val firebaseAuth: FirebaseAuth = FirebaseAuth.getInstance()
    val firebaseUser: FirebaseUser? = firebaseAuth.currentUser
    lateinit var loginEmail: String
    lateinit var loginPassword: String

    lateinit var email : EditText
    lateinit var password : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        email= findViewById(R.id.txtEmail)
        password = findViewById(R.id.txtPassword)


        var login: Button = findViewById(R.id.button3)

        login.setOnClickListener {
            signInUser()
        }


    }

    private fun signInUser() {
        val lgn_email = email.text.toString()
        val lgn_pwd = password.text.toString()

        firebaseAuth.signInWithEmailAndPassword(lgn_email,  lgn_pwd )
            .addOnCompleteListener { signIn ->
                if (signIn.isSuccessful) {
                    startActivity(Intent(this, MainActivity::class.java))
                    Toast.makeText(applicationContext,"Logged in successfully", Toast.LENGTH_LONG).show()
                    finish()
                } else {
                    Toast.makeText(applicationContext,"sign in failed", Toast.LENGTH_LONG).show()
                }
            }
    }
}