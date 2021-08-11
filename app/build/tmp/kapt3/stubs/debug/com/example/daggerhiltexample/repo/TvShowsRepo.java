package com.example.daggerhiltexample.repo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/daggerhiltexample/repo/TvShowsRepo;", "", "networkService", "Lcom/example/daggerhiltexample/ApiService;", "(Lcom/example/daggerhiltexample/ApiService;)V", "tvShows", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/daggerhiltexample/TvShowResponse;", "getMovies", "page", "", "app_debug"})
public final class TvShowsRepo {
    private final com.example.daggerhiltexample.ApiService networkService = null;
    private androidx.lifecycle.MutableLiveData<com.example.daggerhiltexample.TvShowResponse> tvShows;
    
    @javax.inject.Inject()
    public TvShowsRepo(@org.jetbrains.annotations.NotNull()
    com.example.daggerhiltexample.ApiService networkService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.daggerhiltexample.TvShowResponse> getMovies(int page) {
        return null;
    }
}