package com.example.daggerhiltexample.db

import com.example.daggerhiltexample.model.TvShow
import kotlinx.coroutines.flow.Flow

interface DatabaseHelper {

     fun getTvShowFromDb() : Flow<List<TvShow>>
    suspend fun insertTvShows(shows :List<TvShow>)
    suspend fun insertTvShow(shows :TvShow)

}