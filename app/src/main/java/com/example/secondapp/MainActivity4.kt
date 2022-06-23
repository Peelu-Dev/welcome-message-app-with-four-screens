package com.example.secondapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        val inputMessage = findViewById<TextView>(R.id.btnNew)
        val userName = intent.getStringExtra("USER")
        val message = "Welcome $userName, On every holidays you will get 20-70% off on any products purchased on our app to give you a relief on these bad days "
        inputMessage.text = message
    }
}