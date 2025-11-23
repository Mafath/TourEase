package com.example.tourease
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class CalenderActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calender)

        val calender: View = findViewById(R.id.calendar_card)

        calender.setOnClickListener {
            startActivity(Intent(this, TourGuidePersonActivity::class.java))
            finish() //prevent returning to this screen
        }

    }
}
