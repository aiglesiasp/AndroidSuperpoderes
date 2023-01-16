package com.aiglesiaspubill.androidsuperpoderes.data.remote

interface RemoteDataSource {

    suspend fun getToken(): Result<String>
}
