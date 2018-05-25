package com.werockstar.kotlintesting.data.cache

import android.content.SharedPreferences
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class TungeSharedPreferencesTest {

    @Mock lateinit var sharedPreferences
            : SharedPreferences

    @Mock lateinit var editor: SharedPreferences.Editor

    lateinit var tungeSharedPreferences
            : TungeSharedPreferences

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)

        tungeSharedPreferences =
                TungeSharedPreferences(sharedPreferences)
    }

    @Test
    fun `when saveInt should call commit and putInt`() {
        val key = "key"
        val value = 1
        Mockito.`when`(sharedPreferences.edit())
                .thenReturn(editor)

        tungeSharedPreferences.saveInt(key, 1)

        Mockito.verify(editor).putInt(key, value)
        Mockito.verify(editor).commit()
    }

    @Test
    fun `when readInt should call getInt`() {
        val key = "key"

        Mockito.`when`(sharedPreferences.getInt(key, 0))
                .thenReturn(100)

        assertEquals(100, tungeSharedPreferences.readInt(key))
    }
}