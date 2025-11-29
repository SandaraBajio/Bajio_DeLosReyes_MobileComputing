package com.example.loginformpractice

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val inputFullName = findViewById<EditText>(R.id.input_full_name)
        val inputEmail = findViewById<EditText>(R.id.input_email)
        val inputPassword = findViewById<EditText>(R.id.input_password)
        val inputConfirmPassword = findViewById<EditText>(R.id.input_confirm_password)
        val buttonRegister = findViewById<Button>(R.id.button_register)
        val textLogin = findViewById<TextView>(R.id.text_login)
        val buttonBack = findViewById<ImageView>(R.id.button_back)

        buttonBack.setOnClickListener {
            finish() // Goes back to the previous activity
        }

        textLogin.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            // Clear the back stack so the user can't go back to RegisterActivity with back button
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }

        buttonRegister.setOnClickListener {
            val fullName = inputFullName.text.toString().trim()
            val email = inputEmail.text.toString().trim()
            val password = inputPassword.text.toString().trim()
            val confirmPassword = inputConfirmPassword.text.toString().trim()
            var isValid = true

            if (fullName.isEmpty()) {
                inputFullName.error = getString(R.string.error_empty_name)
                isValid = false
            }

            if (email.isEmpty()) {
                inputEmail.error = getString(R.string.error_empty_email)
                isValid = false
            }

            if (password.isEmpty()) {
                inputPassword.error = getString(R.string.error_empty_password)
                isValid = false
            }

            if (isValid) {
                 // Proceed with registration (e.g., show a toast for now)
                 Toast.makeText(this, "Registration Successful!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}