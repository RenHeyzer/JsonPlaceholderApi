package com.geeks.jsonplaceholderapi.data.local.room.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.geeks.jsonplaceholderapi.data.local.room.entitiy.PhotoEntity

@Dao
interface PhotosDao {

    @Query("SELECT * FROM photo_entity")
    fun getPhotos(): LiveData<List<PhotoEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPhoto(photo: PhotoEntity)
}