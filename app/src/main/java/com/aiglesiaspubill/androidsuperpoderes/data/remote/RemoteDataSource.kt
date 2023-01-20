package com.aiglesiaspubill.androidsuperpoderes.data.remote

import com.aiglesiaspubill.androidsuperpoderes.domain.Hero
import kotlinx.coroutines.flow.Flow

interface RemoteDataSource {

    suspend fun login(email: String, password: String): String
    suspend fun getHeros(token: String) : Flow<List<Hero>>
}
