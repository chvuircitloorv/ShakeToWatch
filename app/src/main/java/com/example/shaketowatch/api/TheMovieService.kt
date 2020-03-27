package com.example.shaketowatch.api

import com.example.shaketowatch.api.response.TopResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TheMovieService {

    @GET("movie/top_rated")
    fun loadTopList(@Query("page") page: Int): Call<TopResponse>
}