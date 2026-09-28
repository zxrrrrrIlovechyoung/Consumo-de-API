package com.example.ejemlolistas.Network
import com.example.ejemlolistas.User
import retrofit2.http.GET

interface ApiService {

    @GET("users")
    suspend fun getUsers(): List<User>

}