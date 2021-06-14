package com.example.tembeakenya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LandA : AppCompatActivity() {
    lateinit var button3: Button
    lateinit var button4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_land)
        button3=findViewById(R.id.button3)
        button3.setOnClickListener {
            var intent4= Intent(baseContext,Ngong::class.java)
            startActivity(intent4)
        }
        button4=findViewById(R.id.button4)
        button4.setOnClickListener {
            var intent5= Intent(baseContext,Lerruat::class.java)
            startActivity(intent5)
        }
    }
}