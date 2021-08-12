package com.example.daggerhiltexample

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.daggerhiltexample.model.TvShow


@Database(entities = [TvShow::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun tvShowDao(): TvShowDao
}