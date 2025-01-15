package com.example.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashscreen) // Ensure this file exists

        // Delay for 3 seconds before navigating to the next activity
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity2::class.java) // Ensure MainActivity2 exists
            startActivity(intent)
            finish() // Close SplashActivity
        }, 3000)
    }
}

