package com.example.tembeakenya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Ngong : AppCompatActivity() {
    lateinit var button: Button
    lateinit var button2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ngong)
        button=findViewById(R.id.button)
        button.setOnClickListener {
            var intent1= Intent(baseContext,MainActivity::class.java)
            startActivity(intent1)
        }
        button2=findViewById(R.id.button2)
        button2.setOnClickListener {
            var intent2=Intent(baseContext,LandA::class.java)
            startActivity(intent2)
        }
    }
}