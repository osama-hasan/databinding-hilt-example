package com.example.daggerhiltexample.model

import com.google.gson.annotations.SerializedName

data class TvShowResponse(
    val total: String,
    val page: Int,
    val pages: Int,
    @SerializedName("tv_shows") val tvShows: List<TvShow>
)