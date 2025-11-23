package com.example.tourease

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val signup = findViewById<Button>(R.id.btn_signup)
        val login = findViewById<TextView>(R.id.link_login)

        val toLogin = Intent(this, SigninActivity::class.java)

        signup.setOnClickListener {
            startActivity(toLogin)
            finish()
        }

        login.setOnClickListener {
            startActivity(toLogin)
            finish()
        }
    }
}