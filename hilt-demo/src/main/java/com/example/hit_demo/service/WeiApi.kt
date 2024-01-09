package com.example.hit_demo.service

import retrofit2.http.GET

interface WeiApi {
    @GET("banner")
    suspend fun getBanner()
}