package com.example.daggerhiltexample.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "tv_show")
data class TvShow(
    @PrimaryKey val id: Int,
    val name: String,
    val permalink: String,
    @SerializedName("start_date") val startDate: String = "",
    @SerializedName("end_date") val endDate: String?,
    val country: String,
    val network: String,
    val status: String,
    @SerializedName("image_thumbnail_path") val coverImage: String

)