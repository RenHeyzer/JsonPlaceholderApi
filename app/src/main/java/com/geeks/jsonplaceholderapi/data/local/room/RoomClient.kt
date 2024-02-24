package com.geeks.jsonplaceholderapi.data.local.room

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.geeks.jsonplaceholderapi.data.local.room.database.JsonPlaceholderDatabase

object RoomClient {

    private const val DATABASE_NAME = "json-placeholder_database"
    lateinit var database: JsonPlaceholderDatabase
        private set

    fun init(context: Context) {
        database = Room.databaseBuilder(
            context, JsonPlaceholderDatabase::class.java, DATABASE_NAME
        ).allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()
    }
}