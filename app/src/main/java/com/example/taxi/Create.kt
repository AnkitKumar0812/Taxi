package com.example.taxi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Create : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create)

        val create=findViewById<Button>(R.id.bt_create)
        val find=findViewById<Button>(R.id.bt_find)


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