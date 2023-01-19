package com.aiglesiaspubill.androidsuperpoderes.data.remote

import com.aiglesiaspubill.androidsuperpoderes.data.remote.request.HeroRequest
import com.aiglesiaspubill.androidsuperpoderes.domain.Hero
import okhttp3.Credentials
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(private val api: DragonBallApi) : RemoteDataSource {
    //OBTENER TOKEN
    override suspend fun login(email: String, password: String): String {
        val result = api.login(Credentials.basic(email, password))
        return result
    }

    override suspend fun getHeros(token: String): List<Hero> {
        val result = api.getHeros(HeroRequest(), token)
        return result
    }
}