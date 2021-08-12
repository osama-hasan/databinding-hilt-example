package com.example.daggerhiltexample.di

import javax.inject.Qualifier


@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class AppDatabaseName()
