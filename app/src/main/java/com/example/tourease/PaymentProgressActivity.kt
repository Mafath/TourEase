package com.example.tourease
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PaymentProgressActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_progress)

        window.decorView.postDelayed({
            startActivity(Intent(this, PaymentSuccessActivity::class.java))
            finish()
        }, 1500)

    }
}
