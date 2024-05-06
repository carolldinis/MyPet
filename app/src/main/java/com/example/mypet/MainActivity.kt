package com.example.mypet

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var getStartBtn: Button = findViewById(R.id.getStart)
        getStartBtn.setOnClickListener {
            val int = Intent(this, petActivity::class.java)
            startActivity(int)
        }
    }
}