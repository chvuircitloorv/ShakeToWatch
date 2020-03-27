package com.example.shaketowatch.api

import okhttp3.Interceptor
import okhttp3.Response

class ApiKeyInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val url = chain.request().url.newBuilder().addQueryParameter("api_key", "4c7e796b5b1ef45a32fd3daac02cb36e").build()
        return chain.proceed(chain.request().newBuilder().url(url).build())
    }
}