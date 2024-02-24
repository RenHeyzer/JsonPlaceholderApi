package com.geeks.jsonplaceholderapi.data.local.room.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.geeks.jsonplaceholderapi.data.local.room.dao.PhotosDao
import com.geeks.jsonplaceholderapi.data.local.room.entitiy.PhotoEntity

@Database(entities = [PhotoEntity::class], version = 1, exportSchema = false)
abstract class JsonPlaceholderDatabase : RoomDatabase() {

    abstract fun photosDao(): PhotosDao
}