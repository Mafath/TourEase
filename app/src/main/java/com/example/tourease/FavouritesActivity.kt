package com.example.tourease

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class FavouritesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_favourites)

        val bottom = findViewById<BottomNavigationView>(R.id.bottom_nav)

        bottom.selectedItemId = R.id.nav_fav

        bottom.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    if (this !is HomePageActivity) {
                        val intent = Intent(this, HomePageActivity::class.java).apply {
                            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
                        }
                        startActivity(intent)
                        overridePendingTransition(0, 0)
                    }
                    true
                }
                R.id.nav_fav -> {
                    if (this !is HomePageActivity) {
                        startActivity(Intent(this, HomePageActivity::class.java)
                            .addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP))
                        overridePendingTransition(0, 0)
                    }
                    true
                }
                R.id.nav_grid -> { // Quick Bookings
                    if (this !is QuickBookingsActivity) { // change ExploreActivity → QuickBookingsActivity if you have it
                        startActivity(Intent(this, QuickBookingsActivity::class.java)
                            .addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP))
                        overridePendingTransition(0, 0)
                    }
                    true
                }
                R.id.nav_profile -> {
                    if (this !is ManageProfileActivity) {
                        startActivity(Intent(this, ManageProfileActivity::class.java)
                            .addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP))
                        overridePendingTransition(0, 0)
                    }
                    true
                }
                else -> false
            }
        }
    }
}