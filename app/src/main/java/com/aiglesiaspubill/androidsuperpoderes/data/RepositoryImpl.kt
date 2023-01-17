package com.aiglesiaspubill.androidsuperpoderes.data

import com.aiglesiaspubill.androidsuperpoderes.data.remote.RemoteDataSource
import com.aiglesiaspubill.androidsuperpoderes.data.remote.RemoteDataSourceImpl
import com.aiglesiaspubill.androidsuperpoderes.domain.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val remoteDataSource: RemoteDataSource): Repository {

    override suspend fun login(email: String, password: String) {
        remoteDataSource.login(email, password)
    }
}