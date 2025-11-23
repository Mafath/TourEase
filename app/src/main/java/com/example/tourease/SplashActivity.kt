package com.example.tourease

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val appLogoImageView = findViewById<ImageView>(R.id.imageView2)

        window.decorView.postDelayed({
            startActivity(Intent(this, Onboarding1Activity::class.java))
            finish()
        }, 1500)
    }
}
