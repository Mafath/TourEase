package com.example.tourease

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class TourPaymentActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tour_payment)


        val backBtn: View = findViewById(R.id.btn_back)
        val visa: View = findViewById(R.id.item_card_visa)


        backBtn.setOnClickListener {
            startActivity(Intent(this, TourActivity::class.java))
            finish() //prevent returning to this screen
        }

        visa.setOnClickListener {
            startActivity(Intent(this, TourPaymentProgressActivity::class.java))
            finish() //prevent returning to this screen
        }

        val bottom = findViewById<BottomNavigationView>(R.id.bottom_nav)

        bottom.selectedItemId = R.id.nav_grid

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
                    if (this !is FavouritesActivity) {
                        startActivity(Intent(this, FavouritesActivity::class.java)
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
