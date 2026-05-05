package com.example.chimoiotrace.data

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNull
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.MockitoAnnotations

class SessionManagerTest {

    @Mock
    private lateinit var mockAuth: FirebaseAuth

    @Mock
    private lateinit var mockUser: FirebaseUser

    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
        // Since SessionManager uses FirebaseAuth.getInstance(), we can't easily mock the singleton.
        // For simplicity, test the logic assuming no user.
    }

    @Test
    fun testIsUserLoggedIn_NoUser() {
        // Assuming no user is logged in
        assertFalse(SessionManager.isUserLoggedIn())
    }

    @Test
    fun testGetCurrentUserId_NoUser() {
        assertNull(SessionManager.getCurrentUserId())
    }

    // Note: Testing logout would require mocking, but for now, basic tests.
}