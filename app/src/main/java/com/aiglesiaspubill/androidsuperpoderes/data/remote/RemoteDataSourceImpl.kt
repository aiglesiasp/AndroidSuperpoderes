package com.aiglesiaspubill.androidsuperpoderes.data.remote

import com.aiglesiaspubill.androidsuperpoderes.data.remote.request.HeroRequest
import com.aiglesiaspubill.androidsuperpoderes.domain.Hero
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import okhttp3.Credentials
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(private val api: DragonBallApi) : RemoteDataSource {
    //OBTENER TOKEN
    override suspend fun login(email: String, password: String): String {
        val result = api.login(Credentials.basic(email, password))
        return result
    }

    override suspend fun getHeros(token: String): Flow<List<Hero>> {
        val result = api.getHeros(HeroRequest(), "Bearer $token")
        return flow { emit(result) }.map { heroList -> heroList.filter { hero -> hero.photo.contains("alfabetajuega") } }
    }
}