package com.example.basic

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.basic.databinding.ActivityC20AlertButtonBinding

class c20AlertButton : AppCompatActivity() {override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_c20_alert_button)
    val btnAlert = findViewById<Button>(R.id.btnAlert)

    btnAlert.setOnClickListener {

        val builder = AlertDialog.Builder(this)
        builder.setTitle("Login Alert")
            .setMessage("Are you sure, you want to continue ?")
            .setCancelable(true)
// .setMessage("this is alert")
            .setIcon(android.R.drawable.ic_dialog_alert)


//performing positive action
        builder.setPositiveButton("Yes") { dialogInterface, which ->
            Toast.makeText(applicationContext, "clicked yes", Toast.LENGTH_LONG).show()
        }
//performing cancel action
        builder.setNeutralButton("Cancel") { dialogInterface, which ->
            Toast.makeText(applicationContext, "clicked cancel\n operation cancel", Toast.LENGTH_LONG).show()
        }
//performing negative action
        builder.setNegativeButton("No") { dialogInterface, which ->
            Toast.makeText(applicationContext, "clicked No", Toast.LENGTH_LONG).show()
        }

        val alertDialog:AlertDialog = builder.create()
        alertDialog.show()
    }
}
}