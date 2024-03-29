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

        val simpleRatingBar = findViewById<RatingBar>(R.id.simpleRatingBar)
        val simpleRating = findViewById<RatingBar>(R.id.simpleRating)
        val submitButton = findViewById<Button>(R.id.submitButton)

        submitButton.setOnClickListener {
            val totalStars = "Total Stars: " + simpleRatingBar.numStars
            val rating = "Rating: " + simpleRatingBar.rating
            Toast.makeText(this, """ $totalStars$rating""".trimIndent(),
                Toast.LENGTH_LONG).show()
        }

        simpleRating.setOnRatingBarChangeListener{ ratingBar, rating, fromUser ->
            Toast.makeText(this, "rating $rating, $fromUser",
                Toast.LENGTH_LONG).show()
        }


    }

}