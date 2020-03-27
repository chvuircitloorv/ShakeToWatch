package com.example.shaketowatch.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object TheMovieApi {

    private val okHttpClient: OkHttpClient = OkHttpClient().newBuilder()
        .addInterceptor(ApiKeyInterceptor())
        .build()

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://api.themoviedb.org/3/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()

    fun api(): TheMovieService = retrofit.create(TheMovieService::class.java)
}