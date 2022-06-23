package com.example.secondapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
        val text = findViewById<TextView>(R.id.Diwali)
        val userName = intent.getStringExtra("USER")
        val message = "Welcome $userName , you will get free access to all the e-books, so download and enjoy now and give sweet to others this diwali"
        text.text = message
    }
}