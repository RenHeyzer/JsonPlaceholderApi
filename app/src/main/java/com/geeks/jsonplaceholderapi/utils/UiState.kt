package com.geeks.jsonplaceholderapi.utils

sealed class UiState<T> {

    class Loading<T> : UiState<T>()

    data class Error<T>(val message: String? = null, val t: Throwable) : UiState<T>()

    data class Success<T>(val data: T? = null) : UiState<T>()
}