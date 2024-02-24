package com.geeks.jsonplaceholderapi.data.remote.models

import com.geeks.jsonplaceholderapi.data.local.room.entitiy.PhotoEntity
import com.google.gson.annotations.SerializedName

data class Photo(
    @SerializedName("albumId")
    val albumId: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("url")
    val url: String,
    @SerializedName("thumbnailUrl")
    val thumbnailUrl: String
)

fun Photo.toEntity() = PhotoEntity(
    albumId = albumId,
    id = id,
    title = title,
    url = url,
    thumbnailUrl = thumbnailUrl
)