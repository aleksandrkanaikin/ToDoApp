package com.example.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.todoapp.databinding.ActivityRegistrationBinding

class Registration : AppCompatActivity() {
    private lateinit var binding: ActivityRegistrationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        binding = ActivityRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerButton.setOnClickListener{

            val name = binding.enterName.text
            val email = binding.enterEmail.text
            val pass = binding.enterPassword.text
            val confirmPass = binding.confirmPassword.text

            if (ValidName(name) != null ||
                ValidEmail(email) != null ||
                ValidPassword(pass) != null ||
                ValidConfirmPassword(pass, confirmPass) != null){
                binding.enterNameLayout.error = ValidName(name)
                binding.enterEmailLayout.error = ValidEmail(email)
                binding.enterPasswordLayout.error = ValidPassword(pass)
                binding.confirmPasswordLayout.error = ValidConfirmPassword(pass, confirmPass)
            }
            else{
                binding.enterNameLayout.error = ""
                binding.enterEmailLayout.error = ""
                binding.enterPasswordLayout.error = ""
                binding.confirmPasswordLayout.error = ""
                Toast.makeText(this, "Success!", Toast.LENGTH_SHORT).show()
            }


        }
    }
}