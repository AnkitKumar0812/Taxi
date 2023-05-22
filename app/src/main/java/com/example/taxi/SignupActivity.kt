package com.example.taxi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)


        val save: Button? = findViewById(R.id.save)

        save?.setOnClickListener {
            val intent = Intent(this, Create::class.java)
            startActivity(intent)
            finish()
        }
    }
}