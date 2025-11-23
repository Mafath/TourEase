package com.example.tourease

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class LogoutMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_logout_menu)

        val cancel: View = findViewById(R.id.btn_cancel)
        val yes: View = findViewById(R.id.btn_confirm_logout)


        cancel.setOnClickListener {
            startActivity(Intent(this, HomePageActivity::class.java))
            finish() //prevent returning to this screen
        }

        yes.setOnClickListener {
            startActivity(Intent(this, SigninActivity::class.java))
            finish() //prevent returning to this screen
        }

    }
}

