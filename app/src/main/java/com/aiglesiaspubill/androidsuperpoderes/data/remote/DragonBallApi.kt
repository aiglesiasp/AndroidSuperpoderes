package com.aiglesiaspubill.androidsuperpoderes.data.remote

import com.aiglesiaspubill.androidsuperpoderes.data.remote.request.HeroRequest
import com.aiglesiaspubill.androidsuperpoderes.domain.Hero
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface DragonBallApi {
    //LLAMADA A BOOTCAMPS DE LA API DE DRAGONBALL
    @POST("/api/auth/login")
    suspend fun login(@Header("Authorization") token: String): String

    @POST("api/heros/all")
    suspend fun getHeros(@Body heroRequest: HeroRequest, @Header("Authorization") token: String): List<Hero>
}
