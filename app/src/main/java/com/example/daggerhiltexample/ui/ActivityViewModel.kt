package com.example.daggerhiltexample.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.daggerhiltexample.model.TvShowResponse
import com.example.daggerhiltexample.repo.TvShowsRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ActivityViewModel @Inject constructor(private val tvShowsRepo:TvShowsRepo): ViewModel() {


    private var tvShowsResponse = MutableLiveData<TvShowResponse>()

    fun getTvShows(page:Int):LiveData<TvShowResponse>{
        if (tvShowsResponse.value == null){
            Log.d("osama","null value")
            tvShowsResponse = tvShowsRepo.getMovies(page)
            Log.d("osama","$tvShowsRepo")
        }


        return tvShowsResponse
    }



}