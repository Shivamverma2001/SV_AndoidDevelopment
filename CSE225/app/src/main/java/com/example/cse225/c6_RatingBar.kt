package com.example.cse225

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class c6_RatingBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c6_rating_bar)

        val first = findViewById<RatingBar>(R.id.first)
        val second = findViewById<RatingBar>(R.id.second)
        val third = findViewById<RatingBar>(R.id.third)
        val forth = findViewById<RatingBar>(R.id.forth)
        val fifth = findViewById<RatingBar>(R.id.fifth)

        val rate = findViewById<Button>(R.id.rate)
        val sixth = findViewById<RatingBar>(R.id.sixth)

        rate.setOnClickListener {
//          val star = first.numStars + second.numStars + third.numStars + forth.numStars + fifth.numStars
            val rated = first.rating + second.rating + third.rating + forth.rating + fifth.rating
            val finalRating = rated / 5
            sixth.rating = finalRating
            Toast.makeText(this@c6_RatingBar, "Rated: $finalRating", Toast.LENGTH_SHORT).show()
        }

        // Code to create a Custom alert Dialog when pressing back button.
        fun onBackPressed() {

            val ad = AlertDialog.Builder(this)
            ad.setTitle("Feedback")
            ad.setMessage("Could you rate us?")

//      Creating/inflating rating view in the Alert Dialog.
            val vg: ViewGroup? = findViewById(R.id.ratelayout)
            val inflater = layoutInflater

            val layout: View = inflater.inflate(R.layout.activity_c7_rate, vg)
            ad.setView(layout)

//      Action on OK button
            ad.setPositiveButton("OK") { _, _ ->
                val alertStar = layout.findViewById<RatingBar>(R.id.ratingback)
                val alertRated = alertStar.rating

//+++++++++++++++++++++++++++++==================================+++++++++++++++++++++++++++++++++++++++++++
//      If/Else Condition check (Optional)

                if (alertRated >= 3) {
                    Toast.makeText(this, "Thanks for $alertRated rating.", Toast.LENGTH_SHORT).show()

                } else {
                    Toast.makeText(this, "Rated $alertRated, Will not disappoint you next time", Toast.LENGTH_LONG).show()

                }
//+++++++++++++++++++++++++++++==================================+++++++++++++++++++++++++++++++++++++++++++
//          For Creating a delay

                Handler(Looper.getMainLooper()).postDelayed(
                    {
                        super.onBackPressed()
                    }, 5000)

            }

//      Action on negative button.
            ad.setNegativeButton("NO") { _, _ ->
                super.onBackPressed()
            }
            ad.setCancelable(false)
            ad.show()
        }
}}