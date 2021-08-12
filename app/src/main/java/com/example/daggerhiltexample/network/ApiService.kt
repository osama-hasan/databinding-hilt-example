package com.example.daggerhiltexample.network

import com.example.daggerhiltexample.model.TvShowResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("most-popular")
    suspend fun getMovies(): Response<TvShowResponse>
}