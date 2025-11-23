package com.example.tourease

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Onboarding1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding1)

        val skip = findViewById<TextView>(R.id.btn_skip)
        val next = findViewById<TextView>(R.id.btn_next)

        val toOnboarding2 = Intent(this, Onboarding2Activity::class.java)
        val toSignup = Intent(this, SignupActivity::class.java)

        skip.setOnClickListener {
            startActivity(toSignup)
            finish()
        }

        next.setOnClickListener {
            startActivity(toOnboarding2)
            finish()
        }
    }
}
