package com.example.mypet

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class petActivity : AppCompatActivity() {
    private lateinit var statePetImage: ImageView
    private lateinit var hungerTextView: TextView
    private lateinit var happinessTextView: TextView
    private lateinit var cleanTextView: TextView

    private var petHungerLevel = 50 // Initial hunger level
    private var petHappyLevel = 50 // Initial happiness level
    private var petCleanLevel = 50 // Initial happiness level

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pet)

        statePetImage = findViewById(R.id.petImage)
        hungerTextView = findViewById(R.id.hungerTextView)
        happinessTextView = findViewById(R.id.happinessTextView)
        cleanTextView = findViewById(R.id.cleanTextView)

        val feedButton: Button = findViewById(R.id.feedButton)
        feedButton.setOnClickListener {
            feedPet()
            updateStatus()
        }

        val playButton: Button = findViewById(R.id.playButton)
        playButton.setOnClickListener {
            playWithPet()
            updateStatus()
        }

        val cleanButton: Button = findViewById(R.id.cleanButton)
        cleanButton.setOnClickListener {
            clearPet()
            updateStatus()
        }
    }

    private fun feedPet() {
        // Increase pet's hunger level
        petHungerLevel += 10
        statePetImage.setImageResource(R.drawable.img_2)

        // Ensure hunger level is within bounds
        if (petHungerLevel < 0) {
            petHungerLevel = 0
        }
    }

    private fun playWithPet() {
        // Increase pet's happiness level
        petHappyLevel += 10
        statePetImage.setImageResource(R.drawable.img_3)

        // Ensure happiness level is within bounds
        if (petHappyLevel < 0) {
            petHappyLevel = 0
        }
    }

    private fun clearPet() {
        // Increase pet's hunger level
        petCleanLevel += 10
        statePetImage.setImageResource(R.drawable.img_4)

        // Ensure hunger level is within bounds
        if (petCleanLevel < 0) {
            petCleanLevel = 0
        }
    }

    private fun updateStatus() {
        hungerTextView.text = "Hunger: $petHungerLevel%"
        happinessTextView.text = "Happiness: $petHappyLevel%"
        cleanTextView.text = "Happiness: $petCleanLevel%"
    }
}