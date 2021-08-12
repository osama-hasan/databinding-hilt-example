package com.example.daggerhiltexample.repo

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.asLiveData
import com.example.daggerhiltexample.db.DataBaseHelperImpl
import com.example.daggerhiltexample.db.DatabaseHelper
import com.example.daggerhiltexample.enums.Resource
import com.example.daggerhiltexample.model.TvShow
import com.example.daggerhiltexample.network.ApiService
import com.example.daggerhiltexample.model.TvShowResponse
import com.example.daggerhiltexample.network.ApiHelper
import com.example.daggerhiltexample.network.ApiHelperImpl
import com.example.daggerhiltexample.network.BaseApiResponse
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

import javax.inject.Inject

@ActivityRetainedScoped
class TvShowsRepo @Inject constructor(
    private val apiHelperImpl: ApiHelperImpl,
    private val databaseHelper: DataBaseHelperImpl
) :
    BaseApiResponse() {


    suspend fun getTvShows(page: Int): Flow<Resource<TvShowResponse>> {
        return flow<Resource<TvShowResponse>> {
            emit(safeApiCall {
                apiHelperImpl.getTvShows(page)

            }
            )
        }.flowOn(Dispatchers.IO)
    }

    suspend fun getTvShowsFromApi(page: Int) = apiHelperImpl.getTvShows(page)

    fun getTvShowsFromLocal() = databaseHelper.getTvShowFromDb()

    suspend fun insetTvShowsToDatabase(tvShows: List<TvShow>) {

        GlobalScope.launch {
            for (tv in tvShows){
                databaseHelper.insertTvShow(tv)
            }

        }

    }


}