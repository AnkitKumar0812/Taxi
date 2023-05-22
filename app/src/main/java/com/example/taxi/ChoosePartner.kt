package com.example.taxi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ChoosePartner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_partner)

        val gender: Button?=findViewById(R.id.bt_gender)
        val bt_female:Button?=findViewById(R.id.bt_female)

        gender?.setOnClickListener{
            val intent = Intent(this,RideChoice::class.java)
            startActivity(intent)
            finish()

        }
        bt_female?.setOnClickListener{
            val intent = Intent(this,RideChoice::class.java)
            startActivity(intent)
            finish()

        }
    }
}