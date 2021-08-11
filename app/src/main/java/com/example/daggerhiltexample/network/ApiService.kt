package com.example.daggerhiltexample.network

import com.example.daggerhiltexample.model.TvShowResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("most-popular")
    fun getMovies(@Query("page") page: Int): Call<TvShowResponse>
}