package com.example.cse225

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast

class c2_RatingBarPrac : AppCompatActivity() {
    lateinit var r1: RatingBar
    lateinit var r2: RatingBar
    lateinit var r3: RatingBar
    lateinit var r4: RatingBar
    lateinit var r5: RatingBar
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c2_rating_bar_prac)
        r1=findViewById(R.id.r1)
        r2=findViewById(R.id.r2)
        r3=findViewById(R.id.r3)
        r4=findViewById(R.id.r4)
        r5=findViewById(R.id.r5)
        r1.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            Toast.makeText(this,"Your rating 1 score is ${r1.rating}", Toast.LENGTH_SHORT).show()
            var add=0
            var total=r1.numStars*5
            var a1=r1.rating
            var a2=r2.rating
            var a3=r3.rating
            var a4=r4.rating
            var res=(a1+a2+a3+a4)/4
            Toast.makeText(this,"Your average rating is $res", Toast.LENGTH_SHORT).show()
            r5.rating=res
        }
        r2.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            Toast.makeText(this,"Your rating 2 score is ${r2.rating}", Toast.LENGTH_SHORT).show()
            var add=0
            var total=r1.numStars*5
            var a1=r1.rating
            var a2=r2.rating
            var a3=r3.rating
            var a4=r4.rating
            var res=(a1+a2+a3+a4)/4
            Toast.makeText(this,"Your average rating is $res", Toast.LENGTH_SHORT).show()
            r5.rating=res
        }
        r3.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            Toast.makeText(this,"Your rating 3 score is ${r3.rating}", Toast.LENGTH_SHORT).show()
            var add=0
            var total=r1.numStars*5
            var a1=r1.rating
            var a2=r2.rating
            var a3=r3.rating
            var a4=r4.rating
            var res=(a1+a2+a3+a4)/4
            Toast.makeText(this,"Your average rating is $res", Toast.LENGTH_SHORT).show()
            r5.rating=res
        }
        r4.setOnRatingBarChangeListener { ratingBar, rating, fromUser ->
            Toast.makeText(this,"Your rating 4 score is ${r4.rating}", Toast.LENGTH_SHORT).show()
            var add=0
            var total=r1.numStars*5
            var a1=r1.rating
            var a2=r2.rating
            var a3=r3.rating
            var a4=r4.rating
            var res=(a1+a2+a3+a4)/4
            Toast.makeText(this,"Your average rating is $res", Toast.LENGTH_SHORT).show()
            r5.rating=res
        }
    }
}