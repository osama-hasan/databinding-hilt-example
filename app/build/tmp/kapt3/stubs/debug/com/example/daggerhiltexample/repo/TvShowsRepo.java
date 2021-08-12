package com.example.daggerhiltexample.repo;

import java.lang.System;

@dagger.hilt.android.scopes.ActivityRetainedScoped()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\bJ\u001f\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/example/daggerhiltexample/repo/TvShowsRepo;", "Lcom/example/daggerhiltexample/network/BaseApiResponse;", "apiHelperImpl", "Lcom/example/daggerhiltexample/network/ApiHelperImpl;", "databaseHelper", "Lcom/example/daggerhiltexample/db/DataBaseHelperImpl;", "(Lcom/example/daggerhiltexample/network/ApiHelperImpl;Lcom/example/daggerhiltexample/db/DataBaseHelperImpl;)V", "getTvShows", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/daggerhiltexample/enums/Resource;", "Lcom/example/daggerhiltexample/model/TvShowResponse;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTvShowsFromApi", "Lretrofit2/Response;", "getTvShowsFromLocal", "", "Lcom/example/daggerhiltexample/model/TvShow;", "insetTvShowsToDatabase", "", "tvShows", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class TvShowsRepo extends com.example.daggerhiltexample.network.BaseApiResponse {
    private final com.example.daggerhiltexample.network.ApiHelperImpl apiHelperImpl = null;
    private final com.example.daggerhiltexample.db.DataBaseHelperImpl databaseHelper = null;
    
    @javax.inject.Inject()
    public TvShowsRepo(@org.jetbrains.annotations.NotNull()
    com.example.daggerhiltexample.network.ApiHelperImpl apiHelperImpl, @org.jetbrains.annotations.NotNull()
    com.example.daggerhiltexample.db.DataBaseHelperImpl databaseHelper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTvShows(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.example.daggerhiltexample.enums.Resource<com.example.daggerhiltexample.model.TvShowResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTvShowsFromApi(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.daggerhiltexample.model.TvShowResponse>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.daggerhiltexample.model.TvShow>> getTvShowsFromLocal() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insetTvShowsToDatabase(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.daggerhiltexample.model.TvShow> tvShows, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}