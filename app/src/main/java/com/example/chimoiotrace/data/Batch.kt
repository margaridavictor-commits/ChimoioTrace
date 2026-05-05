package com.example.chimoiotrace.data

data class Batch(
    val id: String = "",
    val category: String = "",
    val quantity: Int = 0,
    val location: String = "",
    val ownerName: String = "",
    val productionDate: String = "",
    val expiryDate: String = ""
)