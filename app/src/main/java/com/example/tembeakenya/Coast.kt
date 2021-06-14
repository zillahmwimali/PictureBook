package com.example.tembeakenya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Coast : AppCompatActivity() {
    lateinit var button7: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coast)
        button7=findViewById(R.id.button7)
        button7.setOnClickListener {
            var intent8= Intent(baseContext,Lerruat::class.java)
            startActivity(intent8)
        }
    }
}