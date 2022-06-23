package com.example.secondapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val text = findViewById<TextView>(R.id.btnHoli)
        val userName = intent.getStringExtra("USER")
        val message = "Welcome $userName , On this Holi, you will get 70% off on any colors purchased on our app to enjoy your Holi and to give others a colorful and joyful life"
        text.text = message

    }
}