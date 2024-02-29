package com.geeks.jsonplaceholderapi.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.geeks.jsonplaceholderapi.App
import com.geeks.jsonplaceholderapi.R
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Retrofit
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}