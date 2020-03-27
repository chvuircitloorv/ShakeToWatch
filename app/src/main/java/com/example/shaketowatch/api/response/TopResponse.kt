package com.example.shaketowatch.api.response

import com.example.shaketowatch.api.model.Movie
import com.google.gson.annotations.SerializedName

data class TopResponse(
    @SerializedName("page") val page: Int,
    @SerializedName("results") val movies: List<Movie>
)