package com.example.secondapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val text = findViewById<TextView>(R.id.offer)
        val userName = intent.getStringExtra("USER")
        val message = "Welcome $userName , you will get free access to netflix for a month, enjoy movies upto 1 month"
        text.text = message
    }
}