package com.example.tourease
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class TourPaymentProgressActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tour_payment_progress)

        window.decorView.postDelayed({
            startActivity(Intent(this, TourPaymentSuccessActivity::class.java))
            finish()
        }, 1500)

    }
}
