package com.example.tourease

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class GetStartedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_getstarted)

        val btnGetStarted = findViewById<Button>(R.id.btn_get_started)

        btnGetStarted.setOnClickListener {
            startActivity(Intent(this, SignupActivity::class.java))
            finish() //prevent returning to this screen
        }
    }
}
