package com.example.tourease

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ProfileMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_menu)

        val closeBtn: View = findViewById(R.id.btn_drawer_close)
        val profileIcon: View = findViewById(R.id.img_avatar)
        val userName: View = findViewById(R.id.tv_user_name)
        val profileRow: View = findViewById(R.id.row_manage_profile)
        val logout: View = findViewById(R.id.logout_row)


        closeBtn.setOnClickListener {
            startActivity(Intent(this, HomePageActivity::class.java))
            finish()
        }

        profileIcon.setOnClickListener {
            startActivity(Intent(this, ManageProfileActivity::class.java))
            finish()
        }

        userName.setOnClickListener {
            startActivity(Intent(this, ManageProfileActivity::class.java))
            finish()
        }

        profileRow.setOnClickListener {
            startActivity(Intent(this, ManageProfileActivity::class.java))
            finish()
        }

        logout.setOnClickListener {
            startActivity(Intent(this, LogoutMenuActivity::class.java))
            finish()
        }
    }
}

