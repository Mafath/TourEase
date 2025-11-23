package com.example.tourease
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ForgotPasswordActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        val continueBtn: View = findViewById(R.id.btn_fp_continue)

        continueBtn.setOnClickListener {
            startActivity(Intent(this, VerifyEmailActivity::class.java))
            finish() //prevent returning to this screen
        }
    }
}
