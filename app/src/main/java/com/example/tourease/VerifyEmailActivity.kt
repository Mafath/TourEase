package com.example.tourease
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class VerifyEmailActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_email)

        val continueBtn: View = findViewById(R.id.btn_code_continue)

        continueBtn.setOnClickListener {
            startActivity(Intent(this, ResetPasswordActivity::class.java))
            finish() //prevent returning to this screen
        }
    }
}
