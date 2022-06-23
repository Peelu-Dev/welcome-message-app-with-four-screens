package com.example.secondapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
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
        val offersButton = findViewById<Button>(R.id.btnOffer)
        val diwaliOffer = findViewById<Button>(R.id.diwaliBtn)
        val holiOffer = findViewById<Button>(R.id.holiBtn)
        val newOffers = findViewById<Button>(R.id.newOffers)
        var enteredName = ""

        submitButton.setOnClickListener{
            enteredName = inputMessage.text.toString()
            if(enteredName == "") {
                offersButton.visibility = INVISIBLE
                Toast.makeText(this@MainActivity, "please, enter your name", Toast.LENGTH_SHORT)
                    .show()
            }else{
                val welcomeMessage = "Welcome $enteredName"
                message.text = welcomeMessage
                inputMessage.text.clear()
                offersButton.visibility = VISIBLE
            }
        }

        diwaliOffer.setOnClickListener{
            val intent = Intent(this,MainActivity1::class.java)
            intent.putExtra("USER",enteredName)
            startActivity(intent)
        }

        holiOffer.setOnClickListener{
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("USER",enteredName)
            startActivity(intent)
        }

        offersButton.setOnClickListener{
            val intent = Intent(this,MainActivity3::class.java)
            intent.putExtra("USER",enteredName)
            startActivity(intent)
        }

        newOffers.setOnClickListener{
            val intent = Intent(this,MainActivity4::class.java)
            intent.putExtra("USER",enteredName)
            startActivity(intent)
        }

    }
}