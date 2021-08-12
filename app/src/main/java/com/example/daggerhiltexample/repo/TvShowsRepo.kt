package com.example.daggerhiltexample.repo

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.asLiveData
import com.example.daggerhiltexample.enums.Resource
import com.example.daggerhiltexample.network.ApiService
import com.example.daggerhiltexample.model.TvShowResponse
import com.example.daggerhiltexample.network.ApiHelper
import com.example.daggerhiltexample.network.ApiHelperImpl
import com.example.daggerhiltexample.network.BaseApiResponse
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

import javax.inject.Inject

@ActivityRetainedScoped
class TvShowsRepo @Inject constructor(private val apiHelperImpl: ApiHelperImpl) :
    BaseApiResponse() {


    suspend fun getTvShows(page: Int): Flow<Resource<TvShowResponse>> {
        return flow<Resource<TvShowResponse>> {
            emit(safeApiCall { apiHelperImpl.getTvShows(page) }
            )
        }.flowOn(Dispatchers.IO)
    }

//    suspend fun getTvShows(page:Int) = apiHelperImpl.getTvShows(page)

//    private var tvShows = MutableLiveData<TvShowResponse>()
//
//
//    fun getMovies(page: Int): MutableLiveData<TvShowResponse> {
//
//        networkService.getMovies(page).enqueue(object : Callback<TvShowResponse> {
//            override fun onResponse(
//                call: Call<TvShowResponse>,
//                response: Response<TvShowResponse>
//            ) {
//                if (response.isSuccessful) {
//                    tvShows.value = response.body()
//                }else{
//                    Log.d("osama", "error")
//                }
//            }
//
//            override fun onFailure(call: Call<TvShowResponse>, t: Throwable) {
//                Log.d("osama", "${t.message} ${t.cause}")
//            }
//
//        })
//
//
//
//        return tvShows
//    }

}