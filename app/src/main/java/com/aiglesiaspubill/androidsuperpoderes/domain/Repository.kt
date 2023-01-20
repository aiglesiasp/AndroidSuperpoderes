package com.aiglesiaspubill.androidsuperpoderes.domain

import kotlinx.coroutines.flow.Flow

interface Repository {
    suspend fun login(email:String, password: String): Boolean
    suspend fun getHeros(): Flow<List<Hero>>
}