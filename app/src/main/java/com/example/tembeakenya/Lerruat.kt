package com.example.tembeakenya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Lerruat : AppCompatActivity() {
    lateinit var button5: Button
    lateinit var button6: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lerruat)
        button5=findViewById(R.id.button5)
        button5.setOnClickListener {
            var intent6= Intent(baseContext,LandA::class.java)
            startActivity(intent6)
        }
        button6=findViewById(R.id.button6)
        button6.setOnClickListener {
            var intent7= Intent(baseContext,Coast::class.java)
            startActivity(intent7)
        }
    }
}