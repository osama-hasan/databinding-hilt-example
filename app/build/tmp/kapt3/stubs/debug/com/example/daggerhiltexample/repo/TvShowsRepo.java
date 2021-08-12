package com.example.daggerhiltexample.repo;

import java.lang.System;

@dagger.hilt.android.scopes.ActivityRetainedScoped()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/daggerhiltexample/repo/TvShowsRepo;", "Lcom/example/daggerhiltexample/network/BaseApiResponse;", "apiHelperImpl", "Lcom/example/daggerhiltexample/network/ApiHelperImpl;", "(Lcom/example/daggerhiltexample/network/ApiHelperImpl;)V", "getTvShows", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/daggerhiltexample/enums/Resource;", "Lcom/example/daggerhiltexample/model/TvShowResponse;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class TvShowsRepo extends com.example.daggerhiltexample.network.BaseApiResponse {
    private final com.example.daggerhiltexample.network.ApiHelperImpl apiHelperImpl = null;
    
    @javax.inject.Inject()
    public TvShowsRepo(@org.jetbrains.annotations.NotNull()
    com.example.daggerhiltexample.network.ApiHelperImpl apiHelperImpl) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTvShows(int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.example.daggerhiltexample.enums.Resource<com.example.daggerhiltexample.model.TvShowResponse>>> continuation) {
        return null;
    }
}