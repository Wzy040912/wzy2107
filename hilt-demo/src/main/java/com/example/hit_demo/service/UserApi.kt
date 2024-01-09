package com.example.hit_demo.service

import com.example.hit_demo.bean.Banner
import retrofit2.http.GET
import retrofit2.http.Query

interface UserApi {
    @GET("/banner/select")
    suspend fun getUserInfo(@Query("type")type:Int,
                            @Query("page")page:Int,
                            @Query("pageSize")pageSize:Int):Banner // 返回值为String，实际类型为Response<String>

}