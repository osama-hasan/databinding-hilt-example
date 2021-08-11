package com.example.daggerhiltexample;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/daggerhiltexample/ActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "tvShowsRepo", "Lcom/example/daggerhiltexample/repo/TvShowsRepo;", "(Lcom/example/daggerhiltexample/repo/TvShowsRepo;)V", "tvShowsResponse", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/daggerhiltexample/TvShowResponse;", "getTvShows", "Landroidx/lifecycle/LiveData;", "page", "", "app_debug"})
public final class ActivityViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.daggerhiltexample.repo.TvShowsRepo tvShowsRepo = null;
    private androidx.lifecycle.MutableLiveData<com.example.daggerhiltexample.TvShowResponse> tvShowsResponse;
    
    @javax.inject.Inject()
    public ActivityViewModel(@org.jetbrains.annotations.NotNull()
    com.example.daggerhiltexample.repo.TvShowsRepo tvShowsRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.daggerhiltexample.TvShowResponse> getTvShows(int page) {
        return null;
    }
}