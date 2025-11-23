package com.example.tourease

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SigninActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        val login = findViewById<Button>(R.id.btn_login)
        val register = findViewById<TextView>(R.id.link_register)
        val forgot = findViewById<TextView>(R.id.forgot_password)

        val toHome = Intent(this, HomePageActivity::class.java)
        val toRegister = Intent(this, SignupActivity::class.java)
        val toForgot = Intent(this, ForgotPasswordActivity::class.java)

        register.setOnClickListener {
            startActivity(toRegister)
            finish()
        }

        login.setOnClickListener {
            startActivity(toHome)
            finish()
        }

        forgot.setOnClickListener {
            startActivity(toForgot)
            finish()
        }
    }

}