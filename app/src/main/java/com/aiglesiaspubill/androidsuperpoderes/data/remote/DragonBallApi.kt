package com.aiglesiaspubill.androidsuperpoderes.data.remote

import retrofit2.http.POST

interface DragonBallApi {
    //LLAMADA A BOOTCAMPS DE LA API DE DRAGONBALL
    @POST("/api/auth/login")
    suspend fun getToken(): String
}
