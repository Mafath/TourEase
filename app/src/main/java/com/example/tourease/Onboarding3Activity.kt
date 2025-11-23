package com.example.tourease

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Onboarding3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding3)

        val skip = findViewById<TextView>(R.id.btn_skip)
        val next = findViewById<TextView>(R.id.btn_next)
        val hero = findViewById<ImageView>(R.id.hero_image)

        val toGetstarted = Intent(this, GetStartedActivity::class.java)
        val toSignup = Intent(this, SignupActivity::class.java)

        skip.setOnClickListener {
            startActivity(toSignup)
            finish()
        }

        next.setOnClickListener {
            startActivity(toGetstarted)
            finish()
        }
    }
}
