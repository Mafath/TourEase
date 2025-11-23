package com.example.tourease
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class TourPaymentSuccessActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tour_payment_success)

        val goHome: View = findViewById(R.id.btn_go_home)

        goHome.setOnClickListener {
            startActivity(Intent(this, HomePageActivity::class.java))
            finish() //prevent returning to this screen
        }

    }
}
