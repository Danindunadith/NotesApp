package com.example.myapplication3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ui2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ui2)

        val buttg = findViewById<Button>(R.id.next2)
        buttg.setOnClickListener {
            val intent = Intent(this,ui3::class.java)
            startActivity(intent)
        }
    }
}