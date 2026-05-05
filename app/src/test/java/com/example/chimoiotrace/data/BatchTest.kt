package com.example.chimoiotrace.data

import org.junit.Assert.assertEquals
import org.junit.Test

class BatchTest {

    @Test
    fun testBatchCreation() {
        val batch = Batch(
            id = "1",
            category = "milho",
            quantity = 100,
            location = "-19.123, 33.456",
            ownerName = "João Silva",
            productionDate = "2023-01-01",
            expiryDate = "2023-06-01"
        )

        assertEquals("1", batch.id)
        assertEquals("milho", batch.category)
        assertEquals(100, batch.quantity)
        assertEquals("-19.123, 33.456", batch.location)
        assertEquals("João Silva", batch.ownerName)
        assertEquals("2023-01-01", batch.productionDate)
        assertEquals("2023-06-01", batch.expiryDate)
    }

    @Test
    fun testBatchDefaultValues() {
        val batch = Batch()

        assertEquals("", batch.id)
        assertEquals("", batch.category)
        assertEquals(0, batch.quantity)
        assertEquals("", batch.location)
        assertEquals("", batch.ownerName)
        assertEquals("", batch.productionDate)
        assertEquals("", batch.expiryDate)
    }
}