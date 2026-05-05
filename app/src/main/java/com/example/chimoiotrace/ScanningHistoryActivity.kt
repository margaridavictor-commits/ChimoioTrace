package com.example.chimoiotrace

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore

class ScanningHistoryActivity : AppCompatActivity() {

    private lateinit var firestore: FirebaseFirestore
    private lateinit var auth: FirebaseAuth
    private lateinit var historyListView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scanning_history)

        firestore = FirebaseFirestore.getInstance()
        auth = FirebaseAuth.getInstance()
        historyListView = findViewById(R.id.historyListView)

        loadScanningHistory()
    }

    private fun loadScanningHistory() {
        val userId = auth.currentUser?.uid ?: return

        firestore.collection("users").document(userId).collection("scanned_history")
            .get()
            .addOnSuccessListener { documents ->
                val historyList = mutableListOf<String>()
                for (document in documents) {
                    val batchId = document.getString("batchId") ?: "Unknown"
                    val timestamp = document.getTimestamp("timestamp")?.toDate()?.toString() ?: "No date"
                    historyList.add("Lote: $batchId - Escaneado em: $timestamp")
                }
                val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, historyList)
                historyListView.adapter = adapter
            }
            .addOnFailureListener {
                // Handle error
            }
    }
}