package com.geeks.jsonplaceholderapi.ui.fragments.home

import androidx.lifecycle.ViewModel
import com.geeks.jsonplaceholderapi.data.PhotosRepository

class HomeViewModel : ViewModel() {

    private val photosRepository = PhotosRepository()

    fun getPhotos() = photosRepository.getPhotos()
}