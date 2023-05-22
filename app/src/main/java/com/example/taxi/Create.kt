package com.example.taxi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Create : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)

        create?.setOnClickListener{
            val intent = Intent(this,ChoosePartner::class.java)
            startActivity(intent)
            finish()
        }

        find?.setOnClickListener{
            val intent = Intent(this,ChoosePartner::class.java)
            startActivity(intent)
            finish()
        }
    }
}