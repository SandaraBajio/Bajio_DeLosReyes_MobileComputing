package com.example.loginformpractice

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // 1. Find the Back Button by its ID (from activity_register.xml)
        val backButton = findViewById<ImageView>(R.id.button_back)

        // 2. Find the Login Text by its ID (from activity_register.xml)
        val loginText = findViewById<TextView>(R.id.text_login)

        // 3. Make the Back Button go to MainActivity
        backButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Closes the Register screen
        }

        // 4. Make the "Login" text at the bottom go to MainActivity
        loginText.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Closes the Register screen
        }
    }
}
