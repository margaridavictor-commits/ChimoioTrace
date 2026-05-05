package com.example.chimoiotrace

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Button

class ProducerDashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_producer_dashboard)

        val welcomeText = findViewById<TextView>(R.id.welcomeTextView)
        val addBatchButton = findViewById<Button>(R.id.addBatchButton)
        val viewBatchesButton = findViewById<Button>(R.id.viewBatchesButton)

        // Simple logic
        welcomeText.text = "Bem-vindo ao Dashboard do Produtor!"

        addBatchButton.setOnClickListener {
            // Navigate to add batch activity (not implemented)
        }

        viewBatchesButton.setOnClickListener {
            // Navigate to view batches (not implemented)
        }
    }
}