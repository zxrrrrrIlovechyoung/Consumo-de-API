package com.example.ejemlolistas.Network

import com.example.ejemlolistas.Network.ApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

internal class {
    var RetrofitClient: `object`? = null
    var BASE_URL: `val` = "https://jsonplaceholder.typicode.com/"

    var api: `val`? = null
    var by: ApiService? = null
    fun lazy() {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::ApiService::)
        java
    }
}