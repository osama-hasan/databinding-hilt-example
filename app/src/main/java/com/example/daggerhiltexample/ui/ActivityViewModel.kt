package com.example.daggerhiltexample.ui

import android.util.Log
import androidx.lifecycle.*
import com.example.daggerhiltexample.enums.Resource
import com.example.daggerhiltexample.model.TvShowResponse
import com.example.daggerhiltexample.network.NetworkHelper
import com.example.daggerhiltexample.repo.TvShowsRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.sample
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class ActivityViewModel @Inject constructor(
    private val tvShowsRepo: TvShowsRepo,
    private val networkHelper: NetworkHelper
) : ViewModel() {


    private var tvShowsResponse = MutableLiveData<Resource<TvShowResponse>>()



    private fun setTvShows(page: Int) = viewModelScope.launch {
        tvShowsRepo.getTvShows(page).collect {
            tvShowsResponse.postValue(it)
        }
    }

    fun getTvShows(page: Int): MutableLiveData<Resource<TvShowResponse>> {
        setTvShows(page)
        return tvShowsResponse
    }


}