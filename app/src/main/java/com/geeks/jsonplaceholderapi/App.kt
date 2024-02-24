package com.geeks.jsonplaceholderapi

import android.app.Application
import com.geeks.jsonplaceholderapi.data.local.preferences.PreferencesHelper
import com.geeks.jsonplaceholderapi.data.local.room.RoomClient

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        RoomClient.init(this)
        PreferencesHelper.init(this)
    }
}