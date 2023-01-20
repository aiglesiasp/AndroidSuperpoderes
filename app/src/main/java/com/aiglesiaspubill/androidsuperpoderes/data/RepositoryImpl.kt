package com.aiglesiaspubill.androidsuperpoderes.data

import com.aiglesiaspubill.androidsuperpoderes.data.remote.RemoteDataSource
import com.aiglesiaspubill.androidsuperpoderes.data.remote.RemoteDataSourceImpl
import com.aiglesiaspubill.androidsuperpoderes.domain.Hero
import com.aiglesiaspubill.androidsuperpoderes.domain.Repository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RepositoryImpl @Inject constructor(private val remoteDataSource: RemoteDataSourceImpl): Repository {

    private lateinit var token: String

    override suspend fun login(email: String, password: String): Boolean {
        val token = remoteDataSource.login(email, password)
        this.token = token
        return token.isNotBlank()
    }

    override suspend fun getHeros(): Flow<List<Hero>> {
        return remoteDataSource.getHeros(token)
    }
}