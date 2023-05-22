package com.example.taxi

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class BookActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)
        val create: Button? = findViewById(R.id.bt_create)
        val find :Button?=findViewById(R.id.bt_find)

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