package com.geeks.jsonplaceholderapi.ui.fragments.insert

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.geeks.jsonplaceholderapi.data.PhotosRepository
import com.geeks.jsonplaceholderapi.data.remote.models.Photo
import com.geeks.jsonplaceholderapi.utils.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class InsertViewModel @Inject constructor(
    private val photosRepository: PhotosRepository
) : ViewModel() {

    private val _photoLiveData = MutableLiveData<UiState<Photo>>(UiState.Loading())
    val photoLiveData: LiveData<UiState<Photo>> = _photoLiveData

    fun addPhoto(photo: Photo) {
        photosRepository.addPhoto(
            photo = photo,
            onResponse = {
                photosRepository.insertPhoto(photo)
                _photoLiveData.value = UiState.Success(photo)
            },
            onFailure = { message, t ->
                Log.e("addPhoto", message, t)
                _photoLiveData.value = UiState.Error(message, t)
            }
        )
    }
}