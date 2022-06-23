package com.example.secondapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val message = findViewById<TextView>(R.id.message)
        val inputMessage = findViewById<EditText>(R.id.name)
        val submitButton = findViewById<Button>(R.id.btnSubmit)
        var enteredName = ""

        submitButton.setOnClickListener{
            enteredName = inputMessage.text.toString()
            if(enteredName == "") {
                Toast.makeText(this@MainActivity, "please, enter your name", Toast.LENGTH_SHORT)
                    .show()
            }else{
                val welcomeMessage = "Welcome $enteredName"
                message.text = welcomeMessage
                inputMessage.text.clear()

            }
        }
    }
}