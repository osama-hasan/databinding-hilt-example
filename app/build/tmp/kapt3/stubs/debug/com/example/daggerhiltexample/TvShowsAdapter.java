package com.example.daggerhiltexample;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/daggerhiltexample/TvShowsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/daggerhiltexample/TvShowsAdapter$TvShowsViewHolder;", "shows", "", "Lcom/example/daggerhiltexample/TvShow;", "(Ljava/util/List;)V", "binding", "Lcom/example/daggerhiltexample/databinding/CustomTvShowLayoutBinding;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "TvShowsViewHolder", "app_debug"})
public final class TvShowsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.daggerhiltexample.TvShowsAdapter.TvShowsViewHolder> {
    private final java.util.List<com.example.daggerhiltexample.TvShow> shows = null;
    private com.example.daggerhiltexample.databinding.CustomTvShowLayoutBinding binding;
    
    public TvShowsAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.daggerhiltexample.TvShow> shows) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.daggerhiltexample.TvShowsAdapter.TvShowsViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.daggerhiltexample.TvShowsAdapter.TvShowsViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/daggerhiltexample/TvShowsAdapter$TvShowsViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/daggerhiltexample/databinding/CustomTvShowLayoutBinding;", "(Lcom/example/daggerhiltexample/databinding/CustomTvShowLayoutBinding;)V", "bind", "", "tvShow", "Lcom/example/daggerhiltexample/TvShow;", "app_debug"})
    public static final class TvShowsViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.example.daggerhiltexample.databinding.CustomTvShowLayoutBinding binding = null;
        
        public TvShowsViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.daggerhiltexample.databinding.CustomTvShowLayoutBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.daggerhiltexample.TvShow tvShow) {
        }
    }
}