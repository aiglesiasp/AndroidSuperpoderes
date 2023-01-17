package com.aiglesiaspubill.androidsuperpoderes.data.remote

interface RemoteDataSource {

    suspend fun login(email: String, password: String)
}
