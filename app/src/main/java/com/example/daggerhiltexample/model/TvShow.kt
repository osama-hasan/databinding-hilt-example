package com.example.daggerhiltexample.model

import com.google.gson.annotations.SerializedName


data class TvShow(
    val id: Int,
    val name: String,
    val permalink: String,
    @SerializedName("start_date") val startDate: String,
    @SerializedName("end_date") val endDate: String,
    val country: String,
    val network: String,
    val status: String,
    @SerializedName("image_thumbnail_path") val coverImage: String

)