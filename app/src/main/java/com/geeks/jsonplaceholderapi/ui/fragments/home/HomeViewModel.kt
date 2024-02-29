package com.geeks.jsonplaceholderapi.ui.fragments.home

import androidx.lifecycle.ViewModel
import com.geeks.jsonplaceholderapi.data.PhotosRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val photosRepository: PhotosRepository
) : ViewModel() {

    fun getPhotos() = photosRepository.getPhotos()
}