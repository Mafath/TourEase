package com.example.tourease
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ResetPasswordActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password)

        val updateBtn: View = findViewById(R.id.btn_update_password)

        updateBtn.setOnClickListener {
            startActivity(Intent(this, SigninActivity::class.java))
            finish()
        }
    }
}
