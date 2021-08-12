package com.example.daggerhiltexample.network

import com.example.daggerhiltexample.model.TvShowResponse
import retrofit2.Response

interface ApiHelper {

    suspend fun getTvShows(): Response<TvShowResponse>
}