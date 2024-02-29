package com.geeks.jsonplaceholderapi.di

import android.content.Context
import androidx.room.Room
import com.geeks.jsonplaceholderapi.data.local.room.database.JsonPlaceholderDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

private const val DATABASE_NAME = "json-placeholder_database"

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideRoomDatabase(@ApplicationContext context: Context): JsonPlaceholderDatabase =
        Room.databaseBuilder(
            context, JsonPlaceholderDatabase::class.java, DATABASE_NAME
        ).allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()

    @Provides
    @Singleton
    fun providePhotosDao(database: JsonPlaceholderDatabase) = database.photosDao()
}