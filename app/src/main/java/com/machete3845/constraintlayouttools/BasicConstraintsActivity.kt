package com.machete3845.constraintlayouttools

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BasicConstraintsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basic_constraints)

        val centerButton: Button = findViewById(R.id.centerButton)
        centerButton.setOnClickListener {
            Toast.makeText(this, "Center button clicked!", Toast.LENGTH_SHORT).show()
        }

        // Set up the action bar
        supportActionBar?.apply {
            title = "Basic Constraints"
            setDisplayHomeAsUpEnabled(true)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}