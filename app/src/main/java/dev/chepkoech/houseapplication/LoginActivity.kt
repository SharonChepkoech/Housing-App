package dev.chepkoech.houseapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import dev.chepkoech.houseapplication.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.tvSignUp.setOnClickListener {
            intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }

        binding.btnLogin.setOnClickListener {
            validate()
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }

    fun validate() {
        var email = binding.etEmail.text.toString()
        var password = binding.etPassword.text.toString()

        if (email.isBlank()) {
            binding.tilEmail.error = "Please input email"
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            binding.tilEmail.error = "Email is invalid"
        }
        if (password.isBlank()) {
            binding.tilPassword.error = "Please input password"
        }
    }
}