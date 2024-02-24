package com.geeks.jsonplaceholderapi.data.local.preferences

import android.content.Context
import android.content.SharedPreferences

object PreferencesHelper {

    private const val SHARED_PREFERENCES_NAME = "preferences_helper"
    private const val PHOTO_ID_KEY = "photo_id"
    private lateinit var sharedPreferences: SharedPreferences

    fun init(context: Context) {
        sharedPreferences =
            context.getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)
    }

    var photoId: Int
        get() = sharedPreferences.getInt(PHOTO_ID_KEY, 5000)
        set(value) = sharedPreferences.edit().putInt(PHOTO_ID_KEY, value).apply()
}