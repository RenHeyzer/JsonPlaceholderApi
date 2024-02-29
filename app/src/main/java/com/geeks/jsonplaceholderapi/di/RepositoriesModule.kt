package com.geeks.jsonplaceholderapi.di

import com.geeks.jsonplaceholderapi.data.PhotosRepository
import com.geeks.jsonplaceholderapi.data.local.room.dao.PhotosDao
import com.geeks.jsonplaceholderapi.data.remote.apiservices.PhotosApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object RepositoriesModule {

    @Provides
    @ViewModelScoped
    fun providePhotosRepository(photosApiService: PhotosApiService, photosDao: PhotosDao) =
        PhotosRepository(photosApiService, photosDao)
}