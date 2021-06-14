package com.example.tembeakenya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnExplore: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnExplore=findViewById(R.id.btnExplore)
        btnExplore.setOnClickListener {
            var intent=Intent(baseContext,Ngong::class.java)
            startActivity(intent)
        }
    }
}