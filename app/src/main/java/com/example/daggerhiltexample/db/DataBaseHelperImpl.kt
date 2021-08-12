package com.example.daggerhiltexample.db

import com.example.daggerhiltexample.TvShowDao
import com.example.daggerhiltexample.model.TvShow
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class DataBaseHelperImpl @Inject constructor(private val dao: TvShowDao) : DatabaseHelper {


    override fun getTvShowFromDb(): Flow<List<TvShow>> = dao.getAll()
    override suspend fun insertTvShows(shows: List<TvShow>) {

        dao.insertList(shows)
    }

    override suspend fun insertTvShow(shows: TvShow) {
        dao.insertAll(shows)
    }
}