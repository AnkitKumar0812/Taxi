package com.example.taxi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val bLogin: Button? = findViewById(R.id.buttonLogin)

        bLogin?.setOnClickListener {
            val intent = Intent(this, Create::class.java)
            startActivity(intent)
            finish()

        }
    }
}