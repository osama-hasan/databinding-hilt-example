package com.example.daggerhiltexample.repo

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.daggerhiltexample.network.ApiService
import com.example.daggerhiltexample.model.TvShowResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

import javax.inject.Inject

class TvShowsRepo @Inject constructor(private val networkService: ApiService) {

    private var tvShows = MutableLiveData<TvShowResponse>()


    fun getMovies(page: Int): MutableLiveData<TvShowResponse> {

        networkService.getMovies(page).enqueue(object : Callback<TvShowResponse> {
            override fun onResponse(
                call: Call<TvShowResponse>,
                response: Response<TvShowResponse>
            ) {
                if (response.isSuccessful) {
                    tvShows.value = response.body()
                }else{
                    Log.d("osama", "error")
                }
            }

            override fun onFailure(call: Call<TvShowResponse>, t: Throwable) {
                Log.d("osama", "${t.message} ${t.cause}")
            }

        })



        return tvShows
    }

}