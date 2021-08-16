package com.example.daggerhiltexample

import androidx.room.*
import com.example.daggerhiltexample.model.TvShow
import kotlinx.coroutines.flow.Flow

@Dao
interface TvShowDao {

    @Query("SELECT * FROM tv_show")
    fun getAll(): Flow<List<TvShow>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg tvShows: TvShow)



    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertList(shows:List<TvShow>)

    @Delete
    fun delete(tvShow: TvShow )

    @Query("DELETE FROM tv_show")
    suspend fun clearAll()
}