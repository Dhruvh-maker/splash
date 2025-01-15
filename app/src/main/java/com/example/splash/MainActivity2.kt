package com.example.splash

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity2 : AppCompatActivity() {
    lateinit var database : DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPass = findViewById<EditText>(R.id.etPassword)
        val etPassC = findViewById<EditText>(R.id.etConfirmPassword)
        val signUP = findViewById<Button>(R.id.sign_up_button)
        val edt = findViewById<EditText>(R.id.name_edit_text)


        signUP.setOnClickListener{

            val email = etEmail.text.toString()
            val pass = etPass.text.toString()
            val pass2 = etPassC.text.toString()
            val name = edt.text.toString()
            val user = User(name,email ,pass,pass2)
            database = FirebaseDatabase.getInstance().getReference("User")
            database.child(name).setValue(user).addOnSuccessListener {

                Toast.makeText(this, "User Registered",Toast.LENGTH_SHORT).show()
            }
            val intent = Intent(this,MainActivity3::class.java)
            intent.putExtra("USER_NAME", name)
            startActivity(intent)
        }

        }
}
