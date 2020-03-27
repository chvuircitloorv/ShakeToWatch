package com.example.shaketowatch.api.model

import com.google.gson.annotations.SerializedName

data class Movie(
    @SerializedName("id") val id: Int,
    @SerializedName("original_title") val originalTitle: String
)