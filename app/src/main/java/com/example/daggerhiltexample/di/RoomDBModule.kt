package com.example.daggerhiltexample.di

import android.content.Context
import androidx.room.Room
import com.example.daggerhiltexample.AppDatabase
import com.example.daggerhiltexample.TvShowDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomDBModule {

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context,@AppDatabaseName name:String): AppDatabase =
        Room.databaseBuilder(
            context,
            AppDatabase::class.java, name
        ).fallbackToDestructiveMigration().build()

    @Provides
    fun provideTvShowsDAO(appDatabase:AppDatabase) : TvShowDao {

        return appDatabase.tvShowDao()
    }

    @AppDatabaseName
    @Provides
    fun provideDatabaseName() :String = "tv_shows_db"
}