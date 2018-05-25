package com.werockstar.kotlintesting.data.cache

import android.content.SharedPreferences
import javax.inject.Inject

class TungeSharedPreferences
@Inject constructor(val sharedPreferences: SharedPreferences) {

    fun saveInt(key: String, value: Int) {
        val editor = sharedPreferences.edit()
        editor.putInt(key, value)
        editor.commit()
    }

    fun readInt(key: String): Int {
        return sharedPreferences.getInt(key, 0)
    }


}