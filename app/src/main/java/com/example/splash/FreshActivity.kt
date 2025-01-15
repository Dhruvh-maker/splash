package com.example.splash

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FreshActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fresh)

        // Reference to the parent LinearLayout

        // Song list with YouTube links
        val songs = listOf(
            Pair("Khairiyat (Chhichhore)", "https://www.youtube.com/watch?v=RqtFVZ6pE5c"),
            Pair("Ilahi (Yeh Jawaani Hai Deewani)", "https://www.youtube.com/watch?v=7OPP4ZMr-zA"),
            Pair("Phir Se Ud Chala (Rockstar)", "https://www.youtube.com/watch?v=KoaN0p2WvLs"),
            Pair("Patakha Guddi (Highway)", "https://www.youtube.com/watch?v=hvPVSF9Eni4"),
            Pair("Zinda (Bhaag Milkha Bhaag)", "https://www.youtube.com/watch?v=AfgLce-lXh0"),
            Pair("Roobaroo (Rang De Basanti)", "https://www.youtube.com/watch?v=ji4-FBbEEho"),
            Pair("Apna Time Aayega (Gully Boy)", "https://www.youtube.com/watch?v=GFXbdSDW4yo"),
            Pair("Subah Subah (Sonu Ke Titu Ki Sweety)", "https://www.youtube.com/watch?v=EGXvhVcUe3A"),
            Pair("Journey Song (Piku)", "https://www.youtube.com/watch?v=bje6NC-9eAw"),
            Pair("Matargashti (Tamasha)", "https://www.youtube.com/watch?v=Nt_qaNwB9Ek")
        )

        // Dynamically add TextViews for each song
        for (song in songs) {
            val textView = TextView(this).apply {
                text = song.first
                textSize = 18f
                setPadding(16, 16, 16, 16)
                setTextColor(resources.getColor(android.R.color.black, null))
                setOnClickListener {
                    // Open YouTube link
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(song.second))
                    startActivity(intent)
                }
            }

        }
    }
}
