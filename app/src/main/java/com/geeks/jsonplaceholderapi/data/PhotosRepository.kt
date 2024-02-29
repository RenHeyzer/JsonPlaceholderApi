package com.geeks.jsonplaceholderapi.data

import com.geeks.jsonplaceholderapi.data.local.room.dao.PhotosDao
import com.geeks.jsonplaceholderapi.data.remote.apiservices.PhotosApiService
import com.geeks.jsonplaceholderapi.data.remote.models.Photo
import com.geeks.jsonplaceholderapi.data.remote.models.toEntity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class PhotosRepository @Inject constructor(
    private val photosApiService: PhotosApiService,
    private val photosDao: PhotosDao
) {

    fun addPhoto(
        photo: Photo,
        onResponse: (photo: Photo) -> Unit,
        onFailure: (message: String, t: Throwable) -> Unit
    ) {
        photosApiService.addPhoto(photo).enqueue(object : Callback<Photo> {
            override fun onResponse(call: Call<Photo>, response: Response<Photo>) {
                if (response.isSuccessful && response.body() != null) {
                    onResponse(response.body()!!)
                }
            }

            override fun onFailure(call: Call<Photo>, t: Throwable) {
                onFailure(t.message ?: "Unknown error!", t)
            }
        })
    }

    fun getPhotos() = photosDao.getPhotos()

    fun insertPhoto(photo: Photo) {
        photosDao.insertPhoto(photo.toEntity())
    }
}