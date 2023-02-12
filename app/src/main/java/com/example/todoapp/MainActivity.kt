package com.example.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputBinding
import android.widget.Toast
import com.example.todoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signupview.setOnClickListener{
            startActivity(Intent(this, Registration::class.java))
        }

        binding.signinButton.setOnClickListener{
            val email = binding.emailInput.text
            val pass = binding.passwordInput.text

            if (ValidEmail(email) != null || ValidPassword(pass) != null){
                binding.emailInputLayout.error = ValidEmail(email)
                binding.passwordInputLayout.error = ValidPassword(pass)
            }
            else{
                binding.emailInputLayout.error = ""
                binding.passwordInputLayout.error = ""
                Toast.makeText(this, "Success!", Toast.LENGTH_SHORT).show()
            }
        }

    }


}