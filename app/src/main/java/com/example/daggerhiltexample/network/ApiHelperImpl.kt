package com.example.daggerhiltexample.network

import com.example.daggerhiltexample.model.TvShowResponse
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ApiHelperImpl @Inject constructor(private val networkService:ApiService): ApiHelper {


    override suspend fun getTvShows(): Response<TvShowResponse> = networkService.getMovies()

}