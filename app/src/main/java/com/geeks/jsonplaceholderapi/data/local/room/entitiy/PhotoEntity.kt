package com.geeks.jsonplaceholderapi.data.local.room.entitiy

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "photo_entity")
data class PhotoEntity(
    val albumId: Int,
    @PrimaryKey
    val id: Int,
    val title: String,
    val url: String,
    val thumbnailUrl: String
)