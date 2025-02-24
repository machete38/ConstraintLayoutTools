package com.machete3845.constraintlayouttools

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1: Button = findViewById(R.id.bt1)

        btn1.setOnClickListener {
            startActivity(Intent(this, BasicConstraintsActivity::class.java))
        }

    }


}