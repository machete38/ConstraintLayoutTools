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
        val btn2: Button = findViewById(R.id.bt2)

        btn1.setOnClickListener {
            startActivity(Intent(this, BasicConstraintsActivity::class.java))
        }
        btn2.setOnClickListener {
            startActivity(Intent(this, ChainsActivity::class.java))
        }

    }


}