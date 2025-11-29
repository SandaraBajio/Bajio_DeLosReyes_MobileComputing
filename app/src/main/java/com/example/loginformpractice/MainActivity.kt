package com.example.loginformpractice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputUsername = findViewById<EditText>(R.id.input_username)
        val inputPassword = findViewById<EditText>(R.id.input_password)
        val buttonLogin = findViewById<Button>(R.id.button_login)
        val textSignup = findViewById<TextView>(R.id.text_signup)

        textSignup.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        buttonLogin.setOnClickListener {
            val username = inputUsername.text.toString().trim()
            val password = inputPassword.text.toString().trim()
            var isValid = true

            if (username.isEmpty()) {
                inputUsername.error = getString(R.string.error_empty_username)
                isValid = false
            }

            if (password.isEmpty()) {
                inputPassword.error = getString(R.string.error_empty_password)
                isValid = false
            }

            if (isValid) {
                // Proceed with login
                Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}