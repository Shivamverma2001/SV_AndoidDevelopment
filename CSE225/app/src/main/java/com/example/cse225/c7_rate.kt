package com.example.cse225

import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.cse225.databinding.ActivityC7RateBinding

class c7_rate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c7_rate)

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