package com.example.splash
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val welcomeText = findViewById<TextView>(R.id.welcome_text)
        val name = intent.getStringExtra("USER_NAME")
        welcomeText.text = "Hello, $name!"

        // ImageViews के references लें
        val imgRomantic: ImageView = findViewById(R.id.imgRomantic)
        val imgFresh: ImageView = findViewById(R.id.imgFresh)
        val imgAngry: ImageView = findViewById(R.id.imgAngry)
        val imgSad: ImageView = findViewById(R.id.imgSad)

        // Click Listeners लगाएं
        imgRomantic.setOnClickListener { openRomanticActivity() }
        imgFresh.setOnClickListener { openFreshActivity() }
        imgAngry.setOnClickListener { openAngryActivity() }
        imgSad.setOnClickListener { openSadActivity() }
    }

    // अलग-अलग Activities खोलने के लिए methods
    private fun openRomanticActivity() {
        val intent = Intent(this, RomanticActivity::class.java)
        startActivity(intent)
    }

    private fun openFreshActivity() {
        val intent = Intent(this, FreshActivity::class.java)
        startActivity(intent)
    }

    private fun openAngryActivity() {
        val intent = Intent(this, AngryActivity::class.java)
        startActivity(intent)
    }

    private fun openSadActivity() {
        val intent = Intent(this, SadActivity::class.java)
        startActivity(intent)
    }
}


